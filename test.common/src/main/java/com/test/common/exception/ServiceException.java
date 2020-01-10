package com.test.common.exception;

public class ServiceException extends RuntimeException {

    public ServiceException() {
        super();
    }

    public ServiceException(String errorCode, String message) {
        super(errorCode+" "+message);
    }

}
