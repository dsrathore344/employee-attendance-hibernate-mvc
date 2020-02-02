package com.mphasis.bean;

import java.util.TreeSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "employee")
public class Employee {
	
	
	@Id
	@Column(name = "empId")
	private int empId;
	
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Transient // to exclude a bean´s field from mapping from hibernate
	private TreeSet<String> stateNames;
	
	public Employee() {
		stateNames = new TreeSet();
		stateNames.add("Rajasthan");
		stateNames.add("Delhi");
		stateNames.add("Andhra Pradesh");
		stateNames.add("Uttar Pradhesh");
		stateNames.add("Karnataka");
	}



	public Employee(int empId, String firstName, String lastName, String dob, String city, String state) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.city = city;
		this.state = state;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public TreeSet<String> getStateNames() {
		return stateNames;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", city=" + city + ", state=" + state + "]";
	}
	
}
