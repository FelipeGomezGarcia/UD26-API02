package com.example.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, String>{

}
