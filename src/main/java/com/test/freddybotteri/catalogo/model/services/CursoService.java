/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package com.test.freddybotteri.catalogo.model.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.test.freddybotteri.catalogo.model.entities.Curso;
import org.springframework.stereotype.Service;

@Service
public interface CursoService {

	public Curso create(Curso course);
	public List<Curso> findAll();

}