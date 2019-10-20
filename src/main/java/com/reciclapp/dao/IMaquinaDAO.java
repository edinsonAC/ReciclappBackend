package com.reciclapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reciclapp.entitys.Maquina;

public interface IMaquinaDAO extends JpaRepository<Maquina, Long> {

}
