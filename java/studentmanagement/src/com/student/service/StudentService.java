package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService {

	boolean insert(Student student);
	boolean update(Student student);
	boolean delete(int id);
	List<Student> read();
	Student getStudentById(int id);
}
