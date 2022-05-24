package com.iteriam.calculadora.service;

import java.math.BigDecimal;

/**
 * Clase que contiene las distntas funcionalidades de una calculadora.
 * @author Óscar Cambero
 *
 */
public interface IServiceCalculadora {
	
	/**
	 * Realiza una operación con dos operandos y un operador.
	 * @param  operandoUno Operando numero uno.
	 * @param  operandoDos Operando numero dos.
	 * @param  operador Operador suma, resta. Los posibles valores son add, sub, +, -.
	 * @return resultado de la operación.
	
	 */
	double calcula(BigDecimal operadorUno, BigDecimal operadorDos, String operando);

}
