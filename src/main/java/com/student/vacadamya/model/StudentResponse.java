package com.student.vacadamya.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private DepartmentRequest departmentRequest;

}
