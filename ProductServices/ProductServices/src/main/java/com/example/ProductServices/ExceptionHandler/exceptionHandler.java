package com.example.ProductServices.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.ProductServices.DTOs.ExceptionDTO;

@ControllerAdvice
public class exceptionHandler {
    
    @ExceptionHandler(ArithmeticException.class) 
    public ResponseEntity<ExceptionDTO> handleArthmeticException() {
        ExceptionDTO dto = new ExceptionDTO();
        dto.setMessage("Something went Wrong");
        dto.setSolution("Arthmetic Error Exception");

        ResponseEntity<ExceptionDTO> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }    

    @ExceptionHandler(Exception.class) 
    public ResponseEntity<ExceptionDTO> handleException() {
        ExceptionDTO dto = new ExceptionDTO();
        dto.setMessage("Something went Wrong");
        dto.setSolution("General Exception");

        ResponseEntity<ExceptionDTO> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }  
}
