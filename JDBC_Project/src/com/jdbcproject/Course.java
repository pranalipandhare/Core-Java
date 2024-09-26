package com.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Course {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Courses", "root", "root");

			Statement S = con.createStatement();

			String Query = "Create table Batch (BNo int, BCourse varchar(50), BTeacher varchar(50))";
			String Query1 = "Insert into Batch values (121, 'Full Stack Development', 'Atul Sir')";
			String Query2 = " Insert into Batch values (122, 'Python Developer', 'Kiran Sir')";
			String Query3 = "Insert into Batch values (123, 'AWS Course', 'Sonali Mam')";
			String Query4 = "Insert into batch values (124, 'Java Developement', 'Sagar Sir')";
			String Query5 = "Delete from batch where BNo = 124";
			String Query6 = "Update batch set BTeacher = 'Kiran Sir' where BTeacher = 'Atul Sir'";
			String Query7 = "Update batch set BTeacher = 'Atul Sir' where BNo = 122";
			S.executeUpdate(Query7);

			String Query8 = "Select * from Batch";
			ResultSet rs = S.executeQuery(Query8);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			System.out.println();
			System.out.println("table is created Sucessfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
