package com.apiscm.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apiscm.dao.IUsuarioDAO;
import com.apiscm.entitys.Role;
import com.apiscm.entitys.Usuario;

@Service
public class UserService implements UserDetailsService {

	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private IUsuarioDAO usuarioDao;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByUsername(username);
		boolean enabled = false;

		System.out.println("llega >>>>>>>>>>>>>>>>>>  " + username);

		if (usuario == null) {
			throw new UsernameNotFoundException(
					"Error en el login: no existe el usuario  '" + username + "' en el sistema");
		}else {
			enabled = true;
		}

		List<Role> roles = new ArrayList<>();
		roles.add(usuario.getRol());
		// se agregan los roles que posee el usuario

		List<GrantedAuthority> authorities = roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role : " + authority.getAuthority())).collect(Collectors.toList());

		return new User(usuario.getUsuario(), usuario.getPassword(), enabled, true, true, true, authorities);
	}

}
