package com.iteriam.calculadora.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.iteriam.calculadora.exception.ExceptionCalculadora;
import com.iteriam.calculadora.utils.Operacion;

import io.corp.calculator.TracerImpl;

@Service
public class ImplServiceCalculadora implements ServiceCalculadora {

	private TracerImpl tracer = new TracerImpl();

	@Override
	public BigDecimal operar(BigDecimal numeroUno, BigDecimal numeroDos, String strOperacion) throws ExceptionCalculadora {

		BigDecimal resultado = null;
		MathOperation mathOperation;

		Operacion operacion = Operacion.obtenerValor(strOperacion);

		switch (operacion) {
		case SUMA:
			mathOperation = new Suma();
			resultado = mathOperation.calculate(numeroUno, numeroDos);
			break;
		case RESTA:
			mathOperation = new Resta();
			resultado = mathOperation.calculate(numeroUno, numeroDos);
			break;
		default:
			tracer.trace(String.format("Operación no soportada para ser calculada %s", strOperacion));
			break;

		}

		return resultado;
	}

}
