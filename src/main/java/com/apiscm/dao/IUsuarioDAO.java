package com.apiscm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.apiscm.entitys.Persona;
import com.apiscm.entitys.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM usuario where usuario = ?1")
	public Usuario findByUsername(String usuario);
}
