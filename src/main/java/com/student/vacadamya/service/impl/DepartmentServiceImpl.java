package com.student.vacadamya.service.impl;

import com.student.vacadamya.dao.DepartmentDAO;
import com.student.vacadamya.model.dao.DepartmentEntity;
import com.student.vacadamya.model.dao.StudentEntity;
import com.student.vacadamya.service.DepartmentService;
import com.student.vacadamya.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;


    @Override
    public DepartmentEntity getDepartmentById(final Long id) {
        return departmentDAO.getDepartmentById(id);
    }
}
