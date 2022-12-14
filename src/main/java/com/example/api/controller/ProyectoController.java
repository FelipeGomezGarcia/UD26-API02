package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.dto.Proyecto;
import com.example.api.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos(){
		return proyectoServiceImpl.listarProyectos();
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyecto proyectoXID(@PathVariable(name="id") String id) {
		return proyectoServiceImpl.proyectoXID(id);
	}
	
	@PostMapping("/proyectos")
	public Proyecto guardarProyecto(@RequestBody Proyecto proyecto) {
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")String id, @RequestBody Proyecto proyecto) {
		Proyecto proyectoActualizado = proyectoServiceImpl.proyectoXID(id);
		
		proyectoActualizado.setNombre(proyecto.getNombre());
		proyectoActualizado.setHoras(proyecto.getHoras());
		
		return proyectoServiceImpl.actualizarProyecto(proyectoActualizado);
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto (@PathVariable(name="id")String id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}
}
