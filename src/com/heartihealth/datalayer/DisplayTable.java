package com.heartihealth.datalayer;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DisplayTable {
	public static void displayResults(ResultSet rs)
	{
		try {
			ResultSetMetaData rMeta = rs.getMetaData();
			int noOfCols = rMeta.getColumnCount();
			for(int i=1;i<=noOfCols;++i) {
				System.out.print(rMeta.getColumnName(i)+"\t\t\t");
			}
			System.out.println("");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			while(rs.next()) {
				for(int i=1;i<=noOfCols;++i) {
					System.out.print(rs.getString(i)+"\t\t\t");
				}System.out.println("");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}



