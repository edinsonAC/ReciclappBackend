package com.reciclapp.services;

import java.util.List;

import com.reciclapp.entitys.Residuo;

public interface IResiduoService {

	List<Residuo> listarResiduos();

	Residuo registrarResiduo(Residuo residuo);

	Residuo editarResiduo(Residuo residuo);

	Residuo buscarResiduoPorId(long id);
}
