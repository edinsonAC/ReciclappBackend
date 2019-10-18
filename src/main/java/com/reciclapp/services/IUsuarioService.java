package com.reciclapp.services;

import java.util.List;

import com.reciclapp.entitys.Persona;
import com.reciclapp.entitys.Usuario;

public interface IUsuarioService {

	List<Usuario> listarUsuarios();
	
	Usuario findByEmail(String username);
	
}
