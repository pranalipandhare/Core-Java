package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			
			Statement S = con.createStatement();
			
			String query = "Update student set stname ='Pooja' where stname='Pranali'";
			S.executeUpdate(query);
			System.out.println("updated successfully");
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
