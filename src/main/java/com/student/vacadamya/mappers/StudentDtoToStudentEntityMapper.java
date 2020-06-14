package com.student.vacadamya.mappers;

import com.student.vacadamya.model.bo.StudentBO;
import com.student.vacadamya.model.dao.DepartmentDto;
import com.student.vacadamya.model.dao.DepartmentEntity;
import com.student.vacadamya.model.dao.StudentDto;
import com.student.vacadamya.model.dao.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentDtoToStudentEntityMapper {
    @Mapping(source = "departmentDto", target="departmentEntity")
    StudentEntity StudentBOToStudentDao(StudentDto studentDto);
    DepartmentEntity StudentBOToStudentDao(DepartmentDto departmentDto);

}
