package com.iteriam.calculadora.utils;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.iteriam.calculadora.exception.ExceptionCalculadora;

import io.corp.calculator.TracerImpl;

public enum Operacion {

	SUMA("+"), RESTA("-");
	
	private static final Operacion[] valores = new Operacion[] { SUMA, RESTA };
	
	private static TracerImpl tracer = new TracerImpl();
	private String signo;

	Operacion(String signo) {
		this.signo = signo;
	}

	private String getSigno() {
		return this.signo;
	}

	/**
	 * Parsea el parametro String valor en un objeto de tipo Operacion. El valor del
	 * String puede ser tanto el nombre ("suma", "resta" indiferente mayusculas
	 * de minusculas) de la operacion así como el signo ('+', '-')
	 * 
	 * @param valor
	 * @return
	 * @throws ExceptionCalculadora 
	 */
	@JsonCreator
	public static Operacion obtenerValor(String valor) throws ExceptionCalculadora {

		for (int i = 0; i < valores.length; ++i) {
			Operacion opActual = valores[i];
			if (valor.equalsIgnoreCase(opActual.name()) || valor.equalsIgnoreCase(opActual.getSigno())) {
				return opActual;
			}
		}
		tracer.trace(String.format("Operación no soportada para ser calculada %s", valor));
		throw new ExceptionCalculadora	("Operación no soportada para el valor: " + valor);
	}

}
