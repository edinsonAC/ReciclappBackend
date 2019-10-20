package com.reciclapp.services;

import java.util.List;

import com.reciclapp.entitys.Patrocinador;

public interface IPatrocinadorService {

	List<Patrocinador> listarPatrocinadores();

	Patrocinador buscarPatrocinadorPorId(long id);

	Patrocinador registrarPatrocinador(Patrocinador patrocinador);

	Patrocinador editarPatrocinador(Patrocinador patrocinador);

}
