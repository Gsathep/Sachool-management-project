package com.school.management.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@EntityListeners(AbstractAuditingEntity.class)
@Entity
@Table(name = "issues")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Issues extends AbstractAuditingEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String details;

    @ManyToOne
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private Student student;

    private Boolean is_resolved;

    // Assuming type represents the type of issue
    private String type;

    // Constructors, getters, setters, etc.

    // Other methods
}
