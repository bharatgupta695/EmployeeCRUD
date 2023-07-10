package com.example.employeeJDBC.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.employeeJDBC.model.Employee;
import com.example.employeeJDBC.model.EmployeeDAO;

@Repository
public class EmployeeServiceImpl implements EmployeeService {
     @Autowired
     EmployeeDAO dao;
     @Override
     public List<Employee>getAllEmployee(){
    	 // TODO Auto -generated method
    	 return dao.findAll();
     }
     
     public void addEmployee(Employee e) {
    	 dao.save(e);
     }
}
