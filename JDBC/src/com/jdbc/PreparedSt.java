package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedSt {

	public static void main(String[] args) {

		int stno;
		String stname;
		String stcity;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student number: ");
		stno = sc.nextInt();
		
		System.out.println("Enter the Student Name: ");
		stname = sc.next();
		
		System.out.println("Enter the Student City: ");
		stcity = sc.next();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			String Query = "insert into student values(?, ?, ?)";
			PreparedStatement PS = con.prepareStatement(Query);
			PS.setInt(1, stno);
			PS.setString(2, stname);
			PS.setString(3, stcity);
			PS.executeUpdate();
			System.out.println("record inserted Successfully");
			
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
