package uit.se341.HRM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uit.se341.HRM.entity.Department;
import uit.se341.HRM.repository.IDepartmentRepository;

/**
*@author jm
*@version 1.0 Sep 18, 2017
*/
@Service("departmentService")
public class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	private IDepartmentRepository departmentRepository;
	
	@Override
	public void save(Department department) {
		departmentRepository.save(department);
	}

	@Override
	public List<Department> findAll() {
		return departmentRepository.findAll();
	}

}
