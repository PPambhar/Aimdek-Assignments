package com.aimdek.employeeManagement.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aimdek.dao.EmployeeDAO;
import com.aimdek.dao.EmployeeDAOImpl;
import com.aimdek.model.Employee;

@Controller
public class HomeController {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	@RequestMapping(value="/")
	public String test(HttpServletResponse response) throws IOException{
		return "index";
	}
	
	@RequestMapping(value = "/registration")
	public String registration(@ModelAttribute Employee employee)
	{
		return "registration";
	}
	
	@RequestMapping(value="/view")   
    public String show(Model m){
		List<Employee> empl=employeeDAO.getEmployee();
		m.addAttribute("list",empl);
        return "view";    
    }  
	
	@RequestMapping(value="/insert")
	public String insert(@ModelAttribute Employee employee) throws IOException{
		int i=employeeDAO.insert(employee);
		System.out.println(employee.getEmpName());
		System.out.println(i);
		return "redirect:/view";
	}
	
	@RequestMapping(value = "/updateForm/{empId}")
	public String updateForm(@PathVariable int empId, Model m){ 
        Employee employee=employeeDAO.getEmpById(empId);    
        m.addAttribute("command",employee);  
        return "updateForm";    
    }   
	
	@RequestMapping(value="/update",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute Employee employee){    
        employeeDAO.update(employee);    
        return "redirect:/view";    
    }    
	
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        int i=employeeDAO.delete(id);
        System.out.println(i);
        return "redirect:/view";    
    }   
	  
}