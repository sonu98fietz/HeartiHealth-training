package com.heartihealth.datalayer;
import java.io.Console;
import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

public class DBConnect {
	private Connection conn;
	private static Properties properties;
	public  Connection connect(){
		try
		{
		
			properties = new Properties();
			FileReader reader = new FileReader("heartihealth_db.properties");
			properties.load(reader);
			Class.forName(properties.getProperty("driver"));	
			Connection conn= DriverManager.getConnection(properties.getProperty("url"),
					properties.getProperty("username"), properties.getProperty("password"));
			
//			String driver="com.mysql.cj.jdbc.Driver";
//			Class.forName(driver);
//			String url="jdbc:mysql://localhost:3306/heartihealth";
//			String username="root";
//			String password= "Sonu@1998";
//			Connection conn= DriverManager.getConnection(url,username,password);
			
//			String query="select * from addressinfo;";
//			Statement st = conn.createStatement();
//			ResultSet rs = st.executeQuery(query);
//			DisplayTable.displayResults(rs);
			
//			rs.next();
//			String name= rs.getString("studentcol1");
//			System.out.println(name);
//			st.close();
//			conn.close();
			return conn;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return conn;

	}

}
