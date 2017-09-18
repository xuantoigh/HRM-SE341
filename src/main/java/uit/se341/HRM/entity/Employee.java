package uit.se341.HRM.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

/**
*@author jm
*@version 1.0 Sep 11, 2017
*/
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name = "id")
private String id;
@Column(name = "name", nullable = false)
private String name;
@Column(name = "birth", nullable = false)
@DateTimeFormat(style="dd/MM/yyyy")
private Date birth; 
@Column(name = "gender", nullable = false)
private String gender;
@Column(name = "department", nullable = false)
private Department department;
@Column(name = "salary", nullable = false)
private int salary;
@Column(name = "address", nullable = false)
private String address;
@Column(name = "email", nullable = false)
private String email;
@Column(name = "phone", nullable = false)
private String phone;

public Employee() {
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
public Date getBirth() {
	return birth;
}
public void setBirth(Date birth) {
	this.birth = birth;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}


}
