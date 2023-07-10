package com.example.employeeJDBC.repository;

import java.util.List;

import com.example.employeeJDBC.model.Employee;

public interface EmployeeService {
   List<Employee> getAllEmployee();
   void addEmployee(Employee e);
   
}
