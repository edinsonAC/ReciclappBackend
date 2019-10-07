package com.apiscm.entitys;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tema database table.
 * 
 */
@Entity
@NamedQuery(name="Tema.findAll", query="SELECT t FROM Tema t")
public class Tema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String actividadpresencial;

	private int calificacion;

	@Column(name="id_unidad")
	private int idUnidad;

	private String nombre;

	private String trabajoindependiente;

	public Tema() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActividadpresencial() {
		return this.actividadpresencial;
	}

	public void setActividadpresencial(String actividadpresencial) {
		this.actividadpresencial = actividadpresencial;
	}

	public int getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public int getIdUnidad() {
		return this.idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTrabajoindependiente() {
		return this.trabajoindependiente;
	}

	public void setTrabajoindependiente(String trabajoindependiente) {
		this.trabajoindependiente = trabajoindependiente;
	}

}