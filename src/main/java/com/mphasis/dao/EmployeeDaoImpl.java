package com.mphasis.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mphasis.bean.Employee;

@Repository
public class EmployeeDaoImpl {
	
	@Autowired
	private SessionFactory factory;
	
	//Add Employee
	public void addEmployee(Employee emp) {
		Session session = factory.getCurrentSession();
		session.getTransaction().begin();
		session.save(emp);
		session.getTransaction().commit();
		session.close();
	}
	
	//list employee
	public List<Employee> listEmployees(){
		Session session = factory.getCurrentSession();
		session.getTransaction().begin();
		List<Employee> empList = session.createQuery("from Employee").list();
		session.getTransaction().commit();
		session.close();
		return empList;
	}
	
	//get employee by id
	public Employee getEmployeeById(int empId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Employee emp = (Employee) session.get(Employee.class, empId);
		session.getTransaction().commit();
		session.close();
		return emp;
		
	}

	public void removeEmployee(int empId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Employee emp = (Employee) session.get(Employee.class, empId);
		System.out.println(emp);
		if(null != emp){
			session.delete(emp);
		}
		session.getTransaction().commit();
		session.close();
	}
	
	public void updateEmployee(Employee emp) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.update(emp);
		session.getTransaction().commit();
		session.close();
	}
}
