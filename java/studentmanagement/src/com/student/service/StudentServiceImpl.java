package com.student.service;

import java.util.List;

import com.student.model.Student;
import com.student.persistence.StudentPersistenceImpl;

public class StudentServiceImpl implements StudentService {

	@Override
	public boolean insert(Student student) {
		StudentPersistenceImpl sp=new StudentPersistenceImpl();
		sp.insert(student);
		return true;
	}

	@Override
	public boolean update(Student student) {
		
		StudentPersistenceImpl sp=new StudentPersistenceImpl();
		sp.update(student);
		return true;
	}

	@Override
	public boolean delete(int id) {
		StudentPersistenceImpl sp=new StudentPersistenceImpl();
		sp.delete(id);
		return true;
	}

	@Override
	public List<Student> read() {
	
		StudentPersistenceImpl sp=new StudentPersistenceImpl();
		List<Student> list=sp.read();
		return list;
	}
	
	public Student getStudentById(int id)
	{
		StudentPersistenceImpl sp=new StudentPersistenceImpl();
		Student student=sp.getStudentById(id);
		return student;
	}

}
