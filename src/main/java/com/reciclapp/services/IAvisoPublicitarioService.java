package com.reciclapp.services;

import java.util.List;

import com.reciclapp.entitys.AvisoPublicitario;

public interface IAvisoPublicitarioService {

	List<AvisoPublicitario> listarAvisosPublicitarios();

	AvisoPublicitario registrarAvisoPublicitario(AvisoPublicitario aviso);

	AvisoPublicitario buscarAvisoPorId(long id);

	AvisoPublicitario editarAvisoPublictario(AvisoPublicitario aviso);
}
