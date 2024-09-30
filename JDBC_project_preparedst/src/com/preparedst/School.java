package com.preparedst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		
		int SRollno;
		int SClassNo;
		String SName;
		String SLocation;
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Student Roll No: ");
		SRollno = S.nextInt();
		
		System.out.println("Enter the Student Class No: ");
		SClassNo = S.nextInt();
		
		System.out.println("Enter the Student Name: ");
		SName = S.next();
		
		System.out.println("Enter the Student Location: ");
		SLocation = S.next();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Course", "root", "root");

			String Query = "Create table school (SRollno int, SClassNo int, SName varchar(50), SLocation varchar(50))";
			String Query1 = "Insert into school values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(Query1);

			ps.setInt(1, SRollno);
			ps.setInt(2, SClassNo);
			ps.setString(3, SName);
			ps.setString(4, SLocation);
			ps.executeUpdate();
			System.out.println("Table is created");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
