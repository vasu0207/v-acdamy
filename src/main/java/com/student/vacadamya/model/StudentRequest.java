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
public class StudentRequest {

    private Optional<Long>  id;
    @NotBlank(message = "FirstName cannot be blank")
    private Optional<String>  firstName;
    @NotBlank(message = "LastName cannot be blank")
    private Optional<String>  lastName;
    @NotBlank(message = "email cannot be blank")
    private Optional<String>  email;
    @NotBlank(message = "Department cannot be blank")
    private Optional<DepartmentRequest> departmentRequest;

    public Optional<Long> getId() {
        if(Optional.ofNullable(id).isPresent()){

            return Optional.ofNullable(id).get();
        }
        return Optional.empty();
    }

    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName).get();
    }

    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName).get();
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email).get();
    }

    public Optional<DepartmentRequest> getDepartmentRequest() {
        return Optional.ofNullable(departmentRequest).get();
    }
}
