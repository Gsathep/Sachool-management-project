package com.school.management.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@EntityListeners(AbstractAuditingEntity.class)
@Entity
@Table(name = "classroom")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classroom extends AbstractAuditingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "classroom_name")
    private String section;

    private int grade;

    @ManyToOne
    @JoinColumn(name = "teacher_id",referencedColumnName = "id")
    private Teacher teacher;

    @OneToMany(mappedBy = "classroom")
    private List<Subject> subjects;

    @ManyToOne
    @JoinColumn(name = "timetable_id",referencedColumnName = "id")
    private Timetable timetable;

    // Constructors, getters, setters, etc.

    // Other methods
}
