package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Country;
import com.spring.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Country country=(Country)context.getBean("country");
		country.setName("USA");
		country.setPopulation(5000);
		
		System.out.println(country.getName());
		System.out.println(country.getPopulation());
		
		Country country2=(Country)context.getBean("country");
		System.out.println(country2.getName());
		System.out.println(country2.getPopulation());
		
		
		Employee employee =(Employee)context.getBean("employee");
		
		System.out.println(employee.getName());
		employee.setName("abcd");
		
		Employee employee2 =(Employee)context.getBean("employee");
		System.out.println(employee2.getName());
	}
}
