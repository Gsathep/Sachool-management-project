package com.school.management.web.exception.handler;

public class EmailAlreadyUsedException extends BadRequestAlertException
{
    public EmailAlreadyUsedException()
    {
        super(ErrorConstants.EMAIL_ALREADY_USED_TYPE," ","email-already-used");
    }
}
