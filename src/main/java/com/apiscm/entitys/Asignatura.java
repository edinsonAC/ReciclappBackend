package com.apiscm.entitys;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the asignatura database table.
 * 
 */
@Entity
@NamedQuery(name="Asignatura.findAll", query="SELECT a FROM Asignatura a")
public class Asignatura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;

	private int creditos;

	private int intensidadhoraria;

	private String nombre;

	@Column(name="nombre_plandeestudios")
	private String nombrePlandeestudios;

	private int semestre;

	public Asignatura() {
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCreditos() {
		return this.creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getIntensidadhoraria() {
		return this.intensidadhoraria;
	}

	public void setIntensidadhoraria(int intensidadhoraria) {
		this.intensidadhoraria = intensidadhoraria;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombrePlandeestudios() {
		return this.nombrePlandeestudios;
	}

	public void setNombrePlandeestudios(String nombrePlandeestudios) {
		this.nombrePlandeestudios = nombrePlandeestudios;
	}

	public int getSemestre() {
		return this.semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

}