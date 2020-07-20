package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.AbsStaffMember;

public class EmployeeRepository {

	private static List<AbsStaffMember> members=new ArrayList<>();
	private static List<AbsStaffMember> employees = new ArrayList<>();
	
	public EmployeeRepository(){
	
	}
	
	public List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	public List<AbsStaffMember> getAllEmployees(){
		return new ArrayList<>(employees);
	}
	
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
	
	public void addEmployee(AbsStaffMember employee) throws Exception{
		if(employee==null) throw new Exception();
		employees.add(employee);
	}
	
	
}
