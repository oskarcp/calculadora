package com.iteriam.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Clase principal.
 * @author Óscar Cambero Pastor
 *
 */

@Configuration
@ComponentScan(basePackages = "com.iteriam.calculadora")
@EnableAutoConfiguration
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}

}
