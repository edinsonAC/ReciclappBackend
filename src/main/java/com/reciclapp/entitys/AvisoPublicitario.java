package com.reciclapp.entitys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

/**
 * The persistent class for the asignatura database table.
 * 
 */
@Entity
@Table(name = "aviso_publicitario")
public class AvisoPublicitario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "avpu_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long avpuId;

	@Column(name = "avpu_fecharegistro")
	private Timestamp avpuFecharegistro;


	@Column(name = "avpu_descripcion")
	private String avpuDescripcion;


	public AvisoPublicitario() {
	}
	
	
}