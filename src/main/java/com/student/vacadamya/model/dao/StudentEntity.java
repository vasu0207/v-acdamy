package com.student.vacadamya.model.dao;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="VACADAMY_STUDENTS")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email")
    private String email;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="dept_Id")
    private DepartmentEntity departmentEntity;
}
