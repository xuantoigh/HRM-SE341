package uit.se341.HRM.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

/**
*@author jm
*@version 1.0 Sep 11, 2017
*/
@Entity
@Table(name = "DEPARTMENT")
public class Department {
@Id
@Column(name = "id")
private String id;	
@Column(name = "name", nullable = false)
private String name;
@Column(name = "manager", nullable = false)
private String manager;
@Column(name = "liststaff", nullable = false)
private List<Employee> listStaff;

public Department() {
	super();
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getManager() {
	return manager;
}
public void setManager(String manager) {
	this.manager = manager;
}
public List<Employee> getListStaff() {
	return listStaff;
}
public void setListStaff(List<Employee> listStaff) {
	this.listStaff = listStaff;
}

}
