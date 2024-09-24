package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertjdbc {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			Statement S = con.createStatement();
			String query = "insert into student values(2, 'runali', 'jalgaon')";
			S.executeUpdate(query);
			System.out.println("Data Inserted succesfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
