package com.reciclapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.reciclapp.entitys.*;
import com.reciclapp.services.IUsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping(value = "/listarUsuarios")
	public ResponseEntity<List<Usuario>> listarUsuarios() {
		ArrayList<Usuario> us = (ArrayList<Usuario>) usuarioService.listarUsuarios();
		return new ResponseEntity<List<Usuario>>(usuarioService.listarUsuarios(), HttpStatus.OK);
	}
	
	
	@GetMapping("/buscarUsuario/{id}")
	public Usuario buscarUsuarioPorId(@PathVariable Long id) {
		return this.usuarioService.buscarUsuarioPorId(id);
	}

	@PostMapping("/crearUsuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		this.usuarioService.registrarUsuario(usuario);
		return usuario;
	}

	@PutMapping("/editarUsuario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario currentResiduo = this.usuarioService.buscarUsuarioPorId(id);

		if (currentResiduo != null) {
			this.usuarioService.editarUsuario(usuario);
		}

		return usuario;
	}
}
