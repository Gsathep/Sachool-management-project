package com.school.management.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@EntityListeners(AbstractAuditingEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "student")
public class Student extends AbstractAuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username")
    private String username;


    @NaturalId(mutable = true)
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String Role;

    @Column(name = "is_enabled")
    private boolean isEnabled = false;


    @Column(name = "address")
    private String address;

    @Column(name = "phone") // Assuming phone is a varchar in the database
    private String phone; // Change data type to String

    @Column(name = "join_date")
    private LocalDate joinDate;

    @Column(name = "parent_name")
    private String parentName;

    @Column(name = "dob")
    private LocalDate dob;

    @OneToMany(mappedBy = "student")
    private List<Result> results;

    @OneToMany(mappedBy = "student")
    private List<Issues> issues;

    @OneToMany(mappedBy = "student")
    private List<Attendance> attendances;

    @OneToMany(mappedBy = "student")
    private List<Classroom_Student> classroomStudents;


}
