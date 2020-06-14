package com.student.vacadamya.dao.impl;


import com.student.vacadamya.dao.StudentCRUDRepository;
import com.student.vacadamya.dao.StudentDAO;
import com.student.vacadamya.mappers.StudentDtoToStudentEntityMapper;
import com.student.vacadamya.model.dao.StudentDto;
import com.student.vacadamya.model.dao.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private final StudentCRUDRepository studentCRUDRepository;

    private StudentDtoToStudentEntityMapper studentBOToStudentDaoMapper;

    @Autowired
    public StudentDAOImpl(StudentCRUDRepository studentCRUDRepository,
                          StudentDtoToStudentEntityMapper studentBOToStudentDaoMapper) {
        this.studentCRUDRepository = studentCRUDRepository;
        this.studentBOToStudentDaoMapper = studentBOToStudentDaoMapper;
    }

    @Override
    public StudentEntity getStudentById(Long id) {
        return studentCRUDRepository.getStudentById(1L);
    }

    @Override
    public StudentEntity getStudentByLastName(final String lastName) {
        return studentCRUDRepository.getStudentByLastName(lastName);
    }

    @Override
    public void saveStudent(StudentDto studentDto) {
        final StudentEntity studentEntity = studentBOToStudentDaoMapper.StudentBOToStudentDao(studentDto);
        studentCRUDRepository.save(studentEntity);
    }
}
