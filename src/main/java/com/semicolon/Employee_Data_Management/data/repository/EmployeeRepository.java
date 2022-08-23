package com.semicolon.Employee_Data_Management.data.repository;

import com.semicolon.Employee_Data_Management.data.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
