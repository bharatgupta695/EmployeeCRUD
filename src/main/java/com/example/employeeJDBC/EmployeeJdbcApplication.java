package com.example.employeeJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.employeeJDBC.model.Employee;

@SpringBootApplication
public class EmployeeJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeJdbcApplication.class, args);
	    Employee e = new Employee();
	    e.setEmpId("1");
	    e.setEmpName("abc");
	    System.out.println(e);
	}

}
