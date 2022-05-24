package com.iteriam.calculadora.controller;

import java.math.BigDecimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.corp.calculator.TracerImpl;
import io.swagger.annotations.ApiParam;

/**
 * Controlador que expone los distintos endpoint.
 * @author Óscar Cambero
 * 
 *
 */
@RestController
@RequestMapping("/rest")
public class CalculadoraController {


    private TracerImpl tracer = new TracerImpl();


	
	/**
	 * Indica si el servicio esta operativo.
	 * @return mensaje indicando el estado del servicio.
	 */
	@ResponseBody
    @GetMapping("/start")
    public String start() {
		tracer.trace(String.format("INI GET >>> /start") );
        return "Servicio operativo";
    }
	
	
}
	