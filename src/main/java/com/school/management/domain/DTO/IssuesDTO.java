package com.school.management.domain.DTO;


import com.school.management.domain.Student;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssuesDTO {
    private Long id;
    private String title;
    private String details;
    private Student student;
    private Boolean isResolved;
    private String type;
}
