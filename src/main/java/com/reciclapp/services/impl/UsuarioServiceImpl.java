package com.reciclapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.reciclapp.dao.IUsuarioDAO;
import com.reciclapp.entitys.Usuario;
import com.reciclapp.services.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDAO usuarioDao;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public List<Usuario> listarUsuarios() {
		// TODO Auto-generated method stub
		return usuarioDao.findAll();
	}

	@Override
	public Usuario findByEmail(String username) {
		// TODO Auto-generated method stub
		return usuarioDao.findByEmail(username);
	}

	@Override
	public Usuario registrarUsuario(Usuario user) {
		// TODO Auto-generated method stub
		user.setPassword(passwordEncoder.encode(user.getPassword()));

		return usuarioDao.save(user);
	}

	@Override
	public Usuario editarUsuario(Usuario user) {
		// TODO Auto-generated method stub
		return usuarioDao.save(user);
	}

	@Override
	public Usuario buscarUsuarioPorId(long id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).orElse(null);
	}

}
