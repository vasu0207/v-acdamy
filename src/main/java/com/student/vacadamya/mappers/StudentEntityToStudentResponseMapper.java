package com.student.vacadamya.mappers;

import com.student.vacadamya.model.DepartmentResponse;
import com.student.vacadamya.model.StudentResponse;
import com.student.vacadamya.model.dao.DepartmentEntity;
import com.student.vacadamya.model.dao.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StudentEntityToStudentResponseMapper {
    @Mapping(source="departmentEntity", target="departmentResponse")
    StudentResponse studentEntityToStudentResponse(StudentEntity studentEntity);

    DepartmentResponse departmentEntityToDepartmentResponse(DepartmentEntity departmentEntity);
}
