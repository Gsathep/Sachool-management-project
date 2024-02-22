package com.school.management.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamDTO {

    private Long id;
    private String examName;
    private LocalDate examDate;
    private String examType;
    private List<Long> resultIds;

    // Constructors, getters, setters, etc.
}
