package com.reciclapp.entitys;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the prueba database table.
 * 
 */
@Entity
@NamedQuery(name="Prueba.findAll", query="SELECT p FROM Prueba p")
public class Prueba implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="id_prueba")
	private int idPrueba;

	@Column(name="id_tema")
	private int idTema;

	@Column(name="id_unidad")
	private int idUnidad;

	private float porcentaje;

	public Prueba() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdPrueba() {
		return this.idPrueba;
	}

	public void setIdPrueba(int idPrueba) {
		this.idPrueba = idPrueba;
	}

	public int getIdTema() {
		return this.idTema;
	}

	public void setIdTema(int idTema) {
		this.idTema = idTema;
	}

	public int getIdUnidad() {
		return this.idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	public float getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

}