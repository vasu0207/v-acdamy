package com.student.vacadamya.dao.impl;


import com.student.vacadamya.dao.DepartmentCRUDRepository;
import com.student.vacadamya.dao.DepartmentDAO;
import com.student.vacadamya.dao.StudentCRUDRepository;
import com.student.vacadamya.model.dao.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

    private final DepartmentCRUDRepository departmentCRUDRepository;

    @Autowired
    public DepartmentDAOImpl(DepartmentCRUDRepository departmentCRUDRepository) {
        this.departmentCRUDRepository = departmentCRUDRepository;
    }


    @Override
    public DepartmentEntity getDepartmentById(final Long id) {
        return departmentCRUDRepository.getDepartmentByDeptId(id);
    }
}
