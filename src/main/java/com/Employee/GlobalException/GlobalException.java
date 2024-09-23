package com.Employee.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Employee.Exception.NameException;

@RestControllerAdvice
public class GlobalException {

//@ExceptionHandler(NameException.class)
//      public ResponseEntity<Object> notfound(NameException ne) {
//      return new ResponseEntity<>("Name not found",HttpStatus.NOT_FOUND);

	@ExceptionHandler
	public ResponseEntity notfound(Exception ne) {
		return new ResponseEntity<>(ne, HttpStatus.NOT_FOUND);

//public ResponseEntity notfound(NameException ne) {
//return new ResponseEntity("Name not found",HttpStatus.NOT_FOUND);
	}
}
