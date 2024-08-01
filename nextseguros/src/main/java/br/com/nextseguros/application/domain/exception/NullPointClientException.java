package br.com.nextseguros.application.domain.exception;

public class NullPointClientException extends RuntimeException{
    public NullPointClientException(String message) {
        super(message);
    }
}
