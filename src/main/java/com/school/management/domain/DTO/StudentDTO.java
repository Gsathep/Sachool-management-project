package com.school.management.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private Long id;
    private String username;
    private String email;
    private String password;
    private String role;
    private boolean isEnabled;
    private String address;
    private String phone;
    private LocalDate joinDate;
    private String parentName;
    private LocalDate dob;
    private String createdBy;

    private Instant createdDate = Instant.now();

    private String lastModifiedBy;

    private Instant lastModifiedDate = Instant.now();


}
