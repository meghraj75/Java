package com.connection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	public static Connection createConeection()throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/Emp_Registation";

		String username = "root";
		String pwd = "mysql75@";

		Connection conn = DriverManager.getConnection(url, username, pwd);

		if (conn != null) {
			System.out.println("connection established");
		} else {
			System.out.println("try again");
		}
		return conn;

	}
}


