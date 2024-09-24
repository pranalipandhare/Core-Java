package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJdbc {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			Statement S = con.createStatement();
			
			String Query = "Select * from student";
			ResultSet rs = S.executeQuery(Query);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			System.out.println("Table is selected");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
