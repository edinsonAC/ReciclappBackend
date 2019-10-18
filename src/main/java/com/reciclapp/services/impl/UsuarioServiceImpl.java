package com.reciclapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reciclapp.dao.IUsuarioDAO;
import com.reciclapp.entitys.Persona;
import com.reciclapp.entitys.Usuario;
import com.reciclapp.services.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDAO usuarioDao;

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

}
