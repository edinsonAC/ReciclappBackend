package com.reciclapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reciclapp.dao.IResiduoDAO;
import com.reciclapp.entitys.Residuo;
import com.reciclapp.services.IResiduoService;

@Service
public class ResiduoServiceImpl implements IResiduoService {

	@Autowired
	IResiduoDAO residuoDao;
	
	@Override
	public List<Residuo> listarResiduos() {
		// TODO Auto-generated method stub
		return residuoDao.findAll();
	}

	@Override
	public Residuo registrarResiduo(Residuo residuo) {
		// TODO Auto-generated method stub
		return residuoDao.save(residuo);
	}

	@Override
	public Residuo editarResiduo(Residuo residuo) {
		// TODO Auto-generated method stub
		return residuoDao.save(residuo);
	}

	@Override
	public Residuo buscarResiduoPorId(long id) {
		// TODO Auto-generated method stub
		return residuoDao.findById(id).orElse(null);
	}

}
