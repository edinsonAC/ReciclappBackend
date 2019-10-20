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
 * The persistent class for the patrocinador database table.
 * 
 */
@Entity
@Table(name = "patrocinador")
public class Patrocinador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "patr_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patrId;

	@Column(name = "patr_fecharegistro")
	private Timestamp patrFecharegistro;

	@Column(name = "patr_logo")
	private String patrLogo;


	public Patrocinador() {
	}

}