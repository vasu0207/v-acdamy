package com.student.vacadamya.dao;

import com.student.vacadamya.model.bo.StudentBO;
import com.student.vacadamya.model.dao.StudentDto;
import com.student.vacadamya.model.dao.StudentEntity;

public interface StudentDAO {
    StudentEntity getStudentById(final Long id);

    StudentEntity getStudentByLastName(final String lastName);

    void saveStudent(final StudentDto studentDto);
}
