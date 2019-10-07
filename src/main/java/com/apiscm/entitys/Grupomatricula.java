package com.apiscm.entitys;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the grupomatricula database table.
 * 
 */
@Entity
@NamedQuery(name="Grupomatricula.findAll", query="SELECT g FROM Grupomatricula g")
public class Grupomatricula implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GrupomatriculaPK id;

	public Grupomatricula() {
	}

	public GrupomatriculaPK getId() {
		return this.id;
	}

	public void setId(GrupomatriculaPK id) {
		this.id = id;
	}

}