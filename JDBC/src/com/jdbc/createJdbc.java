package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class createJdbc {

	public static void main(String[] args) {

		try {

//			Register a Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1");
			
//			create a connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			System.out.println("2");
			
//			create a statement
			Statement s = con.createStatement();
			System.out.println("3");
			
//			execute Query
			String query = "Create table student(stid int, stname varchar(50), stcity varchar(50))";
			s.executeUpdate(query);
			System.out.println("4");
			
//			close the connection
			con.close();
			System.out.println("5");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
