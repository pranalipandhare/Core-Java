package com.preparedst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		
		int Cid;
		String CName;
		String CLocation;

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Employee ID: ");
		Cid = S.nextInt();

		System.out.println("Enter the Employee Company Name: ");
		CName = S.next();

		System.out.println("Enter the Employee Location: ");
		CLocation = S.next();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Company", "root", "root");
			String Query = "create table Customer(Cid int, CName varchar(50), CLoaction varchar(50))";
			String Query1 = "Insert into Customer values(?, ?, ?)";
			String Query2 = "Delete from Customer where Cid = 3";
			PreparedStatement ps = con.prepareStatement(Query2);
			ps.setInt(1, Cid);
			ps.setString(2, CName);
			ps.setString(3, CLocation);
			ps.executeUpdate();
			System.out.println("Table is created");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
