package com.reciclapp.entitys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;


/**
 * The persistent class for the cupon database table.
 * 
 */
@Entity
@Table(name = "cupon")
public class Administrador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cupon_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cuponId;

	@Column(name = "cupon_descripcion")
	private String cuponDescripcion;
	
	@Column(name = "cupon_valorpuntos")
	private String cuponValorpuntos;
	
	@Column(name = "cupon_estado")
	private String cuponEstado;
	
	@Column(name = "cupon_fecharegistro")
	private Timestamp avpuFecharegistro;
}