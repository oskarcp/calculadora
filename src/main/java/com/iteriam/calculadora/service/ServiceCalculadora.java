package com.iteriam.calculadora.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;


@Service
public class ServiceCalculadora implements IServiceCalculadora {
	@Override
	public double sumar(BigDecimal numeroUno, BigDecimal numeroDos) {
		return numeroUno.add(numeroDos).doubleValue();
	}

	@Override
	public double restar(BigDecimal numeroUno, BigDecimal numeroDos) {
		return numeroUno.subtract(numeroDos).doubleValue();
	}

}
