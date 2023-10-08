package com.ifms.softmed.services.exceptions;

public class SenhaInvalidaException extends RuntimeException{
    
    public SenhaInvalidaException(){
        super("Senha invalida");
    }
}
