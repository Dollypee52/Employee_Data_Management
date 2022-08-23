package com.semicolon.Employee_Data_Management;

import com.semicolon.Employee_Data_Management.data.model.Employee;
import com.semicolon.Employee_Data_Management.data.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeDataManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDataManagementApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception{
		Employee employee1 = new Employee("Dolapo", "Temitope", "dolapo@gmail.com");
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Seun", "Tolulope", "seun@gmail.com");
		employeeRepository.save(employee2);

		Employee employee3 = new Employee("Lara", "Ogunsola", "lara@gmail.com");
		employeeRepository.save(employee3);
	}
	}

