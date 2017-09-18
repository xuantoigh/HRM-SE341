package uit.se341.HRM.repository;

import java.util.List;

import uit.se341.HRM.entity.Employee;

/**
*@author jm
*@version 1.0 Sep 18, 2017
*/
public interface IEmployeeRepository {

	public void save(Employee employee);
	public List<Employee> findAll();
	public List<Employee> findByDepartment(String id);
	public Employee findOne(String id);
}
