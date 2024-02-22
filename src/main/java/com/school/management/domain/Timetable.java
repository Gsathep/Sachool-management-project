package com.school.management.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;


@Entity
@Table(name = "timetable")
@Data
@EntityListeners(AbstractAuditingEntity.class)
@AllArgsConstructor
@NoArgsConstructor
public class Timetable extends AbstractAuditingEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subject_id",referencedColumnName = "id")
    private Subject subject;


    private DayOfWeek day;

@Column(name = "time")
    private LocalTime Time;

    @OneToMany(mappedBy = "timetable")
    private List<Classroom> classroom;

    // Constructors, getters, setters, etc.

    // Other methods
}
