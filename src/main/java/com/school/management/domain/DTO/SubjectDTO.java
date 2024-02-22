package com.school.management.domain.DTO;


import com.school.management.domain.Classroom;
import com.school.management.domain.Result;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubjectDTO {

    private Long id;
    private String subjectName;
    private String description;
    private String grade;
    private Classroom classroom;
    private List<Result> results;

}
