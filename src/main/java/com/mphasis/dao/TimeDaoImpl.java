package com.mphasis.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.bean.CheckInOutTime;

@Repository
public class TimeDaoImpl {
	
	@Autowired
	private SessionFactory factory;
	
	//Check in time
	public void checkInTime(CheckInOutTime checkInOutTime) {
		Session session = factory.getCurrentSession();
		session.getTransaction().begin();
		session.save(checkInOutTime);
		session.getTransaction().commit();
		session.close();
	}
	
	//list employee
	/*public List<Employee> listEmployees(){
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
	}*/
}
