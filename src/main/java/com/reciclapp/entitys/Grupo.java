package com.reciclapp.entitys;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the grupo database table.
 * 
 */
@Entity
@NamedQuery(name="Grupo.findAll", query="SELECT g FROM Grupo g")
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="grupo_numero")
	private int grupoNumero;

	@Column(name="codigo_asignatura")
	private int codigoAsignatura;

	@Column(name="codigo_docente")
	private int codigoDocente;

	private String grupo;

	public Grupo() {
	}

	public int getGrupoNumero() {
		return this.grupoNumero;
	}

	public void setGrupoNumero(int grupoNumero) {
		this.grupoNumero = grupoNumero;
	}

	public int getCodigoAsignatura() {
		return this.codigoAsignatura;
	}

	public void setCodigoAsignatura(int codigoAsignatura) {
		this.codigoAsignatura = codigoAsignatura;
	}

	public int getCodigoDocente() {
		return this.codigoDocente;
	}

	public void setCodigoDocente(int codigoDocente) {
		this.codigoDocente = codigoDocente;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

}