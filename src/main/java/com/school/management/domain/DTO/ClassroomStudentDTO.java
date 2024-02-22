package com.school.management.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomStudentDTO {

    private Long id;
    private Long classroomId;
    private Long studentId;

    // Constructors, getters, setters, etc.
}
