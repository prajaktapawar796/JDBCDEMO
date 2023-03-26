package com.jsp.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String url ="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password ="root";
		//String sql="INSERT INTO car VALUES(1024,'BMW','X5')";
		//String sql="UPDATE car SET brand='MERCEDES' where id=1024";
		//String sql="DELETE from car where id=1024";
		//String sql="SELECT * FROM car";
		String sql="SELECT * FROM car where id=2 ";
		Connection connection=null;
		
		//Step :1 Register the driver
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 // Step 2: establish connection
		
		 connection=DriverManager.getConnection(url,username,password);
		
		//step 3: Create Statement
		
		Statement statement=connection.createStatement();
		
		//Execute the statement
		//statement.execute(sql);   // Insert
		/*int a=statement.executeUpdate(sql); //update and delete
		if(a>0)
		{
			System.out.println("Data updated");
		}
		else
		{
			System.out.println("Not Updated");
		}*/
		
		ResultSet resultSet=statement.executeQuery(sql);   //select...
		
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println("==========================================");
		}
		
	}
	   
	  
	   
	 
	   catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   finally
	   {
		   //close the connection
		   connection.close();
		   System.out.println("All good");
	   }
	}

}
