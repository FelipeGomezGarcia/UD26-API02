package com.example.api.service;

import java.util.List;

import com.example.api.dto.Cientifico;

public interface ICientificoService {
	
	public List<Cientifico> listarCientificos();
	
	public Cientifico guardarCientifico(Cientifico cientifico);
	
	public Cientifico cientificoXID(String dni);
	
	public Cientifico actualizarCientifico(Cientifico cientifico);
	
	public void eliminarCientifico(String dni);
}
