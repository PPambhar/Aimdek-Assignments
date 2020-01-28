package com.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.student.service.*;
/**
 * Servlet implementation class Registration
 */
@WebServlet("/registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		StudentServiceImpl student=new StudentServiceImpl();
		
		int age=Integer.parseInt(request.getParameter("age"));		
		System.out.println("1");
		boolean insert=student.insert(request.getParameter("firstName"),request.getParameter("lastName"),request.getParameter("email"),request.getParameter("password"),age);
		
		if(insert)
		{
			response.sendRedirect("login.jsp");
		}
		else
		{
			response.sendRedirect("registration.jsp");
		}
//		request.getParameter("firstName");
//		request.getParameter("lastName");
//		request.getParameter("email");
//		request.getParameter("password");
//		request.getParameter("age");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
