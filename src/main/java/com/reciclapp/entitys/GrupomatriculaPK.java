package com.reciclapp.entitys;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the grupomatricula database table.
 * 
 */
@Embeddable
public class GrupomatriculaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="grupo_numero")
	private int grupoNumero;

	@Column(name="id_matricula")
	private int idMatricula;

	public GrupomatriculaPK() {
	}
	public int getGrupoNumero() {
		return this.grupoNumero;
	}
	public void setGrupoNumero(int grupoNumero) {
		this.grupoNumero = grupoNumero;
	}
	public int getIdMatricula() {
		return this.idMatricula;
	}
	public void setIdMatricula(int idMatricula) {
		this.idMatricula = idMatricula;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GrupomatriculaPK)) {
			return false;
		}
		GrupomatriculaPK castOther = (GrupomatriculaPK)other;
		return 
			(this.grupoNumero == castOther.grupoNumero)
			&& (this.idMatricula == castOther.idMatricula);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.grupoNumero;
		hash = hash * prime + this.idMatricula;
		
		return hash;
	}
}