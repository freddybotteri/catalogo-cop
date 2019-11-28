/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.freddybotteri.catalogo.web.resources;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.StreamingOutput;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Freddy
 */


    @Path("/pdf")
    public class FileDownloadResource{


            @GET
            @Path("/get/{filename}")
            @Produces("application/pdf")
            public Response getFile(@PathParam("filename") String filename) {

                    File file = new File("./Upload_Files/"+filename);

                    ResponseBuilder response = Response.ok((Object) file);
                    response.header("Content-Disposition",
                                    "attachment; filename=new-android-book.pdf");
                    return response.build();

            }

    }
