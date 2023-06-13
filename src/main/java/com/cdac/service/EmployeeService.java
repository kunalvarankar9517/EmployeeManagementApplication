package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.entities.Employee;
import com.cdac.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;

	// save employee
	public Integer saveEmployee(Employee employee) {
		Employee emp = employeeRepo.save(employee);
		return emp.getEmpId();
	}

	// show all employees
	public List<Employee> getAllEmployee() {
		List<Employee> employee = employeeRepo.findAll();
		return employee;
	}
	// delete employee by id
	public void deleteEmployeeById(Integer id) {
		employeeRepo.deleteById(id);
	}
	
	// get one employee using id
	public Employee getOneEmployee(Integer id) {
		return employeeRepo.findById(id).get();
	}

	// update employee
	public Integer updateEmployee(Employee employee) {
		Employee e = employeeRepo.save(employee);
		Integer empId = e.getEmpId();
		return empId;
	}
}
