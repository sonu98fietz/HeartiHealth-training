package com.heartihealth.datalayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class viewByQuery implements viewByQueryAPI{

	public boolean viewNoOfCasesByState()
	{
		DBConnect heartiHealthDB = new DBConnect();
		Connection conn =  heartiHealthDB.connect();
		try {
			Statement stmt = conn.createStatement();
			String query = "select addr.state,count(*) NoOfAttacks from "
					+ "addressinfo addr join cardiodiagnosis car on "
					+ "car.memberinfo_member_id = addr.memberinfo_member_id "
					+ "where car.cardioarrestdetected = 1 group by "
					+ "addr.state order by count(*) desc";
			ResultSet rs= stmt.executeQuery(query);
			DisplayTable.displayResults(rs);
			stmt.close();
			conn.close();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean viewAllHeartAttackPatients(int fetchsize)
	{
		DBConnect heartiHealthDB = new DBConnect();
		Connection conn =  heartiHealthDB.connect();
		try {
			Statement stmt = conn.createStatement();
			String query = "select mem.username,phonenumber,"
					+ "count(*)NoOfAttack,max(car.date) "
					+ "LastHeartAttackDate from memberinfo mem join "
					+ "cardiodiagnosis car on car.memberinfo_member_id  = "
					+ "mem.member_id where cardioarrestdetected=1 group by "
					+ "mem.username order by max(car.date) desc";
			ResultSet rs= stmt.executeQuery(query);
			DisplayTable.displayResults(rs);
			stmt.close();
			conn.close();
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
