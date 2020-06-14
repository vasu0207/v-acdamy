package com.student.vacadamya.service;

import com.student.vacadamya.model.bo.StudentBO;
import com.student.vacadamya.model.dao.StudentEntity;


public interface StudentService {

    StudentEntity getStudentById(final Long id);

    StudentEntity getStudentByLastName(final String lastName);

    void saveStudent(final StudentBO studentDto);

}
