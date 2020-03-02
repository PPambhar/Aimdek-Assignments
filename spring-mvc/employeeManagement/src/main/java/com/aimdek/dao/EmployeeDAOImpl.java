package com.aimdek.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.aimdek.model.Employee;
public class EmployeeDAOImpl implements EmployeeDAO{
	
	private JdbcTemplate JdbcTemplate;
	
	public EmployeeDAOImpl(DataSource dataSource)
	{
	        JdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int insert(Employee employee)
	{
		 String sql="insert into employee(empName,empSalary,empDesignation) values('"+employee.getEmpName()+"',"+employee.getEmpSalary()+",'"+employee.getEmpDesignation()+"')";    
		 return JdbcTemplate.update(sql);
	}
	
	@Override
	public int delete(int empId) {
		// TODO Auto-generated method stub
		String sql="delete from employee where empId="+empId+"";    
	    return JdbcTemplate.update(sql);    
	}
	
	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		String sql="update employee set empName='"+employee.getEmpName()+"', empSalary="+employee.getEmpSalary()+",empDesignation='"+employee.getEmpDesignation()+"' where empId="+employee.getEmpId()+""; 
		System.out.println(employee.getEmpName());
		System.out.println();
		return JdbcTemplate.update(sql);
	}
	
	@Override
	public Employee getEmpById(int empId){    
	    String sql="select * from employee where empId=?";    
	    return JdbcTemplate.queryForObject(sql, new Object[]{empId},new BeanPropertyRowMapper<Employee>(Employee.class));    
	} 
	
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		String sql="select * from employee";
		
		return JdbcTemplate.query(sql, new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
			{
				Employee employee = new Employee();
				employee.setEmpName(rs.getString("empName"));
				employee.setEmpSalary(rs.getFloat("empSalary"));
				employee.setEmpDesignation(rs.getString("empDesignation"));
				employee.setEmpId(rs.getInt("empId"));
				return employee;
			}
		});
		
	
	}
}
