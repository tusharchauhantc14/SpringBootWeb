package com.springbootwebproject.springbootwebproject.controllers;

import com.springbootwebproject.springbootwebproject.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping(path="/getSecretMessage")
    public String getMySecretMessage(){
        return "Secret message: hghldhlkhal";
    }
    @GetMapping(path="/{employeeId}")
    public EmployeeDTO getEmployeeId(@PathVariable Long  employeeId){
        return new EmployeeDTO(employeeId,"tushar","tushar@gmail.com",23, LocalDate.of(2024,11,17),true);
    }

    @GetMapping
    public String getAllEmployees(@RequestParam(required = false) Integer age,
                                  @RequestParam(required = false) String sortBy){
        return "Hi age "+age+" "+sortBy;
    }

    @PostMapping
    public EmployeeDTO createNewEmpoyee(@RequestBody EmployeeDTO inputEmployee){
        inputEmployee.setId(100L);
        return inputEmployee;
//        return "Hello from POST";
    }
}
