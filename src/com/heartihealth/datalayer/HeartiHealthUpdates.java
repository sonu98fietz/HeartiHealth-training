package com.heartihealth.datalayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class HeartiHealthUpdates implements HeartiHealthAPI {

	public boolean deleteBloodTestRecord(String memberID)
	{
		DBConnect heartiHealthDB = new DBConnect();
		Connection conn =  heartiHealthDB.connect();
		try {
			Statement stmt = conn.createStatement();
			String query = "delete from bloodtest where blood_id='"+memberID+"'";
			stmt.executeUpdate(query);
			stmt.close();
			conn.close();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
