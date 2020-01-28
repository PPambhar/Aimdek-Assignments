package com.student.jdbc;
import java.sql.*;

public class ConnectionFactory {
	
    public static final String URL = "jdbc:mysql://localhost:3306/studentDB?characterEncoding=latin1&useConfigs=maxPerformance&autoReconnect=true&useSSL=false";
    public static final String USER = "root";
    public static final String PASS = "root1234";
    
    public static Connection getConnection()
    {
		try 
		{  
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(URL,USER,PASS);
		} 
		catch (Exception ex) 
		{ 
			ex.printStackTrace();
			return null;
		}
	}

}
