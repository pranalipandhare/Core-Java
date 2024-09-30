package com.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Book {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "root");

			Statement S = con.createStatement();

			String Query = "create table Book(idBook int, nameBook varchar(50), authorBook varchar(50), priceBook varchar(50))";
			String Query1 = "Insert into Book values (1, 'Tejashri', 'TKA', '350')";
			String Query2 = "Insert into Book values (2, 'Dhanashri', 'AKS', '100')";
			String Query3 = "Update Book set nameBook = 'Agnipankh' where nameBook = 'Tejashri'";
			String Query4 = "Update Book set nameBook = 'SAnem' where nameBook = 'Dhanashri'";
			String Query5 = "Insert into Book values (3, 'Cans', 'POE', '200')";
			String Query6 = "Insert into Book values (4, 'annem', 'KIT', 500)";
			String Query7 = "Insert into Book values (5, 'Ayhan', 'Leyla', 400)";
			String Query8 = "Delete from Book where idBook = 1";
			String Query9 = "Update Book set nameBook = 'Ayhan' where idBook = '5'";

			S.executeUpdate(Query9);
			System.out.println("Table is created");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
