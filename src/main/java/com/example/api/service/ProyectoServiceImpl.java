package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dao.IProyectoDAO;
import com.example.api.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements IProyectoService{
	
	@Autowired
	IProyectoDAO iProyectoDAO;

	@Override
	public List<Proyecto> listarProyectos() {
		// TODO Auto-generated method stub
		return iProyectoDAO.findAll();
	}

	@Override
	public Proyecto guardarProyectos(Proyecto proyecto) {
		// TODO Auto-generated method stub
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto proyectoXID(String id) {
		// TODO Auto-generated method stub
		return iProyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(String id, Proyecto proyecto) {
		// TODO Auto-generated method stub
		Proyecto proyectoActualizado = iProyectoDAO.findById(id).get();
		
		proyectoActualizado.setNombre(proyecto.getNombre());
		proyectoActualizado.setHoras(proyecto.getHoras());
		
		return iProyectoDAO.save(proyectoActualizado);
	}

	@Override
	public void eliminarProyecto(String id) {
		// TODO Auto-generated method stub
		iProyectoDAO.deleteById(id);
	}
	
	
}
