package com.reciclapp.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the residuo_usuario database table.
 * 
 */
@Entity
@Table(name = "residuo_usuario")
public class ResiduoUsuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "reus_id")
	private int reusId;

	@ManyToOne
	@JoinColumn(name = "usua_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "resi_id")
	private Residuo residuo;

	public ResiduoUsuario() {

	}

}