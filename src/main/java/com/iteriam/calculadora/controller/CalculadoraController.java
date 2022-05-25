package com.iteriam.calculadora.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iteriam.calculadora.service.IServiceCalculadora;

import io.corp.calculator.TracerImpl;
import io.swagger.annotations.ApiParam;

/**
 * Controlador que expone los distintos endpoint.
 * @author Óscar Cambero
 * 
 *
 */
@RestController
@RequestMapping("/rest/calculadora")
public class CalculadoraController {


    private TracerImpl tracer = new TracerImpl();

    @Autowired
    private final IServiceCalculadora iServiceCalculadora;
  

    public CalculadoraController(IServiceCalculadora iServiceCalculadora) {
        this.iServiceCalculadora = iServiceCalculadora;
    }
    
    

	
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
	 * Endpoint /suma método GET.
	 * @param  numeroUno.
	 * @param  numeroDos.
	 * @return ResponseEntity<Double> resultado de la operación.
	 */
	@GetMapping(value = "/suma")
    public ResponseEntity<Double> suma(@RequestParam(value = "numeroUno", required = true) @ApiParam (  value = "Primer número", required = true) BigDecimal numeroUno,
                                            @RequestParam(value = "numeroDos", required = true) @ApiParam (value = "Segundo número", required = true) BigDecimal numeroDos){
		
		tracer.trace(String.format("INI GET >>> /suma | RequestParam numeroUno %s, numeroDos %s", numeroUno, numeroDos));
		double resultado = iServiceCalculadora.sumar(numeroUno, numeroDos);
		tracer.trace(String.format("FIN GET >>> /suma |  resultado %1$,.2f", resultado));

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
	
	/**
	 * Endpoint /resta método GET.
	 * @param  numeroUno.
	 * @param  numeroDos.
	 * @return ResponseEntity<Double> resultado de la operación.
	 */
	@GetMapping(value = "/resta")
    public ResponseEntity<Double> resta(@RequestParam(value = "numeroUno", required = true) @ApiParam (  value = "Primer número", required = true) BigDecimal numeroUno,
                                            @RequestParam(value = "numeroDos", required = true) @ApiParam (value = "Segundo número", required = true) BigDecimal numeroDos){
		
		tracer.trace(String.format("INI GET >>> /resta | RequestParam numeroUno %s, numeroDos %s", numeroUno, numeroDos));
		double resultado = iServiceCalculadora.restar(numeroUno, numeroDos);
		tracer.trace(String.format("FIN GET >>> /resta |  resultado %1$,.2f", resultado));
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
	
	
	
	
}
	