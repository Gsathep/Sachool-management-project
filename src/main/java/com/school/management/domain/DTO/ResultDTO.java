package com.school.management.domain.DTO;

import com.school.management.domain.Exam;
import com.school.management.domain.Student;
import com.school.management.domain.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO {

    private Long id;

    private Student student;

    private Exam exam;

    private Subject subject;

    private int maxMarks;

    private int passMarks;

}
