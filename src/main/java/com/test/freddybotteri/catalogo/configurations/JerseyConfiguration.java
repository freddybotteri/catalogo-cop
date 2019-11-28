/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

                                                                                  



package com.test.freddybotteri.catalogo.configurations;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;

import com.test.freddybotteri.catalogo.web.resources.CursoResource;
import com.test.freddybotteri.catalogo.web.resources.ProfesorResource;
import com.test.freddybotteri.catalogo.web.resources.FileUploadResource;
import com.test.freddybotteri.catalogo.web.resources.FileDownloadResource;

import com.test.freddybotteri.catalogo.web.filter.CORSResponseFilter;

@Configuration 
@ApplicationPath("/rest")
public class JerseyConfiguration extends ResourceConfig {

	public JerseyConfiguration() {
               
		register(CursoResource.class);
                 register(ProfesorResource.class);
                register(FileUploadResource.class);
		register(FileDownloadResource.class);
		register(CORSResponseFilter.class);
		property(ServletProperties.FILTER_FORWARD_ON_404, true);
		register(MultiPartFeature.class);
		register(LoggingFeature.class);
	}


}

