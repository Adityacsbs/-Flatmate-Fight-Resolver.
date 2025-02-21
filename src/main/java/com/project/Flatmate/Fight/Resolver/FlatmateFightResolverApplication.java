package com.project.Flatmate.Fight.Resolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "Flatmate Fight Resolver API", version = "1.0", description = "API documentation for the Flatmate Fight Resolver application"))

@SpringBootApplication
@EnableScheduling
public class FlatmateFightResolverApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlatmateFightResolverApplication.class, args);
	}

}
