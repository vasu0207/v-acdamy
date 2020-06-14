package com.student.vacadamya.model;

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
public class DepartmentRequest {
    @Min(1)
    @Positive(message = "Department id cannot be negative")
    private Optional<Long> deptId;
    @NotBlank(message = "Department Name cannot be empty.")
    private Optional<String> deptName;

    public Optional<Long> getDeptId() {
        return Optional.ofNullable(deptId).get();
    }

    public Optional<String> getDeptName() {
        return Optional.ofNullable(deptName).get();
    }
}
