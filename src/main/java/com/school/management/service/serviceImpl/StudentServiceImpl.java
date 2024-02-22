package com.school.management.service.serviceImpl;


import com.school.management.domain.DTO.StudentDTO;
import com.school.management.domain.Student;
import com.school.management.mapper.StudentMapper;
import com.school.management.service.Repo.StudentRepo;
import com.school.management.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
    private StudentMapper studentMapper;
@Autowired
    private final PasswordEncoder passwordEncoder;

    @Autowired
    private StudentRepo studentRepo;

    public StudentServiceImpl(StudentMapper studentMapper, PasswordEncoder passwordEncoder,  StudentRepo studentRepo) {
        this.studentMapper = studentMapper;
        this.passwordEncoder = passwordEncoder;
        this.studentRepo = studentRepo;
    }

    @Override
    public StudentDTO save(StudentDTO studentDTO)
    {
        log.debug("Request to save studentDTO ",studentDTO);
        Student student1 = studentMapper.toEntity(studentDTO);
        student1.setPassword(passwordEncoder.encode(studentDTO.getPassword()));
        Optional<Student> savedStudent = Optional.ofNullable(studentRepo.save(student1));
        return savedStudent.map(studentMapper::toDto)
            .orElseThrow(() -> new RuntimeException("Failed to save student"));
    }






}
