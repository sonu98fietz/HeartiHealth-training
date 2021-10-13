package com.heartihealth.datalayer;

public interface MemberAPI {

	public boolean addMember(String id,String useName,String firstName,String lastName,int age,String Gender,String email,String phNum);
	public boolean updateMemberEmail(int memberID,String newEmailID);
}
