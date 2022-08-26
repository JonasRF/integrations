package com.devsuperior.integrations.services.Exeptions;

public class EmailException extends RuntimeException{

    public EmailException(String msg) {
        super(msg);
    }
}
