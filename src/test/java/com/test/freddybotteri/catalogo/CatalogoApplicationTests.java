package com.test.freddybotteri.catalogo;

import ch.qos.logback.core.net.server.Client;
import com.fasterxml.classmate.GenericType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.freddybotteri.catalogo.model.services.CursoService;
import java.util.Collection;
//import javafx.application.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.server.ResourceConfig;
import static org.junit.Assert.assertEquals;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CatalogoApplicationTests {

	@Test
	public void contextLoads() {
	}
        
            /*@Autowired
            private CursoService cursoService;

            private static final String BASE_PATH = "/course";

            @Test
            public void test_getCursos_valid() {
                final Response response = target(BASE_PATH).request().get();

                assertEquals(HttpStatus.OK, response.getStatus());
                assertEquals(MediaType.APPLICATION_JSON, response.getMediaType().toString());

                //assertEquals(cursoService.findAll());
            }*/

}
