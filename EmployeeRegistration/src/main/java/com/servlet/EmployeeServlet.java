package com.servlet;

import  com.employeeDao.EmployeeDao;
import com.entity.Employee;

import java.io.IOException;
import java.sql.SQLException;
import jakarta.servlet.ServletException;

//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
private EmployeeDao employeeDao;
	
	@Override
	public void init()throws ServletException{
		employeeDao=new EmployeeDao();
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
	   Employee e= new Employee();
	  e.setId(id);
	  e.setFname(fname);
	  e.setLname(lname);
      e.setUname(uname);	
      e.setPasspord(password);
      e.setAddress(address);
      e.setContact(contact);
		
		try {
		boolean register=EmployeeDao.register(e);
		if(register) {
			response.sendRedirect("error.jsp");

		}else {
		response.sendRedirect("success.jsp");
		}
		}
		catch(ClassNotFoundException e1){
			e1.printStackTrace();
		}
		catch(SQLException e2){
			e2.printStackTrace();
		}
		
		
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");

		 try {
			EmployeeDao.delete(id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	}


