package application;

import java.util.ArrayList;
import java.util.List;

import domain.AbsStaffMember;
import domain.Employee;
import domain.Volunteer;
import persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
		repository.addEmployee(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
		repository.addEmployee(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(manager);
		repository.addEmployee(manager);
	}
	
	public void createVolunteer(String name, String address, String phone, String description) throws Exception{
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);
	}


	public void payAllEmployeers() {
		// TODO Auto-generated method stub
	
	}

	
	
	public void getAllEmployees() {
		List<Employee> employeesList = new ArrayList<>();
		employeesList=repository.getAllEmployees();
				
		for(int i=0; i<employeesList.size(); i++)
		{
			System.out.println(employeesList.get(i).toStringEmployee());
		}	
	}

	
	public void getAllMembers() {
		List<AbsStaffMember> membersList = new ArrayList<>();
		membersList=repository.getAllMembers();
			
		for(int i=0; i<membersList.size(); i++)
		{
			System.out.println(membersList.get(i).toStringMember());
		}	
	}
	
}
