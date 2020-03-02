package com.aimdek.employeeManagement.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.aimdek.dao.EmployeeDAO;
import com.aimdek.dao.EmployeeDAOImpl;

@Configuration
@ComponentScan(basePackages="com.aimdek.employeeManagement")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
		@Bean
	   public DataSource getDataSource() {
	     DriverManagerDataSource dataSource = new DriverManagerDataSource();
	     dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	     dataSource.setUrl("jdbc:mysql://localhost:3306/spring_db?autoReconnect=true&useSSL=false");
	     dataSource.setUsername("root");
	     dataSource.setPassword("root1234");
	      return dataSource;
	    }
	 
	@Bean
	public EmployeeDAO employeeDAO() {
		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl(getDataSource());
		return employeeDAO;
	}
	
	
}
