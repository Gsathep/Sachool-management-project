package com.school.management.domain.DTO;

import com.school.management.domain.eu.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String address;
    private LocalDate dateOfJoin;
    private Gender gender;
    private LocalDate dateOfBirth;
    private String phone;

}
