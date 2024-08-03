package br.com.nextseguros.application.domain.exception;

public class NullPointClientException extends RuntimeException{
    public NullPointClientException(String message) {
        super(message);
    }

    @Override
    public Throwable fillInStackTrace() {
        StackTraceElement[] stackTrace = new StackTraceElement[1];
        stackTrace[0] = new StackTraceElement("CustomClass", "customMethod", "CustomFile.java", 123);
        setStackTrace(stackTrace);
        return this;
    }
}
