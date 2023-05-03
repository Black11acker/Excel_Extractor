package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Employee;

import com.arjuncodes.studentsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String add(@RequestBody Employee employee){
    	employeeService.saveEmployee(employee);
        return "New Employee is added";
    }

    @GetMapping("/getAll")
    public List<Employee> list(){
        return employeeService.getAllEmployees();
    }
}
