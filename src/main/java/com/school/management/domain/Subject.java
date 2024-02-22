package com.school.management.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@EntityListeners(AbstractAuditingEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "subject")
public class Subject extends AbstractAuditingEntity
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subjectName;
    private String Description;
    private String grade;
    @ManyToOne
    @JoinColumn(name = "classroom_id",referencedColumnName = "id")
    private Classroom classroom;


    @OneToMany(mappedBy = "subject")
    private List<Result> results;

    // Other methods
}
