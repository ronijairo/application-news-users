package com.nisum.application.users.util.exception;

public class IncompleteParametersException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public static final String CODE= "EX-002";

    public IncompleteParametersException(String msg) {
        super(msg);
    }
}
