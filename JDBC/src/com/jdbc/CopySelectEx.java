package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CopySelectEx {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");

			String Query = "select * from student";
			Statement S = con.createStatement();
			Statement S1 = con.createStatement();

			ResultSet rs = S.executeQuery(Query);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

				String Query1 = "insert into studentt (stno, stname, stcity) values ('" + rs.getInt(1) + "', '"
						+ rs.getString(2) + "', '" + rs.getString(3) + "')";
				S1.executeUpdate(Query1);

			}
			System.out.println("Record is succesfully created");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
