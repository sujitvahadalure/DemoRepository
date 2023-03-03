package com.saksoft.Employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saksoft.Employee.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

