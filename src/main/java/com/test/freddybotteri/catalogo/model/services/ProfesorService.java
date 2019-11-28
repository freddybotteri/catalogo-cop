/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.freddybotteri.catalogo.model.services;

import com.test.freddybotteri.catalogo.model.entities.Profesor;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Freddy
 */
@Service
public interface ProfesorService {
    public List<Profesor> findAllProfesor();
}
