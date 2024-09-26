package com.preparedst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Courses {

	public static void main(String[] args) {
		
		try {
			
			int Cno;
			String CName;
			String CTeacher;
			
			Scanner S = new Scanner(System.in);
			
			System.out.println("Enter the Course Id: ");
			Cno = S.nextInt();
			
			System.out.println("Enter the Course Name: ");
			CName = S.next();
			
			System.out.println("Enter the Course Teacher Name: ");
			CTeacher = S.next();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Course", "root", "root");
			
			String Query = "Create table Course(Cno int, CName varchar(50), CTeacher varchar(50))";
			String Query1 = "Insert into Course values(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(Query1);
			ps.setInt(1, Cno);
			ps.setString(2, CName);
			ps.setString(3, CTeacher);
			ps.executeUpdate();
			
			System.out.println("Table created successfully!");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
