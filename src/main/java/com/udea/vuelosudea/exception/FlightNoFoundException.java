package com.udea.vuelosudea.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FlightNoFoundException extends RuntimeException{
    public FlightNoFoundException(String mensaje){
        super(mensaje);
    }
}