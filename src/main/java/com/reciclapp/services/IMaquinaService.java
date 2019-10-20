package com.reciclapp.services;

import java.util.List;

import com.reciclapp.entitys.Maquina;

public interface IMaquinaService {

	List<Maquina> listarMaquinas();

	Maquina registrarMaquina(Maquina maquina);

	Maquina buscarMaquinaPorId(long id);

	Maquina editarMaquina(Maquina maquina);
}
