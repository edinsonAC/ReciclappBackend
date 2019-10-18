package com.reciclapp.entitys;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the matricula database table.
 * 
 */
@Entity
@NamedQuery(name="Matricula.findAll", query="SELECT m FROM Matricula m")
public class Matricula implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="codigo_programa")
	private int codigoPrograma;

	private int semestre;

	public Matricula() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigoPrograma() {
		return this.codigoPrograma;
	}

	public void setCodigoPrograma(int codigoPrograma) {
		this.codigoPrograma = codigoPrograma;
	}

	public int getSemestre() {
		return this.semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

}