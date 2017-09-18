package uit.se341.HRM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uit.se341.HRM.entity.Department;
import uit.se341.HRM.entity.Employee;
import uit.se341.HRM.repository.IEmployeeRepository;

/**
*@author jm
*@version 1.0 Sep 18, 2017
*/
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeRepository employeeRepository;
	
	@Override
	public void save(Employee employee, Department department) {
		employee.setDepartment(department);
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findByDepartment(String id) {
		return employeeRepository.findByDepartment(id);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findOne(String id) {
		return employeeRepository.findOne(id);
	}

}
