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
	 * Endpint que indica si el servicio esta operativo.
	 * @return mensaje indicando el estado del servicio.
	 */
	@ResponseBody
    @GetMapping("/start")
    public String start() {
		tracer.trace(String.format("INI GET >>> /start") );
        return "Servicio operativo";
    }
	
	/**
	 * Endpoint /calcular método GET.
	 * @param  operandoUno Operando numero uno.
	 * @param  operandoDos Operando numero dos.
	 * @param  operador Operador suma, resta. Los posibles valores son add, sub, +, -.
	 * @return ResponseEntity<Double> resultado de la operación.
	 */
	@GetMapping(value = "/calcular")
    public ResponseEntity<Double> calcula(@RequestParam(value = "operandoUno", required = true) @ApiParam (  value = "Primer operando", required = true) BigDecimal operandoUno,
                                            @RequestParam(value = "operandoDos", required = true) @ApiParam (value = "Segundo operando", required = true) BigDecimal operandoDos,
                                            @RequestParam(value = "operador" , required = true) @ApiParam (value = "Operador", required = true) String operador) {
		
		tracer.trace(String.format("INI GET >>> /calcular | RequestParam operandoUno %s, operandoDos %s, operador %s", operandoUno, operandoDos, operador));
		
	
		double resultado = 4.4;
     
		
		tracer.trace(String.format("FIN GET >>> /calcular |  resultado %1$,.2f", resultado));

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
	
	
}
	