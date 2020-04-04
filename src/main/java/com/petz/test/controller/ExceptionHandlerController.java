package com.petz.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.petz.test.domain.ErrorResponseException;
import com.petz.test.domain.Response;

@RestControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(ErrorResponseException.class)
	public ResponseEntity<Response> errorResponseExceptionHandler(ErrorResponseException ex) {
		return new ResponseEntity<>(ex.getResponse(), ex.getStatus());
	}

}
