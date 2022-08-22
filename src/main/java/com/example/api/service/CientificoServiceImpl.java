package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dao.ICientificoDAO;
import com.example.api.dto.Cientifico;

@Service
public class CientificoServiceImpl implements ICientificoService{

	@Autowired
	ICientificoDAO iCientificoDAO;

	@Override
	public List<Cientifico> listarCientificos() {
		// TODO Auto-generated method stub
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(String dni) {
		// TODO Auto-generated method stub
		return iCientificoDAO.findById(dni).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub		
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String dni) {
		// TODO Auto-generated method stub
		iCientificoDAO.deleteById(dni);
	}
}
