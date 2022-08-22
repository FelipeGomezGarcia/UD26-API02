package com.example.api.service;

import java.util.List;

import com.example.api.dto.Asignado;

public interface IAsignadoService {

	public List<Asignado> listarAsignados();
	
	public Asignado guardarAsignado(Asignado asignado);
	
	public Asignado asignadoXID(int id);
	
	public Asignado actualizarAsignado(Asignado asignado);
	
	public void eliminarAsignado(int dni);
}
