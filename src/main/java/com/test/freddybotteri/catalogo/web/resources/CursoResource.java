/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package com.test.freddybotteri.catalogo.web.resources;

import javax.persistence.EntityNotFoundException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.test.freddybotteri.catalogo.model.entities.Curso;
import com.test.freddybotteri.catalogo.model.services.CursoService;

/**
 * Servicio REST para la gestión de la entidad 'Course'
 * @author Autentia
 * @version 1.0
 */
@Component
@Path("/course")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CursoResource {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	private CursoService cursoService;
	
    public CursoResource(CursoService cursoService) {
        this.cursoService = cursoService;
    }
    
	@POST
	public Response create(Curso course) {
		if(course.getTitulo() == null || course.getNivel() == null || course.getProfesor() == null || course.getNumerohoras() == null) {
			return Response.status(500).entity("Falta por rellenar campos obligatorios").build();
		}
                
                System.out.println(course);
		return Response.ok().entity(cursoService.create(course)).build();
	}
    
    @GET
    public Response getAll() {
        return Response.ok().entity(cursoService.findAll()).build();
    }


   
}
