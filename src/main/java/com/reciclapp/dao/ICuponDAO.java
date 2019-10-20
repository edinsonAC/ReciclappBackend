package com.reciclapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reciclapp.entitys.Cupon;

public interface ICuponDAO extends JpaRepository<Cupon, Long> {

}
