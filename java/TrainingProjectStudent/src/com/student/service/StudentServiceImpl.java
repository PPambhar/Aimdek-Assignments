package com.student.service;
import com.student.bean.*;
import com.student.persistence.*;

public class StudentServiceImpl implements StudentService {

	@Override
	public boolean insert(String firstName,String lastName,String email,String password,int age) {
		
		Student s=new Student();
		StudentPersistenceImpl sp=new StudentPersistenceImpl();
		
		s.setFirstName(firstName);
		s.setLastName(lastName);
		s.setEmail(email);
		s.setPassword(password);
		s.setAge(age);
		//System.out.println("2");
		sp.insert(s);
		
		return true;
	}

	@Override
	public boolean update(String firstName,String LastName,String email,String password,int age) {
		
		Student s=new Student();
		s.setFirstName(firstName);
		s.setLastName(LastName);
		s.setEmail(email);
		s.setPassword(password);
		s.setAge(age);
		return true;
	}

	@Override
	public boolean delete(String firstName,String LastName,String email,String password,int age) {
		
		Student s=new Student();
		s.setFirstName(firstName);
		s.setLastName(LastName);
		s.setEmail(email);
		s.setPassword(password);
		s.setAge(age);
		return true;
	}

	@Override
	public boolean read(String firstName,String LastName,String email,String password,int age) {
		
		Student s=new Student();
		s.setFirstName(firstName);
		s.setLastName(LastName);
		s.setEmail(email);
		s.setPassword(password);
		s.setAge(age);
		return true;
	}

}
