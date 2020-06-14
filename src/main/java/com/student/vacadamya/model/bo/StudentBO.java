package com.student.vacadamya.model.bo;

import com.student.vacadamya.model.DepartmentRequest;
import com.student.vacadamya.model.dao.DepartmentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentBO {

    private Long  id;
    @NotBlank(message = "FirstName cannot be blank")
    private String firstName;
    @NotBlank(message = "LastName cannot be blank")
    private String  lastName;
    @NotBlank(message = "email cannot be blank")
    private String  email;
    @NotBlank(message = "Department cannot be blank")
    private DepartmentBO departmentBO;

}
