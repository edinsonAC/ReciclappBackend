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
 * The persistent class for the maquina database table.
 * 
 */
@Entity
@Table(name = "maquina")
public class Maquina implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "maqui_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long maquiId;

	@Column(name = "maqui_fecharegistro")
	private Timestamp maquiFecharegistro;

	@Column(name = "maqui_ubicacion")
	private String maquiUbicacion;

	@Column(name = "maqui_serial")
	private String maquiSerial;

	public Maquina() {
	}

}