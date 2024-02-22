package com.school.management.service;


import com.school.management.domain.DTO.StudentDTO;
import com.school.management.domain.Student;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface StudentService {
    StudentDTO save(StudentDTO studentDTO);


}
