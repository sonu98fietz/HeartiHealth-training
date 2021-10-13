package com.heartihealth.datalayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberUpdates implements MemberAPI {
	
	
	
	public boolean addMember(String id,String userName,String firstName,String lastName,int age,String Gender,String email,String phoneNo) 
	{
		DBConnect heartiHealthDB = new DBConnect();
		Connection conn =  heartiHealthDB.connect();
		try {
			Statement stmt = conn.createStatement(); 
			String query ="insert into memberinfo values ('"+id+"','"+userName+"','"+firstName+"','"+lastName+"','"+age+"','"+Gender+"','"+email+"','"+phoneNo+"')";
			stmt.executeUpdate(query);
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}return false;
	}	
	public boolean updateMemberEmail(int memberID,String newEmailID)
	{
		DBConnect heartiHealthDB = new DBConnect();
		Connection conn =  heartiHealthDB.connect();
		try {
			Statement stmt = conn.createStatement();
			String query = "update memberinfo set email='"+newEmailID+"'where member_id='"+memberID+"'";
			stmt.executeUpdate(query);
			System.out.println("values Updated !!!");
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}	
	
}
