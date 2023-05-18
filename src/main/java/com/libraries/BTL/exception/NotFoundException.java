package com.libraries.BTL.exception;

public class NotFoundException extends IllegalArgumentException{
    public NotFoundException(String msg){
        super(msg);
    }
}
