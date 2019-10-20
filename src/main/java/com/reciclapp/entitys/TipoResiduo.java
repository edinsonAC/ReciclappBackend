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
 * The persistent class for the tipo_residuo database table.
 * 
 */
@Entity
@Table(name = "tipo_residuo")
public class TipoResiduo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "tire_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long tireId;

	@Column(name = "tire_fecharegistro")
	private Timestamp tireFecharegistro;

	@Column(name = "tire_nombre")
	private String tireNombre;

	public TipoResiduo() {
	}

}