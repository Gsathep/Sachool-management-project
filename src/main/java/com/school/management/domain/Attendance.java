package com.school.management.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@EntityListeners(AbstractAuditingEntity.class)
@Entity
@Table(name = "attendance")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attendance extends AbstractAuditingEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private Student student;

    @Column(name = "attendance_date")
    private LocalDate attendanceDate;

    private boolean status;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    // Constructors, getters, setters, etc.

    // Other methods
}
