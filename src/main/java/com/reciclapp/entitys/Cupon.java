package com.reciclapp.entitys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the cupon database table.
 * 
 */
@Entity
@Table(name = "cupon")
public class Cupon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cupon_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long avpuId;

	@Column(name = "cupon_fecharegistro")
	private Timestamp cuponFecharegistro;


	@Column(name = "cupon_descripcion")
	private String cuponDescripcion;
	
	@Column(name = "cupon_valorpuntos")
	private String cuponValorPuntos;
	
	@Column(name = "cupon_estado")
	private String cuponEstado;


	public Cupon() {
	}
	
	
}