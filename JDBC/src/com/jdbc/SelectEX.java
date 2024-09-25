package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEX {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
			String Query = "Select * from student";
			Statement S = con.createStatement();
			Statement S1 = con.createStatement();

			ResultSet rs = S.executeQuery(Query);

			while (rs.next()) {
				int stno = rs.getInt(1);
				String stname = rs.getString(2);
				String stcity = rs.getString(3);

				System.out.println(stno + " " + stname + " " + stcity);
				String Query1 = "insert into studentcopy (stno, stname, stcity) values ('" + stno + "', '" + stname
						+ "', '" + stcity + "')";
				S1.executeUpdate(Query1);

			}
			System.out.println("Record added successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
