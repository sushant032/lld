package com.compaloon.machine.exceptions;

public class NoSuchVendingMachineException extends VendingMachineException {

    public NoSuchVendingMachineException(Integer errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public NoSuchVendingMachineException(String message, Integer errorCode, String errorMessage) {
        super(message, errorCode, errorMessage);
    }

    public NoSuchVendingMachineException(String message, Throwable cause, Integer errorCode, String errorMessage) {
        super(message, cause, errorCode, errorMessage);
    }

    public NoSuchVendingMachineException(Throwable cause, Integer errorCode, String errorMessage) {
        super(cause, errorCode, errorMessage);
    }

    public NoSuchVendingMachineException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer errorCode, String errorMessage) {
        super(message, cause, enableSuppression, writableStackTrace, errorCode, errorMessage);
    }
}
