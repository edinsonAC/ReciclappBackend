package com.apiscm.entitys;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the facultad database table.
 * 
 */
@Entity
@NamedQuery(name="Facultad.findAll", query="SELECT f FROM Facultad f")
public class Facultad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nombre;

	public Facultad() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}