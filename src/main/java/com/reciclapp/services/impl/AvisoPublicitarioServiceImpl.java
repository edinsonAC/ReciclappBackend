package com.reciclapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reciclapp.dao.IAvisoPublicitarioDAO;
import com.reciclapp.entitys.AvisoPublicitario;
import com.reciclapp.services.IAvisoPublicitarioService;

@Service
public class AvisoPublicitarioServiceImpl implements IAvisoPublicitarioService {

	@Autowired
	IAvisoPublicitarioDAO avisoDao;

	@Override
	public List<AvisoPublicitario> listarAvisosPublicitarios() {
		// TODO Auto-generated method stub
		return avisoDao.findAll();
	}

	@Override
	public AvisoPublicitario registrarAvisoPublicitario(AvisoPublicitario aviso) {
		// TODO Auto-generated method stub
		return avisoDao.save(aviso);
	}

	@Override
	public AvisoPublicitario buscarAvisoPorId(long id) {
		// TODO Auto-generated method stub
		return avisoDao.findById(id).orElse(null);
	}

	@Override
	public AvisoPublicitario editarAvisoPublictario(AvisoPublicitario aviso) {
		// TODO Auto-generated method stub
		return avisoDao.save(aviso);
	}

}
