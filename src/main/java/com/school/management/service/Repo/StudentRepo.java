package com.school.management.service.Repo;

import com.school.management.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>
{

    boolean existsByUsername(String username);
    Optional<Student> findByUsername(String username);


    boolean existsByEmail(String email);

    Optional<Student> findByEmail(String email);
}
