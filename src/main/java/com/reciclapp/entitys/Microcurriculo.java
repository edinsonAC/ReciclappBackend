package com.reciclapp.entitys;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the microcurriculo database table.
 * 
 */
@Entity
@NamedQuery(name="Microcurriculo.findAll", query="SELECT m FROM Microcurriculo m")
public class Microcurriculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String archivo;

	private String formato;

	@Column(name="id_grupo")
	private int idGrupo;

	private String nombre;

	private String peso;

	public Microcurriculo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArchivo() {
		return this.archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public String getFormato() {
		return this.formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPeso() {
		return this.peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

}