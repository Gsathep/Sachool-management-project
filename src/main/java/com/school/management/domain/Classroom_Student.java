package com.school.management.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@EntityListeners(AbstractAuditingEntity.class)
@Entity
@Table(name = "classroom_student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classroom_Student  extends AbstractAuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    @ManyToOne
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private Student student;


}
