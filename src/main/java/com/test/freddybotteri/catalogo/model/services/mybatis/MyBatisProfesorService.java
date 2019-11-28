/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.freddybotteri.catalogo.model.services.mybatis;

/**
 *
 * @author Freddy
 */

import com.test.freddybotteri.catalogo.model.entities.Profesor;
import com.test.freddybotteri.catalogo.model.mappers.CursoMapper;
import com.test.freddybotteri.catalogo.model.mappers.ProfesorMapper;
import com.test.freddybotteri.catalogo.model.services.ProfesorService;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class MyBatisProfesorService implements ProfesorService{
    
        private ProfesorMapper profesorMapper;
        public MyBatisProfesorService(final ProfesorMapper profesorMapper) {
		this.profesorMapper = profesorMapper;
	}
        
        @Override
	public List<Profesor> findAllProfesor() {
		return this.profesorMapper.getAllProfesor();
	}
}
