package com.reciclapp.entitys;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unidad database table.
 * 
 */
@Entity
@NamedQuery(name="Unidad.findAll", query="SELECT u FROM Unidad u")
public class Unidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int horasindependientes;

	private int horaspresenciales;

	private int horatotal;

	@Column(name="id_microcurriculo")
	private int idMicrocurriculo;

	@Column(name="nombre_contenido")
	private String nombreContenido;

	public Unidad() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHorasindependientes() {
		return this.horasindependientes;
	}

	public void setHorasindependientes(int horasindependientes) {
		this.horasindependientes = horasindependientes;
	}

	public int getHoraspresenciales() {
		return this.horaspresenciales;
	}

	public void setHoraspresenciales(int horaspresenciales) {
		this.horaspresenciales = horaspresenciales;
	}

	public int getHoratotal() {
		return this.horatotal;
	}

	public void setHoratotal(int horatotal) {
		this.horatotal = horatotal;
	}

	public int getIdMicrocurriculo() {
		return this.idMicrocurriculo;
	}

	public void setIdMicrocurriculo(int idMicrocurriculo) {
		this.idMicrocurriculo = idMicrocurriculo;
	}

	public String getNombreContenido() {
		return this.nombreContenido;
	}

	public void setNombreContenido(String nombreContenido) {
		this.nombreContenido = nombreContenido;
	}

}