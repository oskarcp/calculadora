package com.iteriam.calculadora.service;

import java.math.BigDecimal;

/**
 * Clase suma.
 * @author Óscar Cambero
 *
 */
public class Suma implements MathOperation {

	@Override
	public BigDecimal calculate(BigDecimal numero1, BigDecimal numero2) {
	
		return numero1.add(numero2);
	}
	

}
