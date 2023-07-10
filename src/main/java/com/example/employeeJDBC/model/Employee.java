package com.example.employeeJDBC.model;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import lombok.Data;
	import lombok.Getter;
	import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Employee {
   @Id
   private String empId;
  
   private String empName;
}