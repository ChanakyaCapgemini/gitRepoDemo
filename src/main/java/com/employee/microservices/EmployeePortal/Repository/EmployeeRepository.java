package com.employee.microservices.EmployeePortal.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.microservices.EmployeePortal.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
	public List<Employee> findByName(String name);
}
