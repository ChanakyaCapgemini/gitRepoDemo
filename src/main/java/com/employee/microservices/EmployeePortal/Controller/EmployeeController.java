package com.employee.microservices.EmployeePortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.microservices.EmployeePortal.EmpDTO.APIEmpResponseDto;
import com.employee.microservices.EmployeePortal.EmpDTO.EmployeeDto;
import com.employee.microservices.EmployeePortal.impl.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl empl;
	
//	@Autowired
//	APIEmpResponseDto apiEmp;
	
	@PostMapping("/saveEmp")
	public EmployeeDto saveEmp(@RequestBody EmployeeDto empdto)
	{
		return empl.saveEmployee(empdto);
	}
	@GetMapping("/getEmp/{name}")
	public List<EmployeeDto> getEmp(@PathVariable("name") String name)
	{
		return empl.getEmployeeByName(name);
	}
	@GetMapping("/deptId")
	public APIEmpResponseDto getById(@RequestParam String id)
	{
		return empl.getEmployeeById(id);
	}
}
