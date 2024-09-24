package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			
			Statement S = con.createStatement();
			
			String Query = "delete from student where stid = 1";
			S.executeUpdate(Query);
			System.out.println("data is deleted successfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
