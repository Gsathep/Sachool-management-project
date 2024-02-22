package com.school.management.domain;

import com.school.management.domain.eu.Gender;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalDate;

@EntityListeners(AbstractAuditingEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "teacher")
public class Teacher extends AbstractAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date_Of_Join;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    private String phone;


}
