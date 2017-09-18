package uit.se341.HRM.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import uit.se341.HRM.entity.Department;

/**
*@author jm
*@version 1.0 Sep 18, 2017
*/
@Repository("departmentRepository")
public class DepartmentRepositoryImpl implements IDepartmentRepository{

	@Autowired
	private MongoTemplate mongoTemplate;
	private final String COLLECTION = "department";
	
	@Override
	public void save(Department department) {
		mongoTemplate.save(department, COLLECTION);
		
	}

	@Override
	public List<Department> findAll() {
		return mongoTemplate.findAll(Department.class, COLLECTION);
	}

}
