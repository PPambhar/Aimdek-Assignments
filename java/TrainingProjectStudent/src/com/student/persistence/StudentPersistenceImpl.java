package com.student.persistence;
import com.student.jdbc.*;
import com.student.bean.*;
import java.sql.*;

public class StudentPersistenceImpl implements StudentPersistence {

	Connection con=ConnectionFactory.getConnection();
	
	@Override
	public boolean update() {
			try {
				PreparedStatement stmt=con.prepareStatement("UPDATE TABLE student_master SET student_firstName=,student_lastName=,student_email=,student_age=,student_password="); 
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public boolean delete() {
		try {
			PreparedStatement stmt=con.prepareStatement("DELETE FROM student_master WHERE student_id="); 
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
			//System.out.println("3");
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
			//stmt.close();
		}
	}

	@Override
	public boolean read() {
		try {
			PreparedStatement stmt=con.prepareStatement("SELECT * FROM student_master WHERE student_id="); 
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
