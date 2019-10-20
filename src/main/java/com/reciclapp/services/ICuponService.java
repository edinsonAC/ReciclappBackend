package com.reciclapp.services;

import java.util.List;

import com.reciclapp.entitys.Cupon;

public interface ICuponService {

	List<Cupon> listarCupones();

	Cupon registrarCupon(Cupon cupon);

	Cupon buscarCuponPorId(long id);

	Cupon editarCupon(Cupon cupon);
}
