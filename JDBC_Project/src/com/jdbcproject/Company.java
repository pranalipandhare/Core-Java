package com.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Company {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "root");
			Statement S = con.createStatement();

			String Query = "Create table Employee(emID int, emName varchar(50), emPosition varchar(50), emSalary int)";
			String Query1 = "Insert into Employee values (1, 'Pranali', 'Java Developer', 45000)";
			String Query2 = "insert into Employee values (2, 'Runali', 'Data ANalyst', 30000)";
			String Query3 = "Insert into Employee values (3, 'Sonal', 'Web Developer', 35000)";
			String Query4 = "Insert into EMployee values (4, 'Mrunal', 'Backend Developer', 50000)";
			String Query5 = "Delete from Employee where emid = 4";
			String Query6 = "Update Employee set emSalary = 40000 where emSalary = 30000";
			S.executeUpdate(Query6);

			String Query7 = "Select * from Employee";
			ResultSet rs = S.executeQuery(Query7);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
			}

			System.out.println("Table is selected Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
