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
@Table(name="Proyecto")
public class Proyecto {

	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "horas")
	private int horas;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Asignado> asignados;

	/**
	 * 
	 */
	public Proyecto() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param asignados
	 */
	public Proyecto(String id, String nombre, int horas, List<Asignado> asignados) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignados = asignados;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
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
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}
	
	
}
