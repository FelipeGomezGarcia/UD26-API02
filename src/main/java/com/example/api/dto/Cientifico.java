package com.example.api.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Cientificos")
public class Cientifico {
	
	@Id
	@Column(name = "dni")
	private String dni;
	@Column(name="nombreapels")
	private String nombreApels;
	
	@OneToMany
	@JoinColumn(name="dni")
	private List<Asignado> asignados;

	/**
	 * 
	 */
	public Cientifico() {
	}

	/**
	 * @param dni
	 * @param nombreApels
	 * @param asignados
	 */
	public Cientifico(String dni, String nombreApels, List<Asignado> asignados) {
		this.dni = dni;
		this.nombreApels = nombreApels;
		this.asignados = asignados;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombreApels
	 */
	public String getNombreApels() {
		return nombreApels;
	}

	/**
	 * @param nombreApels the nombreApels to set
	 */
	public void setNombreApels(String nombreApels) {
		this.nombreApels = nombreApels;
	}

	/**
	 * @return the asignados
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "asignadosA")
	public List<Asignado> getAsignados() {
		return asignados;
	}

	/**
	 * @param asignados the asignados to set
	 */
	public void setAsignados(List<Asignado> asignados) {
		this.asignados = asignados;
	}

	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nombreApels=" + nombreApels + "]";
	}
	
	
}
