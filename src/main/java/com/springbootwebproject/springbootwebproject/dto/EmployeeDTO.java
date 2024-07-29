package com.springbootwebproject.springbootwebproject.dto;

import com.springbootwebproject.springbootwebproject.annotations.EmployeeRoleValidation;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EmployeeDTO {
    private Long id;

    //    @NotNull(message = "Required Field in Employee: name")
//    @NotEmpty(message = "name of the employee cannot be empty")
    @NotBlank(message = "Name of the employee cannot be blank")
    @Size(min = 3, max = 10, message = "Number of characters in name should be in the range: [3,10]")
    private String name;

    @NotBlank(message = "Email of the employee cannot be blank")
    @Email(message = "Email should be a valid email")
    private String email;

    @NotNull(message = "age of the employee can not be null")
    @Max(value = 80, message = "age cannot be greater than 80")
    @Min(value = 18, message = "age cannot be less than 18")
    private Integer age;

    @NotBlank(message = "Role of the employee cannot be blank")
//    @Pattern(regexp = "^(ADMIN|USER)$",message = "Role of Employee can either be USER OR ADMIN")
    @EmployeeRoleValidation
    private String role;//ADMIN, USER

    @NotNull(message = "Salary of Employee should not be null")
    @Positive(message = "Salary of Employee should be positive")
    @Digits(integer = 6, fraction = 2, message = "The salary can be in the form XXXXXX.YY")
    @DecimalMax(value = "100000.99")
    @DecimalMin(value = "100.50")
    private Double salary;

    @PastOrPresent(message = "DateOfJoining field of Employee cannot be in the future")
    private LocalDate dateOfJoining;

    @AssertTrue(message = "Employee should be active")
    private Boolean isActive;
    public EmployeeDTO(){

    }
    public EmployeeDTO(Long id, String name, String email, Integer age, LocalDate dateOfJoining, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
        this.isActive = isActive;
    }
}
