package com.student.vacadamya.mappers;

import com.student.vacadamya.model.bo.DepartmentBO;
import com.student.vacadamya.model.bo.StudentBO;
import com.student.vacadamya.model.dao.DepartmentDto;
import com.student.vacadamya.model.dao.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface StudentBOToStudentDtoMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "departmentBO", target = "departmentDto")

    StudentDto map(StudentBO studentBO);

    @Mapping(source = "deptId", target = "deptId", qualifiedByName = "unwrap")
    @Mapping(source = "deptName", target = "deptName", qualifiedByName = "unwrap")
    DepartmentDto departmentBOToDepartmentDto(DepartmentBO departmentBO);

}
