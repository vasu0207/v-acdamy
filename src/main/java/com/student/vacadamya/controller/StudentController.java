package com.student.vacadamya.controller;

import com.student.vacadamya.mappers.StudentEntityToStudentResponseMapper;
import com.student.vacadamya.mappers.StudentRequestToStudentBOMapper;
import com.student.vacadamya.model.DepartmentResponse;
import com.student.vacadamya.model.StudentRequest;
import com.student.vacadamya.model.StudentResponse;
import com.student.vacadamya.model.dao.DepartmentEntity;
import com.student.vacadamya.model.dao.StudentEntity;
import com.student.vacadamya.service.DepartmentService;
import com.student.vacadamya.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudentController {


    private StudentService studentService;

    private DepartmentService departmentService;

    private StudentRequestToStudentBOMapper studentRequestToStudentBOMapper;

    private StudentEntityToStudentResponseMapper studentEntityToStudentResponseMapper;

    @Autowired
    public StudentController(StudentService studentService,
                             StudentRequestToStudentBOMapper studentRequestToStudentBOMapper,
                             StudentEntityToStudentResponseMapper studentEntityToStudentResponseMapper) {

        this.studentService = studentService;
        this.studentRequestToStudentBOMapper = studentRequestToStudentBOMapper;
        this.studentEntityToStudentResponseMapper = studentEntityToStudentResponseMapper;
    }

    @RequestMapping("/getStudentById/{studentId}")
    public void getStudentProfiles(@PathVariable Long studentId){
        System.out.println("************* "+studentService.getStudentById(studentId));
    }


    @RequestMapping("/getDepartmentById/{departmentId}")
    public DepartmentResponse getDepartmentById(@PathVariable Long departmentId){
        log.info("Entered getDepartmentById {} ",departmentId);
        final DepartmentEntity departmentById = departmentService.getDepartmentById(departmentId);
        log.info("Entered getDepartmentById {} ",departmentById);
        return studentEntityToStudentResponseMapper.departmentEntityToDepartmentResponse(departmentById);
    }

    @RequestMapping("/getStudentByLasName/{lastName}")
    public StudentResponse getDepartmentById(@PathVariable String lastName){
        final StudentEntity studentByLastName = studentService.getStudentByLastName(lastName);
        log.info("Student by last name {}",studentByLastName);
        return studentEntityToStudentResponseMapper.studentEntityToStudentResponse(studentByLastName);
    }

    @RequestMapping("/saveStudent")
    public void getDepartmentById(@RequestBody StudentRequest studentRequest){
        studentService.saveStudent(studentRequestToStudentBOMapper.studentRequestToStudentBO(studentRequest));
    }
}
