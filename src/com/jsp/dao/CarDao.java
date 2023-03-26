package com.jsp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.helper.Helper;

public class CarDao 
{
	
	Helper helper=new Helper();
	public void saveCar()
	{
		Connection connection=helper.getConnection();
		String sql="INSERT INTO car VALUES (100 ,'MERCEDES', 'X5')";
		
		try {
			Statement statement=connection.createStatement();
			statement.execute(sql);
			connection.close();
			System.out.println("All good");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int updateCar()
	{
		Connection connection=helper.getConnection();
		String sql="UPDATE car SET name='xyz' where id=100";
		int n=0;
		
		try {
			Statement statement=connection.createStatement();
			n=statement.executeUpdate(sql);
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return n ;
	}
	
	public boolean deleteCar()
	{
		Connection connection=helper.getConnection();
		String sql="DELETE FROM car where id=100";
		int a=0;
		try {
			Statement statement=connection.createStatement();
			a=statement.executeUpdate(sql);
			connection.close();
			System.out.println("All good");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(a>0)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
		
	}
	
	public void getAllCars()
	{
		Connection connection=helper.getConnection();
		String sql="SELECT * FROM car";
		
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
			}
			connection.close();
			System.out.println("All good");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void getAllCarById()
	{
		Connection connection=helper.getConnection();
		String sql="SELECT * FROM car where id=1";
		
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
			}
			connection.close();
			System.out.println("All good");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
