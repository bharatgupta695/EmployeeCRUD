package com.example.employeeJDBC.controllers;
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
	import com.example.employeeJDBC.model.Employee;
	import com.example.employeeJDBC.repository.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
   EmployeeService empService;
@GetMapping("/listEmployee")
 public List<Employee> fetchAllEmployee(){
       return empService.getAllEmployee() ;
       }
@PostMapping("/addEmployee")
public void addEmployee(@RequestBody Employee e)
 {
   empService.addEmployee(e);
  }
}

