package com.chuevalexander.lesson29;

public class PerimetrException extends Exception {
    public PerimetrException() {
    }

    public PerimetrException(String message) {
        super(message);
    }

    public PerimetrException(String message, Throwable cause) {
        super(message, cause);
    }

    public PerimetrException(Throwable cause) {
        super(cause);
    }

    public PerimetrException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
