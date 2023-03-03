package com.saksoft.Employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saksoft.Employee.dao.EmployeeRepository;
import com.saksoft.Employee.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	
	public Employee createEmployee(Employee emp) {
	
		return employeeRepository.save(emp);
}
	   public Optional<Employee> findEmployeeById(Long id) {
		   
		   return employeeRepository.findById(id);
	   }
	   
	public Employee updateEmployee(Employee employee, Long id) {
		
		Optional<Employee>opEmp=employeeRepository.findById(id);
		Employee emp=opEmp.get();
		
		emp.setFirstName(employee.getFirstName());
		emp.setLastName(employee.getLastName());
		emp.setEmailId(employee.getEmailId()); 
		emp.setAge(employee.getAge()); 
		
		return employeeRepository.save(emp);
	}
	public void  deleteuser(Employee emp, Long id) {
		
		employeeRepository.deleteById(id); ;
	}
	}
	

