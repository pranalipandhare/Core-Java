package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) {

		try {
			// loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1");

			// create connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			System.out.println("2");

			// creating statement
//			String query = "create table student(stno int, stname varchar(50), age int)";
//			String query = "insert into student values(1, 'Pranali', 23)";
			Statement s = con.createStatement();
//			int count = s.executeUpdate(query);
//			System.out.println(count + " first data inserted in table successfully..!");
			
			

			// executing statement
			String query = "select * from student";
			ResultSet rs = s.executeQuery(query);
			
//         next() method is use to fetch data 
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			System.out.println("5");

			// closing connection
			con.close();
			System.out.println("6");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
