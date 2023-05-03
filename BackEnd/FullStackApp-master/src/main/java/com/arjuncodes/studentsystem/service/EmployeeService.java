package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Employee;


import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
}
