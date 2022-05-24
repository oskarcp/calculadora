package com.iteriam.calculadora.service;

import java.math.BigDecimal;

/**
 * Clase que contiene las distntas funcionalidades de una calculadora.
 * @author Óscar Cambero
 *
 */
public interface IServiceCalculadora {
	
	/**
	 * Realiza la suma entre dos operandos.
	 * @param numeroUno.
	 * @param numeroDos.
	 * @return resultado de la operación.
	 */
	double sumar(BigDecimal numeroUno, BigDecimal numeroDos);
	
	/**
	 * Realiza la resta entre dos operandos.
	 * @param numeroUno.
	 * @param numeroDos.
	 * @return resultado de la operación.
	 */
	double restar(BigDecimal numeroUno, BigDecimal numeroDos);

}
