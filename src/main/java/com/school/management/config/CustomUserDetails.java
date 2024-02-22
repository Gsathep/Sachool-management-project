package com.school.management.config;


import com.school.management.domain.Student;
import com.school.management.service.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetails implements UserDetailsService {
    private final StudentRepo studentRepo;

    public CustomUserDetails(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student = studentRepo.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("Student not found with username: " + username));
        return new org.springframework.security.core.userdetails.User(student.getUsername(), student.getPassword(), Collections.emptyList());
    }

}
