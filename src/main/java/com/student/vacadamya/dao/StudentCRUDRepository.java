package com.student.vacadamya.dao;

import com.student.vacadamya.model.dao.StudentEntity;
import org.springframework.data.repository.CrudRepository;


public interface StudentCRUDRepository extends CrudRepository<StudentEntity, Long> {

    StudentEntity getStudentById(final Long id);

    StudentEntity getStudentByLastName(final String lastName);
}
