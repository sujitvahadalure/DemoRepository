package com.saksoft.Employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saksoft.Employee.entity.Employee;
import com.saksoft.Employee.service.EmployeeService;



@RestController
public class EmployeeController {
	
	
		
		    @Autowired
		    EmployeeService employeeService; 
		
		    
		   @PostMapping("/employee")
		   public Employee createEmployee(@RequestBody Employee employee ) {
		 
			    System.out.println ("Inside controller");
			    return employeeService.createEmployee(employee);
			    
		   }
		   @GetMapping("/employee/{id}")
		    public Optional<Employee> findEmployeeById(@PathVariable Long id) {
			   return employeeService.findEmployeeById(id);
		   }
		   @PutMapping("/employee")
		     public Employee updateEmployee(@RequestBody Employee employee,@RequestParam Long id ) {
			   return employeeService.updateEmployee(employee,id);

				   }
		   	   }
		   

