//package com.cdac.resource;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cdac.entities.Employee;
//import com.cdac.service.EmployeeService;
//
//
//
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//@RequestMapping("/employee")
//public class EmployeeResource {
//	@Autowired
//	private EmployeeService employeeService;
//
//	// 1. save employee
//	@PostMapping("/save")
//	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
//		Integer empId = employeeService.saveEmployee(employee);
//		String message = "Employee Addedd, Id : " + empId;
//		return new ResponseEntity<String>(message, HttpStatus.OK);
//	}
//
//	// 2. fetch all employees
//	@GetMapping("/show")
//	public ResponseEntity<List<Employee>> getAllEmployees() {
//		List<Employee> employees = employeeService.getAllEmployee();
//		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
//	}
//
//	// 3. delete employee by empId
//	@DeleteMapping("/delete/{empId}")
//	public ResponseEntity<String> deleteEmployee(@PathVariable("empId") Integer empId) {
//		employeeService.deleteEmployeeById(empId);
//		String message = "Employee Deleted, Id : " + empId;
//		return new ResponseEntity<String>(message, HttpStatus.OK);
//	}
//
//	// 4. fetch one employee based on empId
//	@GetMapping("/fetch/{employeeId}")
//	public ResponseEntity<Employee> getEmployee(@PathVariable("employeeId") Integer employeeId) {
//		Employee employee = employeeService.getOneEmployee(employeeId);
//		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
//	}
//
//	// 5. update employee
//	@PutMapping("/update")
//	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) {
//		Integer empId = employeeService.updateEmployee(employee);
//		String message = "Employee Updated, Id : " + empId;
//		return new ResponseEntity<String>(message, HttpStatus.OK);
//	}
//}
//
