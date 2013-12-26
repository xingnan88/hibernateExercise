package com.huang.hibernate.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
	private static final String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String DATABASE_URL = "jdbc:sqlserver://localhost;databaseName=ress";
	private static final String DATABASE_USER = "sa";
	private static final String DATABASE_PASSWORD = "sa";

	private Connection con = null;

	public Connection getConnection()
	{
		try
		{
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
			System.out.println("SQL2005 连接成功!");
		} catch (Exception ex)
		{
			System.out.println("2:" + ex.getMessage());
		}
		return con;
	}

	public static void main(String[] args)
	{
		DBConnection dc=new DBConnection();
		dc.getConnection();
	}
}