package com.aimdek.dao;

import java.util.List;

import com.aimdek.model.Employee;

public interface EmployeeDAO {
	
	int insert(Employee employee);
	int delete(int empId);
	int update(Employee employee);
	Employee getEmpById(int empId);
	List<Employee>	getEmployee();
}
