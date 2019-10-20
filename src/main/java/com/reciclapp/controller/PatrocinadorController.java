package com.reciclapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.reciclapp.entitys.Patrocinador;
import com.reciclapp.services.IPatrocinadorService;

@RestController
@RequestMapping("/api/patrocinador")
public class PatrocinadorController {

	@Autowired
	IPatrocinadorService patrocinadorService;

	@GetMapping("/listarPatrocinadores")
	public List<Patrocinador> listarCupones() {
		return patrocinadorService.listarPatrocinadores();
	}

	@GetMapping("/buscarPatrocinador/{id}")
	public Patrocinador buscarJugadorPorId(@PathVariable Long id) {
		return this.patrocinadorService.buscarPatrocinadorPorId(id);
	}

	@PostMapping("/crearPatrocinador")
	@ResponseStatus(HttpStatus.CREATED)
	public Patrocinador create(@RequestBody Patrocinador patrocinador) {
		this.patrocinadorService.registrarPatrocinador(patrocinador);
		return patrocinador;
	}

	@PutMapping("/editarPatrocinador/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Patrocinador update(@RequestBody Patrocinador patrocinador, @PathVariable Long id) {
		Patrocinador currentPatrocinador = this.patrocinadorService.buscarPatrocinadorPorId(id);

		if (currentPatrocinador != null) {
			this.patrocinadorService.editarPatrocinador(patrocinador);
		}

		return patrocinador;
	}
}
