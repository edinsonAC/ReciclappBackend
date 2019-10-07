package com.apiscm.services;

import java.util.List;

import com.apiscm.entitys.Persona;
import com.apiscm.entitys.Usuario;

public interface IUsuarioService {

	List<Usuario> listarUsuarios();
	
	Usuario findByUsername(String username);
	
}
