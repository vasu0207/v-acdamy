package com.student.vacadamya.mappers;

import com.student.vacadamya.model.DepartmentRequest;
import com.student.vacadamya.model.StudentRequest;
import com.student.vacadamya.model.bo.DepartmentBO;
import com.student.vacadamya.model.bo.StudentBO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface StudentRequestToStudentBOMapper {
    @Mapping(source = "id", target = "id", qualifiedByName = "unwrap")
    @Mapping(source = "firstName", target = "firstName", qualifiedByName = "unwrap")
    @Mapping(source = "lastName", target = "lastName", qualifiedByName = "unwrap")
    @Mapping(source = "email", target = "email", qualifiedByName = "unwrap")
    @Mapping(source = "departmentRequest", target = "departmentBO", qualifiedByName = "unwrap")
    StudentBO studentRequestToStudentBO(StudentRequest studentRequest);

    @Mapping(source = "deptId", target = "deptId", qualifiedByName = "unwrap")
    @Mapping(source = "deptName", target = "deptName", qualifiedByName = "unwrap")
    DepartmentBO studentRequestToDepartementBo(DepartmentRequest departmentRequest);

    @Named("unwrap")
    default <T> T unwrap(Optional<T> optional) {
        if(optional!= null && optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

}
