package com.employee.microservices.EmployeePortal.EmpDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class APIEmpResponseDto {
 private EmployeeDto empDto; 
 private DepartmentDto deptDto;
}
