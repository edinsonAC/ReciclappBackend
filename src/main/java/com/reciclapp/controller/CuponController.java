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

import com.reciclapp.entitys.Cupon;
import com.reciclapp.services.ICuponService;

@RestController
@RequestMapping("/api/cupon")
public class CuponController {

	@Autowired
	ICuponService cuponService;

	@GetMapping("/listarCupones")
	public List<Cupon> listarCupones() {
		return cuponService.listarCupones();
	}

	@GetMapping("/buscarCupon/{id}")
	public Cupon buscarJugadorPorId(@PathVariable Long id) {
		return this.cuponService.buscarCuponPorId(id);
	}

	@PostMapping("/crearCupon")
	@ResponseStatus(HttpStatus.CREATED)
	public Cupon create(@RequestBody Cupon cupon) {
		this.cuponService.registrarCupon(cupon);
		return cupon;
	}

	@PutMapping("/editarCupon/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cupon update(@RequestBody Cupon cupon, @PathVariable Long id) {
		Cupon currentCupon = this.cuponService.buscarCuponPorId(id);

		if (currentCupon != null) {
			this.cuponService.editarCupon(cupon);
		}

		return cupon;
	}

}
