package com.preparedst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Book {

	public static void main(String[] args) {

		int idBook;
		String nameBook;
		String AuthorBook;
		int priceBook;

		Scanner S = new Scanner(System.in);

		System.out.println("Enter the Book Id: ");
		idBook = S.nextInt();

		System.out.println("Enter the name of the Book: ");
		nameBook = S.next();

		System.out.println("Enter the Author of the Book: ");
		AuthorBook = S.next();

		System.out.println("Enter the Price of the Book: ");
		priceBook = S.nextInt();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "root");

			String Query = "create table BookList(idBook int, nameBook varchar(50), AuthorBook varchar(50), priceBook varchar(50))";
			String Query1 = "Insert into BookList values (?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(Query1);
			ps.setInt(1, idBook);
			ps.setString(2, nameBook);
			ps.setString(3, AuthorBook);
			ps.setInt(4, priceBook);
			ps.executeUpdate();
			System.out.println("Table is created");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
