package com.student.vacadamya.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VACADAMY_DEPARTMENT")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="DEPT_ID")
    private Long deptId;

    @Column(name="dept_name")
    private String deptName;

}
