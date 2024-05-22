package com.employee.microservices.EmployeePortal.service;

import java.util.List;

import com.employee.microservices.EmployeePortal.EmpDTO.EmployeeDto;

public interface EmployeeService {
	 EmployeeDto saveEmployee(EmployeeDto empdto);
	 List<EmployeeDto> getEmployeeByName(String name);
}

