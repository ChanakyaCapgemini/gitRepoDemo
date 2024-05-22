package com.employee.microservices.EmployeePortal.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.microservices.EmployeePortal.EmpDTO.APIEmpResponseDto;
import com.employee.microservices.EmployeePortal.EmpDTO.DepartmentDto;
import com.employee.microservices.EmployeePortal.EmpDTO.EmployeeDto;
import com.employee.microservices.EmployeePortal.Entity.Employee;
import com.employee.microservices.EmployeePortal.Repository.EmployeeRepository;
import com.employee.microservices.EmployeePortal.service.APIClient;
import com.employee.microservices.EmployeePortal.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	@Autowired
	APIClient apiClient;
	
	@Override
	public EmployeeDto saveEmployee(EmployeeDto empdto) {
		
		Employee emp = new Employee();
		emp.setEmpId(empdto.getEmpId());
		emp.setName(empdto.getName());
		emp.setSalary(empdto.getSalary());
		emp.setDeptCode(empdto.getDeptCode());
		repo.save(emp);
		return empdto;
	}

	@Override
	public List<EmployeeDto> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> empList = repo.findByName(name);
		List<EmployeeDto> edto = new ArrayList<>();
		for(Employee e : empList)
		{
			edto.add(convert(e));
		}
		return edto;
	}
	private EmployeeDto convert(Employee emp)
	{
		EmployeeDto empdto = new EmployeeDto();
		empdto.setEmpId(emp.getEmpId());
		empdto.setName(emp.getName());
		empdto.setSalary(emp.getSalary());
		return empdto;
		
	}
	public APIEmpResponseDto getEmployeeById(String id) {
		DepartmentDto departmentDto = new DepartmentDto();
		APIEmpResponseDto empAPIResponseDto = new APIEmpResponseDto();
		EmployeeDto empDto = new EmployeeDto();
		empDto.setEmpId("1234");
		empDto.setName("sai");
		empDto.setSalary(1234);
		empDto.setDeptCode(007);
		departmentDto.setCode(007);
		departmentDto.setId("1234");
		departmentDto.setName("sales");
		 empAPIResponseDto.setDeptDto(departmentDto);
		 empAPIResponseDto.setEmpDto(empDto);
		
//		Employee employee = repo.findById(id).get();
//		DepartmentDto departmentDto = apiClient.getDeparment(employee.getDeptCode());
//		APIEmpResponseDto empAPIResponseDto = new APIEmpResponseDto();
//		EmployeeDto empDto = new EmployeeDto();
//		empDto.setEmpId(employee.getEmpId());
//		empDto.setName(employee.getName());
//		empDto.setSalary(employee.getSalary());
//		empDto.setDeptCode(employee.getDeptCode());
//		 empAPIResponseDto.setDeptDto(departmentDto);
//		 empAPIResponseDto.setEmpDto(empDto);
		 return empAPIResponseDto;
		
	}

}
