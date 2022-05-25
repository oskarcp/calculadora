package com.iteriam.calculadora.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

import com.iteriam.calculadora.CalculadoraApplication;
import com.iteriam.calculadora.service.IServiceCalculadora;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = CalculadoraApplication.class)

public class ControllerTest {
	
	 @MockBean
	 IServiceCalculadora iServiceCalculadora;

	    
	  @LocalServerPort
	   int randomServerPort;
	  
	  
	  /**
	     * Invoca una llamada GET /start
	     * @return String
	     * @throws URISyntaxException
	     */
	    private ResponseEntity<String> getStart() throws URISyntaxException {
	        RestTemplate restTemplate = new RestTemplate();
	        
	        final String baseUrl = "http://localhost:" + randomServerPort + "/rest/calculadora/start";
	        
	        URI uri = new URI(baseUrl);

	        ResponseEntity<String> resultado  = restTemplate.getForEntity(uri, String.class);
	        return resultado;
	    }
	    
	    private ResponseEntity<Double> getOperacion(String operacion, BigDecimal numeroUno, BigDecimal numeroDos) throws URISyntaxException {
	        RestTemplate restTemplate = new RestTemplate();

	        final String baseUrl = "http://localhost:" + randomServerPort +"/rest/calculadora/"+operacion+"?numeroUno=" + numeroUno +"&numeroDos=" + numeroDos;
	        
	       
	        
	        URI uri = new URI(baseUrl);

	        ResponseEntity<Double> resultado  = restTemplate.getForEntity(uri, Double.class);
	        return resultado;
	    }
	  

	    
	    @Test
	    public void start() throws Exception {

	    	ResponseEntity<String> resultado = getStart();
	    	
	    	assertEquals(200, resultado.getStatusCodeValue());
	    	assertEquals("Servicio operativo", resultado.getBody().toString());
	
	 
	    }
	    
	    @Test
	    public void sumar() throws Exception {

	    	BigDecimal bd1 = new BigDecimal (1);
	    	BigDecimal bd2 = new BigDecimal (1);
	    	ResponseEntity<Double> resultado = getOperacion("suma", bd1, bd2);
	    	
	    	
	    	
	    	assertEquals(200, resultado.getStatusCodeValue());
	    	assertEquals(2.0, resultado.getBody().longValue());

	    }
	    
	    @Test
	    public void restar() throws Exception {

	    	BigDecimal bd1 = new BigDecimal (1);
	    	BigDecimal bd2 = new BigDecimal (1);
	    	
	    	ResponseEntity<Double> resultado = getOperacion("resta", bd1, bd2);
	    	
	    	
	    	
	    	assertEquals(200, resultado.getStatusCodeValue());
	    	assertEquals(0.0, resultado.getBody().longValue());

	    }

	    

	    
}
