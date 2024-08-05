package br.com.nextseguros.application.domain.exception;

public class FeignConnectException extends RuntimeException {
    public FeignConnectException(String message) {
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
