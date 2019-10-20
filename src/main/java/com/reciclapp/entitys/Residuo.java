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
 * The persistent class for the residuo database table.
 * 
 */
@Entity
@Table(name = "residuo")
public class Residuo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "resi_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long resiId;

	@Column(name = "resi_fecharegistro")
	private Timestamp resiFecharegistro;

	@Column(name = "resi_puntoskilo")
	private String resiPuntoskilo;

	@Column(name = "resi_nombre")
	private String resiNombre;

	public Residuo() {
	}

}