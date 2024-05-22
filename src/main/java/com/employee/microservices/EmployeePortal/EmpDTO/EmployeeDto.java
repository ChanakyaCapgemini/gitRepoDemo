package com.employee.microservices.EmployeePortal.EmpDTO;

import lombok.Data;

@Data
public class EmployeeDto {
	private String empId;
	private String name;
	private long salary;
	private long deptCode;
}
