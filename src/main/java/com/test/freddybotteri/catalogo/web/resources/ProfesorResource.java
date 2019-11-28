/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.freddybotteri.catalogo.web.resources;

import com.test.freddybotteri.catalogo.model.entities.Profesor;
import com.test.freddybotteri.catalogo.model.services.ProfesorService;
import javax.inject.Inject;
import javax.persistence.EntityNotFoundException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.test.freddybotteri.catalogo.model.services.ProfesorService;
import java.util.List;
import javax.inject.Qualifier;


@Component
@Path("/profesor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfesorResource {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	

	public ProfesorService profesorService;
	
        ///public ProfesorResource(){
        //}
        public ProfesorResource(ProfesorService profesorService) {
         this.profesorService =  profesorService;
        }



        @GET
        public Response getAllProfesor() {
            return Response.ok().entity(this.profesorService.findAllProfesor()).build();
        }
   
}
