package com.example.employeeJDBC.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  EmployeeDAO extends JpaRepository<Employee,String> {
   
}
