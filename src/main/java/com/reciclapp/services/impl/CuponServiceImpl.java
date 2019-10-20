package com.reciclapp.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reciclapp.dao.ICuponDAO;
import com.reciclapp.entitys.Cupon;
import com.reciclapp.services.ICuponService;

@Service
public class CuponServiceImpl implements ICuponService {

	@Autowired
	ICuponDAO cuponDao;

	@Override
	public List<Cupon> listarCupones() {
		// TODO Auto-generated method stub
		return cuponDao.findAll();
	}

	@Override
	public Cupon registrarCupon(Cupon cupon) {
		// TODO Auto-generated method stub
		return cuponDao.save(cupon);
	}

	@Override
	public Cupon buscarCuponPorId(long id) {
		// TODO Auto-generated method stub
		return cuponDao.findById(id).orElse(null);
	}

	@Override
	public Cupon editarCupon(Cupon cupon) {
		// TODO Auto-generated method stub
		return cuponDao.save(cupon);
	}

}
