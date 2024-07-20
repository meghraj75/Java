package com.employeeDao;


import java.sql.*;
import java.sql.Connection;

import java.sql.SQLException;

import com.connection.Connector;
import com.entity.*;
public class EmployeeDao {
public static boolean register(Employee e) throws ClassNotFoundException, SQLException {
	Connection conn=Connector.createConeection();
	String q = "insert into emp (id,fname,lname,uname,password, address,contact) values(?,?,?,?,?,?,?)";
	PreparedStatement ps=conn.prepareStatement(q);
	ps.setString(1,e.getId());
	ps.setString(2,e.getFname());
	ps.setString(3,e.getLname());
	ps.setString(4, e.getUname());
	ps.setString(5,e.getPasspord());
	ps.setString(6, e.getAddress());
	ps.setString(7,e.getContact());
	
	return ps.execute();
	
}
public static int delete(String id) throws ClassNotFoundException, SQLException {
	Connection conn=Connector.createConeection();
	 String q="Delete  from customer where id=?";
     PreparedStatement ps=conn.prepareStatement(q);
     int parsedId = Integer.parseInt(id);
     ps.setInt(1, parsedId);
      int result= ps.executeUpdate();
      return result;
     
}
}

