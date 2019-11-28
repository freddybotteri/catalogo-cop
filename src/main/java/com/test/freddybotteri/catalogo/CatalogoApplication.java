package com.test.freddybotteri.catalogo;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.test.freddybotteri.catalogo.configurations.JerseyConfiguration;

@SpringBootApplication
@MapperScan("com.test.freddybotteri.catalogo.model.mappers")

public class CatalogoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CatalogoApplication.class, args);
       
	}
  
}
