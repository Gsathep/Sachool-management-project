package com.school.management.domain.DTO;

import com.school.management.domain.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomDTO {

    private Long id;
    private String section;
    private int grade;
    private Long teacherId;
    private List<Long> subjectIds;
    private Long timetableId;
    // Constructors, getters, setters, etc.
}
