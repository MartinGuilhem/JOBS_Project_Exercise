package persistence;

import java.util.ArrayList;
import java.util.List;

import domain.AbsStaffMember;
import domain.Employee;

public class EmployeeRepository {

	//ATRIBUTES
	private static List<AbsStaffMember> members = new ArrayList<>();
	private static List<Employee> employees = new ArrayList<>();
	
	//CONSTRUCTOR
	public EmployeeRepository(){
	}
	
	//GETTERS & SETTERS of MEMBERS and EMPLOYEES
	public List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}
	
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
		 
	public List<Employee> getAllEmployees(){
		return new ArrayList<>(employees);
	}
		
	public void addEmployee(Employee employee) throws Exception{
		if(employee==null) throw new Exception();
		employees.add(employee);
	}
	
}
