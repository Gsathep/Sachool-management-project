package com.school.management.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.List;

@EntityListeners(AbstractAuditingEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "exam")
public class Exam  extends AbstractAuditingEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String exam_Name;
    private LocalDate exam_Date;

    private String examType;

    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL)
    private List<Result> result;
}
