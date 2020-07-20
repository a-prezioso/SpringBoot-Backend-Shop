package com.xantrix.webapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "INGREDIENTI")
public class Ingredienti implements Serializable
{ 
	private static final long serialVersionUID = -6597932485001138522L;
	
	@Id
	@Column(name = "CODART")
	private String codArt;
	
	@Column(name = "INFO")
	private String info;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	@JsonIgnore
	private Articoli articolo;

	public String getCodArt() {
		return codArt;
	}

	public void setCodArt(String codArt) {
		this.codArt = codArt;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Articoli getArticolo() {
		return articolo;
	}

	public void setArticolo(Articoli articolo) {
		this.articolo = articolo;
	}


	
	
}
