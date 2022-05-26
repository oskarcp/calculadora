package com.iteriam.calculadora.service;

import java.math.BigDecimal;

import com.iteriam.calculadora.exception.ExceptionCalculadora;

/**
 * Clase que contiene las distntas funcionalidades de una calculadora.
 * @author Óscar Cambero
 *
 */
public interface ServiceCalculadora  {
	
	/**
	 * Realiza operaciones con dos numeros.
	 * @param numeroUno.
	 * @param numeroDos.
	 * @return resultado de la operación.
	 */
	BigDecimal operar(BigDecimal numeroUno, BigDecimal numeroDos, String operacion) throws ExceptionCalculadora;
	

}
