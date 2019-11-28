# Spring boot,Jersey (JAX-RS) , Mybatis,MySQL, Angular
----
Tomcat,Maven 

# Port and server

Pasos para ejecutar la app.

    -   Instalar java.
    -   Instalar servidor de MySQL
    -   Ejecutar el archivo jar catalogo SNAPSHOT(En caso de tener esa terminacion)
    -   Dar permiso en el firewall.
    -   Escribir en la URL [localhost:9095]
    -   Listo :)
 
Test

API Rest, consumida por app angular.

# Estructura

Main punto de inicio.
```java
@SpringBootApplication
@MapperScan("com.test.freddybotteri.catalogo.model.mappers")

public class CatalogoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CatalogoApplication.class, args);
       
	}
  
}
```

Coonfiguracion de Jersey.

```java
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

```

Se desarrollo en base a una arquitectura JEE

    - Capa de datos
    - Capa de control(Logica de negocios)
    - Capa de cliente(en este caso angular)




## License
[MIT](https://choosealicense.com/licenses/mit/)