package com.student.persistence;
import com.student.bean.*;

public interface StudentPersistence {

	boolean update();
	boolean delete();
	boolean insert(Student s);
	boolean read();
}