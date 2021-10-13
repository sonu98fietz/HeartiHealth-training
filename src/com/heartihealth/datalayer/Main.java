package com.heartihealth.datalayer;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
    	
	DBConnect heartiHealthDB = new DBConnect();
   	heartiHealthDB.connect();
   	
         	///////////////////////////////////////////////////////////////////////
//   	                              LAB 3
       	    ///////////////////////////////////////////////////////////////////////
//   	MemberUpdates memupdate =new  MemberUpdates();
//   	boolean checkUpdate = memupdate.addMember("304","robwil","Robbie","Williams",34,"Male","robwil@gmail.com","9443433995");
//   	if(checkUpdate) {
//   		System.out.println("Sucessfully created ");
//   	}
	        ///////////////////////////////////////////////////////////////////////
//                                    LAB 4
            ///////////////////////////////////////////////////////////////////////

//   	MemberUpdates updateMembermail =new  MemberUpdates();
//   	boolean updateMemberEmail = updateMembermail.updateMemberEmail(304,"robbiewilliams@gmail.com");
//   	if(updateMemberEmail) {
//   		System.out.println("Email Sucessfully Updated ");
//   	}	
   	
	        ///////////////////////////////////////////////////////////////////////
//                                    LAB 5
            ///////////////////////////////////////////////////////////////////////
   	
//   	HeartiHealthUpdates deleteBloodMember =new HeartiHealthUpdates();
//   	boolean deleteBloodMemberid = deleteBloodMember.deleteBloodTestRecord("bl221");
//   	if(deleteBloodMemberid) {
//		System.out.println("Blood Records of 'bl221' Deleted succesfully");
//	}	
	       ///////////////////////////////////////////////////////////////////////
//                                    LAB 6
          ///////////////////////////////////////////////////////////////////////
//   	viewByQuery view = new viewByQuery();
//   	view.viewNoOfCasesByState();
   	
	       ///////////////////////////////////////////////////////////////////////
//                                    LAB 7
           ///////////////////////////////////////////////////////////////////////
   	viewByQuery view = new viewByQuery();
   	view.viewAllHeartAttackPatients(100);
    }
}
