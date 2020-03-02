package com.student.persistence;

import java.util.List;

import com.student.model.Student;

public interface StudentPersistence {
	boolean update(Student student);
	boolean delete(int id);
	boolean insert(Student s);
	List<Student> read();
	Student getStudentById(int id);

}