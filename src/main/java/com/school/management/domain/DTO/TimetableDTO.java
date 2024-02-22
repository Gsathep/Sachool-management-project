package com.school.management.domain.DTO;



import com.school.management.domain.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimetableDTO {

    private Long id;
    private Subject subject;
    private DayOfWeek day;
    private LocalTime time;
    private List<ClassroomDTO> classrooms;


}
