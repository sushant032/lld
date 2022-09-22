package com.compaloon.machine.exceptions;

public class VendingMachineException extends RuntimeException {
    Integer errorCode;
    String errorMessage;

    public VendingMachineException(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public VendingMachineException(String message, Integer errorCode, String errorMessage) {
        super(message);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public VendingMachineException(String message, Throwable cause, Integer errorCode, String errorMessage) {
        super(message, cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public VendingMachineException(Throwable cause, Integer errorCode, String errorMessage) {
        super(cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public VendingMachineException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer errorCode, String errorMessage) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
