package uit.se341.HRM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uit.se341.HRM.entity.Employee;
import uit.se341.HRM.service.IEmployeeService;

/**
*@author jm
*@version 1.0 Sep 18, 2017
*/
@RestController
@RequestMapping(value = "/rest-employee")
public class RestEmployeeController {
	@Autowired
	private IEmployeeService employeeService;
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> listEmployee(){
		List<Employee> employees = employeeService.findAll();
		if(employees.isEmpty()){
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/employee/{empId}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getTrainee(@PathVariable("empId") String id) {
		Employee employee = employeeService.findOne(id);
		if (null == employee) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
}
