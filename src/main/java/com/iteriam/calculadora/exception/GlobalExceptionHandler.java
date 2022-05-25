package com.iteriam.calculadora.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Manejador de excepciones.
 * @author Óscar Cambero
 *
 */
@RestControllerAdvice(basePackages = {"com.iteriam.calculadora.controller"})
public class GlobalExceptionHandler {

	
	@ExceptionHandler(NumberFormatException.class)
    public final ResponseEntity<Exception> handleNumberFormatException(NumberFormatException ex){
		 return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	@ExceptionHandler(ArithmeticException.class)
    public final ResponseEntity<Exception> handleArithmeticException(ArithmeticException ex ){
		 return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
