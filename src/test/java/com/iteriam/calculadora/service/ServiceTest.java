package com.iteriam.calculadora.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.iteriam.calculadora.CalculadoraApplication;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = CalculadoraApplication.class)

public class ServiceTest {

    @Autowired
    IServiceCalculadora iServiceCalculadora;

    
    @DisplayName("Prueba suma ok")
    @Test
    void suma1() {
    	BigDecimal bd1 = new BigDecimal (1);
    	BigDecimal bd2 = new BigDecimal (1);
    	assertEquals(2.0, iServiceCalculadora.sumar(bd1, bd2));
    }
    @DisplayName("Prueba suma ko")
    @Test
    void suma2() {
    	BigDecimal bd1 = new BigDecimal (1);
    	BigDecimal bd2 = new BigDecimal (1);
    	assertNotEquals(3.0, iServiceCalculadora.sumar(bd1, bd2));
    }
    @DisplayName("Prueba resta ok")
    @Test
    void resta1() {
    	BigDecimal bd1 = new BigDecimal (1);
    	BigDecimal bd2 = new BigDecimal (1);
    	assertEquals(0.0, iServiceCalculadora.restar(bd1, bd2));
    }
    @DisplayName("Prueba resta ko")
    @Test
    void resta2() {
    	BigDecimal bd1 = new BigDecimal (-1);
    	BigDecimal bd2 = new BigDecimal (-1);
    	assertEquals(0.0, iServiceCalculadora.restar(bd1, bd2));
    }
	
}
