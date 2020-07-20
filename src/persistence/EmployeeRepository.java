package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.AbsStaffMember;

public class EmployeeRepository {

	private static List<AbsStaffMember> members=new ArrayList<>();
	
	
	public EmployeeRepository(){
		
	}
	
	public List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
	
	
	
	
}
