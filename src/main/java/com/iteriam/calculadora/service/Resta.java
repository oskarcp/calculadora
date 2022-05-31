package com.iteriam.calculadora.service;

import java.math.BigDecimal;

/**
 * Clase resta.
 *
 */
public class Resta implements MathOperation {

	@Override
	public BigDecimal calculate(BigDecimal numero1, BigDecimal numero2) {
		return numero1.subtract(numero2);
	}
	

}
