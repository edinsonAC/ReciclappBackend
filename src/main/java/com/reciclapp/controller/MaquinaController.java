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

import com.reciclapp.entitys.Maquina;
import com.reciclapp.services.IMaquinaService;

@RestController
@RequestMapping("/api/maquina")
public class MaquinaController {

	@Autowired
	IMaquinaService maquinaService;

	@GetMapping(value = "/listarMaquinas")
	public ResponseEntity<List<Maquina>> listarMaquinas() {
		ArrayList<Maquina> us = (ArrayList<Maquina>) maquinaService.listarMaquinas();
		return new ResponseEntity<List<Maquina>>(maquinaService.listarMaquinas(), HttpStatus.OK);
	}

	@GetMapping("/buscarMaquina/{id}")
	public Maquina buscarMaquinaPorId(@PathVariable Long id) {
		return this.maquinaService.buscarMaquinaPorId(id);
	}

	@PostMapping("/crearMaquina")
	@ResponseStatus(HttpStatus.CREATED)
	public Maquina create(@RequestBody Maquina maquina) {
		this.maquinaService.registrarMaquina(maquina);
		return maquina;
	}

	@PutMapping("/editarResiduo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Maquina update(@RequestBody Maquina maquina, @PathVariable Long id) {
		Maquina currentMaquina = this.maquinaService.buscarMaquinaPorId(id);

		if (currentMaquina != null) {
			this.maquinaService.editarMaquina(maquina);
		}

		return maquina;
	}
}
