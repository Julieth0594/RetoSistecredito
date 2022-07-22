package br.com.certification.dafiti.exceptions;

public class CartException extends AssertionError{

    public CartException(String message, Throwable cause) {
        super(message, cause);
    }
}
