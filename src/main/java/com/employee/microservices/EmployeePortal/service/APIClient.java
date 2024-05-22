package com.employee.microservices.EmployeePortal.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.microservices.EmployeePortal.EmpDTO.DepartmentDto;

@FeignClient(url = "http://localhost:8081", value = "department")
public interface APIClient {
	// build get department rest api
	@GetMapping("/deptCode")
	DepartmentDto getDeparment(@RequestParam long code);
}
