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

import com.reciclapp.entitys.Residuo;
import com.reciclapp.services.IResiduoService;


@RestController
@RequestMapping("/api/residuo")
public class ResiduoController {

	
	@Autowired
	IResiduoService residuoService;

	@GetMapping("/listarResiduos")
	public List<Residuo> listarResiduo() {
		return residuoService.listarResiduos();
	}

	@GetMapping("/buscarResiduo/{id}")
	public Residuo buscarJugadorPorId(@PathVariable Long id) {
		return this.residuoService.buscarResiduoPorId(id);
	}

	@PostMapping("/crearResiduo")
	@ResponseStatus(HttpStatus.CREATED)
	public Residuo create(@RequestBody Residuo residuo) {
		this.residuoService.registrarResiduo(residuo);
		return residuo;
	}

	@PutMapping("/editarResiduo/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Residuo update(@RequestBody Residuo residuo, @PathVariable Long id) {
		Residuo currentResiduo = this.residuoService.buscarResiduoPorId(id);

		if (currentResiduo != null) {
			this.residuoService.editarResiduo(residuo);
		}

		return residuo;
	}
}
