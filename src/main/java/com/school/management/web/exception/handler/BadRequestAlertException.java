package com.school.management.web.exception.handler;

public class BadRequestAlertException extends RuntimeException
{
    private final String entityname;
    private final String errorKey;

    public BadRequestAlertException(String defaultMessage, String entityname, String errorKey)
    {
        super(defaultMessage);
        this.errorKey=errorKey;
        this.entityname = entityname;
    }

    public String getEntityname() {
        return entityname;
    }

    public String getErrorKey() {
        return errorKey;
    }
}
