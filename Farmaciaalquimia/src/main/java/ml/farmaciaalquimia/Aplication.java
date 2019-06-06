package ml.farmaciaalquimia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import ml.farmaciaalquimia.api.FabricanteApi;

@SpringBootApplication
public class Aplication extends SpringBootServletInitializer{
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Aplication.class, FabricanteApi.class);
	    }
	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}
}
