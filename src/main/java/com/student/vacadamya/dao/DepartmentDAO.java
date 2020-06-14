package com.student.vacadamya.dao;

import com.student.vacadamya.model.dao.DepartmentEntity;
import com.student.vacadamya.model.dao.StudentEntity;

public interface DepartmentDAO {
    public DepartmentEntity getDepartmentById(final Long id);
}
