package com.student.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.jdbc.ConnectionFactory;
import com.student.model.Student;

public class StudentPersistenceImpl implements StudentPersistence {

Connection con=ConnectionFactory.getConnection();
	
	@Override
	public boolean update(Student student) {
			try {
				PreparedStatement stmt=con.prepareStatement("UPDATE student_master SET student_firstName=?,student_lastName=?,student_email=?,student_password=?,student_age=? WHERE student_id=?");
				stmt.setString(1,student.getFirstName());
				stmt.setString(2,student.getLastName());
				stmt.setString(3,student.getEmail());
				stmt.setString(4,student.getPassword());
				stmt.setInt(5,student.getAge());
				stmt.setInt(6,student.getId());
				
				int i=stmt.executeUpdate();
				if(i>=0)
				{
					return true;
				}
				return false;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public boolean delete(int id) {
		try {
			PreparedStatement stmt=con.prepareStatement("DELETE FROM student_master WHERE student_id=?"); 
			stmt.setInt(1, id);
			stmt.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insert(Student s) {
		try {
			PreparedStatement stmt=con.prepareStatement("INSERT INTO student_master (student_firstName,student_lastName,student_email,student_password,student_age) VALUES (?,?,?,?,?)");
			stmt.setString(1,s.getFirstName());
			stmt.setString(2,s.getLastName());
			stmt.setString(3,s.getEmail());
			stmt.setString(4,s.getPassword());
			stmt.setInt(5,s.getAge());
			
			int i=stmt.executeUpdate();
			if(i>=0)
			{
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			
		}
	}
	
	public Student getStudentById(int id)
	{
		Student student =new Student();
		try {
			PreparedStatement stmt=con.prepareStatement("SELECT * FROM student_master WHERE student_id=?");
			stmt.setInt(1, id);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next())
			{
				student.setId(rs.getInt("student_id"));
	            student.setFirstName(rs.getString("student_firstName"));
	            student.setLastName(rs.getString("student_lastName"));
	            student.setEmail(rs.getString("student_email"));
	            student.setPassword(rs.getString("student_password"));
	            student.setAge(rs.getInt("student_age"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}

	@Override
	public List<Student> read(){
		try {
			PreparedStatement stmt=con.prepareStatement("SELECT * FROM student_master"); 
			 List<Student> list=new ArrayList<Student>();
			 ResultSet rs=stmt.executeQuery();  
	            while(rs.next()){  
	                Student student=new Student(); 
	                student.setId(rs.getInt("student_id"));
	                student.setFirstName(rs.getString("student_firstName"));
	                student.setLastName(rs.getString("student_lastName"));
	                student.setEmail(rs.getString("student_email"));
	                student.setPassword(rs.getString("student_password"));
	                student.setAge(rs.getInt("student_age"));
	                
	                list.add(student); 	          
	            }
	         return list;
		
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
