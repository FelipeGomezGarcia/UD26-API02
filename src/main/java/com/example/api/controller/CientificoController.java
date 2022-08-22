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

import com.example.api.dto.Cientifico;
import com.example.api.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarCientificos(){
		return cientificoServiceImpl.listarCientificos();
	}
	
	@GetMapping("/cientificos/{dni}")
	public Cientifico cientificoXID(@PathVariable(name="dni") String dni) {
		return cientificoServiceImpl.cientificoXID(dni);
	}
	
	@PostMapping("/cientificos")
	public Cientifico guardarCientifico(@RequestBody Cientifico cientifico) {
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientifico actualizarCientifico(@PathVariable(name="dni")String dni, @RequestBody Cientifico cientifico) {
		Cientifico cientificoActualizado = cientificoServiceImpl.cientificoXID(dni);
		
		cientificoActualizado.setNombreApels(cientifico.getNombreApels());
		
		return cientificoServiceImpl.actualizarCientifico(cientificoActualizado);
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eliminarCientifico (@PathVariable(name="dni")String dni) {
		cientificoServiceImpl.eliminarCientifico(dni);
	}
}
