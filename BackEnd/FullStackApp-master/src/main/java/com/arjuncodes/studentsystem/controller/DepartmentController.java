package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Department;

import com.arjuncodes.studentsystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Department")
@CrossOrigin
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/add")
    public String add(@RequestBody Department department){
    	departmentService.saveDepartment(department);
        return "New Department is added";
    }

    @GetMapping("/getAll")
    public List<Department> list(){
        return departmentService.getAllDepartments();
    }
}
