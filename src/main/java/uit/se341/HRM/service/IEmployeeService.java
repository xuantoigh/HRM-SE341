package uit.se341.HRM.service;

import java.util.List;

import uit.se341.HRM.entity.Department;
import uit.se341.HRM.entity.Employee;

/**
*@author jm
*@version 1.0 Sep 18, 2017
*/
public interface IEmployeeService {

	public void save(Employee employee, Department department);
	public List<Employee> findAll();
	public List<Employee> findByDepartment(String id);
	public Employee findOne(String id);
}
