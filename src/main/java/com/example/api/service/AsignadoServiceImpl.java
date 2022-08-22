package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dao.IAsignadoDAO;
import com.example.api.dto.Asignado;

@Service
public class AsignadoServiceImpl implements IAsignadoService{

	@Autowired
	IAsignadoDAO iAsignadoDAO;

	@Override
	public List<Asignado> listarAsignados() {
		// TODO Auto-generated method stub
		return iAsignadoDAO.findAll();
	}

	@Override
	public Asignado guardarAsignado(Asignado asignado) {
		// TODO Auto-generated method stub
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public Asignado asignadoXID(int id) {
		// TODO Auto-generated method stub
		return iAsignadoDAO.findById(id).get();
	}

	@Override
	public Asignado actualizarAsignado(Asignado asignado) {
		// TODO Auto-generated method stub		
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public void eliminarAsignado(String dni) {
		// TODO Auto-generated method stub
		
	}
}
