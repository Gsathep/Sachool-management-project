package com.school.management.web;

import com.school.management.config.JWT.JWTHelper;
import com.school.management.config.JWT.JwtRequst;
import com.school.management.config.JWT.JwtRespone;
import com.school.management.domain.DTO.StudentDTO;
import com.school.management.service.Repo.StudentRepo;
import com.school.management.service.StudentService;
import com.school.management.web.exception.handler.EmailAlreadyUsedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class StudentController
{
    @Autowired
   private StudentService studentService;
    @Autowired
   private StudentRepo studentRepo;
    @Autowired
    private JWTHelper jwtHelper;
    @Autowired
    private AuthenticationManager authenticationManager;

    public StudentController(StudentService studentService, StudentRepo studentRepo, JWTHelper jwtHelper, AuthenticationManager authenticationManager) {
        this.studentService = studentService;
        this.studentRepo = studentRepo;
        this.jwtHelper = jwtHelper;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/register")
    public ResponseEntity<StudentDTO>save(@RequestBody StudentDTO studentDTO)
    {
        if (studentRepo.existsByUsername(studentDTO.getUsername()))
        {
            log.error("username is already exist");
            throw new RuntimeException("Username already exists");
        }
        if (studentRepo.existsByEmail(studentDTO.getEmail()))
        {
            log.error("Email is already exist");
            throw new EmailAlreadyUsedException();
        }
        try {
            StudentDTO student1 = studentService.save(studentDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(student1);
        }
        catch (Exception e)
        {
            log.error(" An error occur when saved student",e);
            throw new RuntimeException("Failed to save student", e);
        }
        }


    @PostMapping("/login")
    public ResponseEntity<JwtRespone> login(@RequestBody JwtRequst jwtRequest) {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtHelper.generateToken(authentication);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + token);
        return new ResponseEntity<>(new JwtRespone(token), headers, HttpStatus.OK);
    }
}

