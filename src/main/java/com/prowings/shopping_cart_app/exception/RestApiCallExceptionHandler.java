package com.prowings.shopping_cart_app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.prowings.shopping_cart_app.model.dto.MyCustomError;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RestApiCallExceptionHandler {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<MyCustomError> handleNotFoundException(HttpServletRequest request, Exception ex){
		System.out.println("inside NotFoundException handler method");
		
		MyCustomError error = new MyCustomError();
		error.setMessage(ex.getMessage());
		error.setRootCause("abc");
		error.setStatusCode(404);
		
		return new ResponseEntity<MyCustomError>(error, HttpStatus.NOT_FOUND);

	}


}