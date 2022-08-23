package com.semicolon.Employee_Data_Management.service;

import com.semicolon.Employee_Data_Management.data.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);

}
