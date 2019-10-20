package com.reciclapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reciclapp.entitys.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	@Query(nativeQuery = true, value = "SELECT * FROM usuario where usua_correo = ?1")
	public Usuario findByEmail(String usuario);
}
