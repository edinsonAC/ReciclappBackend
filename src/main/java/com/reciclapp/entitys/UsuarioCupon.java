package com.reciclapp.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the usuario_funcionalidad database table.
 * 
 */
@Entity
@Table(name = "usuario_cupon")
public class UsuarioCupon implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "uscu_id")
	private int uscuId;

	@ManyToOne
	@JoinColumn(name = "usua_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "cupon_id")
	private Cupon cupon;

	public UsuarioCupon() {

	}

}
