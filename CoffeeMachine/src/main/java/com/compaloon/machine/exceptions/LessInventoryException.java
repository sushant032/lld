package com.compaloon.machine.exceptions;

public class LessInventoryException extends VendingMachineException {
    public LessInventoryException(Integer errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public LessInventoryException(String message, Integer errorCode, String errorMessage) {
        super(message, errorCode, errorMessage);
    }

    public LessInventoryException(String message, Throwable cause, Integer errorCode, String errorMessage) {
        super(message, cause, errorCode, errorMessage);
    }

    public LessInventoryException(Throwable cause, Integer errorCode, String errorMessage) {
        super(cause, errorCode, errorMessage);
    }

    public LessInventoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer errorCode, String errorMessage) {
        super(message, cause, enableSuppression, writableStackTrace, errorCode, errorMessage);
    }
}
