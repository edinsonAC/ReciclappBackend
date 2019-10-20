package com.reciclapp.services;

import java.util.List;

import com.reciclapp.entitys.Usuario;

public interface IUsuarioService {

	List<Usuario> listarUsuarios();
	
	Usuario findByEmail(String username);
	
	Usuario registrarUsuario(Usuario user);
	
	Usuario editarUsuario(Usuario user);
	
	
	
}
