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

import com.example.api.dto.Asignado;
import com.example.api.service.AsignadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoController {

	@Autowired
	AsignadoServiceImpl asignadoServiceImpl;
	
	@GetMapping("/asignados")
	public List<Asignado> listarAsignados(){
		return asignadoServiceImpl.listarAsignados();
	}
	
	@GetMapping("/asignados/{id}")
	public Asignado asignadoXID(@PathVariable(name="id") int id) {
		return asignadoServiceImpl.asignadoXID(id);
	}
	
	@PostMapping("/asignados")
	public Asignado guardarAsignado(@RequestBody Asignado asignado) {
		return asignadoServiceImpl.guardarAsignado(asignado);
	}
	
	@PutMapping("/asignados/{id}")
	public Asignado actualizarAsignado(@PathVariable(name="id")int id, @RequestBody Asignado asignado) {
		Asignado asignadoActualizado = asignadoServiceImpl.asignadoXID(id);
		
		asignadoActualizado.setCientifico(asignado.getCientifico());
		asignadoActualizado.setProyecto(asignado.getProyecto());
		
		return asignadoServiceImpl.actualizarAsignado(asignadoActualizado);
	}
	
	@DeleteMapping("/asignados/{id}")
	public void eliminarAsignado (@PathVariable(name="id")int id) {
		asignadoServiceImpl.eliminarAsignado(id);
	}
}
