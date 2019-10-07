package com.apiscm.entitys;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the plandeestudios database table.
 * 
 */
@Entity
@Table(name="plandeestudios")
@NamedQuery(name="Plandeestudio.findAll", query="SELECT p FROM Plandeestudio p")
public class Plandeestudio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nombre;

	private int codigo;

	public Plandeestudio() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}