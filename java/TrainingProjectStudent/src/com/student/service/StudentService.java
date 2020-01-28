package com.student.service;

public interface StudentService {

	boolean insert(String firstName,String lastName,String email,String password,int age);
	boolean update(String firstName,String lastName,String email,String password,int age);
	boolean delete(String firstName,String lastName,String email,String password,int age);
	boolean read(String firstName,String lastName,String email,String password,int age);
}
