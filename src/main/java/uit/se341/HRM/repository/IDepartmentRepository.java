package uit.se341.HRM.repository;

import java.util.List;

import uit.se341.HRM.entity.Department;

/**
*@author jm
*@version 1.0 Sep 18, 2017
*/
public interface IDepartmentRepository {
	
	public void save(Department department);
	public List<Department> findAll();
}
