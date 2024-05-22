package com.employee.microservices.EmployeePortal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Employee")
@Getter
@Setter
public class Employee {
	@Id 
	private String empId;
	private String name;
	private long salary;
	private long deptCode;
}
