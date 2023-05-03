package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List<Department> getAllDepartments();
}
