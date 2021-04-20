package com.jun.unittesting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jun.unittesting.entity.Employee;
import com.jun.unittesting.repository.EmployeeRepository;

public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	public Employee getEmployeeByName(String name) {
		return empRepo.findByName(name);
	}

	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}


}
