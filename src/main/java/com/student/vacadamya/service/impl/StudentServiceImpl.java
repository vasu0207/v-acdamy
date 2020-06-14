package com.student.vacadamya.service.impl;

import com.student.vacadamya.dao.StudentDAO;
import com.student.vacadamya.mappers.StudentRequestToStudentBOMapper;
import com.student.vacadamya.mappers.StudentBOToStudentDtoMapper;
import com.student.vacadamya.model.DepartmentRequest;
import com.student.vacadamya.model.bo.StudentBO;
import com.student.vacadamya.model.dao.StudentEntity;
import com.student.vacadamya.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {


    private final StudentDAO studentDAO;

    private StudentRequestToStudentBOMapper studentRequestToStudentBOMapper;

    private StudentBOToStudentDtoMapper studentBOToStudentDtoMapper;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO,
                              StudentBOToStudentDtoMapper studentBOToStudentDtoMapper) {
        this.studentDAO = studentDAO;
        this.studentBOToStudentDtoMapper = studentBOToStudentDtoMapper;
    }

    @Override
    public StudentEntity getStudentById(final Long id) {
        return studentDAO.getStudentById(id);
    }

    @Override
    public StudentEntity getStudentByLastName(final String lastName) {
        return studentDAO.getStudentByLastName(lastName);
    }

    @Override
    public void saveStudent(StudentBO studentBO) {
        studentDAO.saveStudent(
                studentBOToStudentDtoMapper.map(studentBO));
    }
}
