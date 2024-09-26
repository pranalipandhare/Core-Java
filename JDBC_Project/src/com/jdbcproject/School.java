package com.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class School {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");

			Statement S = con.createStatement();
			String Query = "Create table Student (StRollno int, stName varchar(50), stDiv varchar(50))";
			String Query1 = " Insert into student values(1, 'Komal', 'A')";
			String Query2 = " Insert into student values(2, 'kajal', 'B') ";
			String Query3 = " Insert into student values(3, 'Kunal', 'C')";
			String Query4 = " Insert into student values(4, 'Krishna', 'D')";
			String Query5 = " Delete from student where stRollno = 1";
			String Query6 = " Update student set stName = 'Somesh' where stName = 'Kajal'";
			S.executeUpdate(Query6);

			String Query7 = " Select * from student";
			ResultSet rs = S.executeQuery(Query7);
		
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getString(3));
			}

			System.out.println("Table is created");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
