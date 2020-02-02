package com.mphasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mphasis.bean.Employee;
import com.mphasis.dao.EmployeeDaoImpl;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;
	
	@RequestMapping("/enterDetails")
	public String employeeDetail(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeForm";
	}
	
	//Addd employee
	@RequestMapping("/addEmployee")
	public String submitEmployee(@ModelAttribute("employee") Employee emp) {
		// no need to use getParamete. modelAttribute will bind all data from parameter to page which is returned
			employeeDaoImpl.addEmployee(emp);
		
		return "empAdd";
	}
	
	//list employee
	@RequestMapping("/listDetails")
	public String getEmployeesList(Model model) {
		//model.addAttribute("employee", new Employee());
		model.addAttribute("empList", employeeDaoImpl.listEmployees());
		return "show-employee";
	}
	
	//get emp by id
	@RequestMapping("/empById")
	public String getEmployee( @RequestParam("empId") int id, Model model) {
		model.addAttribute("employee", employeeDaoImpl.getEmployeeById(id));
		return "employeeById";
	}
	
	//deleting employee
	@RequestMapping("/remove/{id}")
	public String deleteEmployee( @PathVariable("id") int id) {
		employeeDaoImpl.removeEmployee(id);
		return "redirect:/listDetails";
	}
	
	@RequestMapping("/edit/{id}")
	public String editEmployee( @PathVariable("id") int id, Model model) {
		model.addAttribute("employee", employeeDaoImpl.getEmployeeById(id));
		return "editEmpForm";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/edit/editSave")
	public String editSaveEmployee( @ModelAttribute("employee") Employee emp) {
		employeeDaoImpl.updateEmployee(emp);
		return "redirect:/listDetails";
	}
	
	
	
}
