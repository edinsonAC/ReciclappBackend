package com.reciclapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reciclapp.dao.IMaquinaDAO;
import com.reciclapp.entitys.Maquina;
import com.reciclapp.services.IMaquinaService;

@Service
public class MaquinaServiceImpl implements IMaquinaService {

	@Autowired
	IMaquinaDAO maquinaDao;
	
	@Override
	public List<Maquina> listarMaquinas() {
		// TODO Auto-generated method stub
		return maquinaDao.findAll();
	}

	@Override
	public Maquina registrarMaquina(Maquina maquina) {
		// TODO Auto-generated method stub
		return maquinaDao.save(maquina);
	}

	@Override
	public Maquina buscarMaquinaPorId(long id) {
		// TODO Auto-generated method stub
		return maquinaDao.findById(id).orElse(null);
	}

	@Override
	public Maquina editarMaquina(Maquina maquina) {
		// TODO Auto-generated method stub
		return maquinaDao.save(maquina);
	}

}
