package br.com.nextseguros.application.domain.exception;

public class FeignHouseException extends RuntimeException{

    public FeignHouseException(String message, Throwable cause) {
        super(message, cause);
    }
}
