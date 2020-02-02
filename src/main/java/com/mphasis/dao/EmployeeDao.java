package com.mphasis.dao;

import java.util.List;

import com.mphasis.bean.Employee;



public interface EmployeeDao {
	public void addEmployee(Employee p);
	public void updateEmployee(Employee p);
	public List<Employee> listEmployees();
	public Employee getEmployeeById(int id);
	public void removeEmployee(int id);
}
