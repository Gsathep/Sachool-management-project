package com.school.management.web.exception.handler;

public class StudentAlreadyExistsException extends  RuntimeException
{
    public StudentAlreadyExistsException(String message) {
        super("this student Alreadyexist in system");
    }
}
