package com.student.vacadamya.model.bo;

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
public class DepartmentBO {
    @Min(1)
    @Positive(message = "Department Id cannot be empty")
    private Long deptId;
    @NotBlank(message = "Department name cannot be empty")
    private String deptName;
}
