package uit.se341.HRM.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import uit.se341.HRM.entity.Employee;

/**
*@author jm
*@version 1.0 Sep 18, 2017
*/
@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements IEmployeeRepository {

	@Autowired
	private MongoTemplate mongoTemplate;
	private final String COLLECTION = "employee";
	
	@Override
	public void save(Employee employee) {
		mongoTemplate.save(employee, COLLECTION);
	}

	@Override
	public List<Employee> findByDepartment(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("department").is(id));
		return mongoTemplate.find(query, Employee.class);
	}

	@Override
	public List<Employee> findAll() {
		return mongoTemplate.findAll(Employee.class, COLLECTION);
	}

	@Override
	public Employee findOne(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("employee").is(id));
		return (Employee) mongoTemplate.find(query, Employee.class);
	}

}
