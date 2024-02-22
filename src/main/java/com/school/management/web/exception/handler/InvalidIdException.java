package com.school.management.web.exception.handler;

public class InvalidIdException extends  BadRequestAlertException
{
    public InvalidIdException()
    {
        super(ErrorConstants.INVALID_ID_TYPE,"user-management","invalid-id");
    }

}
