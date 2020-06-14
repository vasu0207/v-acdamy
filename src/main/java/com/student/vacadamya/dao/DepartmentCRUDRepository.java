package com.student.vacadamya.dao;

import com.student.vacadamya.model.dao.DepartmentEntity;
import com.student.vacadamya.model.dao.StudentEntity;
import org.springframework.data.repository.CrudRepository;


public interface DepartmentCRUDRepository extends CrudRepository<DepartmentEntity, Long> {

    DepartmentEntity getDepartmentByDeptId(final Long id);
}
