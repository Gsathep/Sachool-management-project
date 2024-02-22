package com.school.management.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceDTO {

    private Long id;
    private Long studentId;
    private LocalDate attendanceDate;
    private boolean status;
    private Long teacherId;
}
