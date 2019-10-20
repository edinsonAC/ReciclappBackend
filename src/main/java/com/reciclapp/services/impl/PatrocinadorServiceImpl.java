package com.reciclapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reciclapp.dao.IPatrocinadorDAO;
import com.reciclapp.entitys.Patrocinador;
import com.reciclapp.services.IPatrocinadorService;

@Service
public class PatrocinadorServiceImpl implements IPatrocinadorService {

	@Autowired
	IPatrocinadorDAO patrocinadorDao;

	@Override
	public List<Patrocinador> listarPatrocinadores() {
		// TODO Auto-generated method stub
		return patrocinadorDao.findAll();
	}

	@Override
	public Patrocinador buscarPatrocinadorPorId(long id) {
		// TODO Auto-generated method stub
		return patrocinadorDao.findById(id).orElse(null);
	}

	@Override
	public Patrocinador registrarPatrocinador(Patrocinador patrocinador) {
		// TODO Auto-generated method stub
		return patrocinadorDao.save(patrocinador);
	}

	@Override
	public Patrocinador editarPatrocinador(Patrocinador patrocinador) {
		// TODO Auto-generated method stub
		return patrocinadorDao.save(patrocinador);
	}

}
