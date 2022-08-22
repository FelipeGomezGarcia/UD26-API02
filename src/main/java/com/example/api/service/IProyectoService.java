package com.example.api.service;

import java.util.List;

import com.example.api.dto.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> listarProyectos();
	
	public Proyecto guardarProyectos(Proyecto proyecto);
	
	public Proyecto proyectoXID(String id);
	
	public Proyecto actualizarProyecto(String id, Proyecto proyecto);
	
	public void eliminarProyecto(String id);
}
