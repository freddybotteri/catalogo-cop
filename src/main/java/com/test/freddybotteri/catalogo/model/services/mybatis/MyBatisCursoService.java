/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package com.test.freddybotteri.catalogo.model.services.mybatis;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.test.freddybotteri.catalogo.model.entities.Curso;
import com.test.freddybotteri.catalogo.model.mappers.CursoMapper;
import com.test.freddybotteri.catalogo.model.services.CursoService;


@Service
public class MyBatisCursoService implements CursoService {

	private CursoMapper courseMapper;

	public MyBatisCursoService(final CursoMapper courseMapper) {
		this.courseMapper = courseMapper;
	}

	@Override
	public Curso create(Curso course) {
		this.courseMapper.insert(course);
		return course;
	}



	@Override
	public List<Curso> findAll() {
		return this.courseMapper.getAll();
	}



}
