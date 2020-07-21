package domain;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	public String getName() {
		return name;
	}
	
	public void setNewSalary() {
		
	}
	
	public String toStringEmployee() {
	return "EMPLOYEE: [NAME: " + name + ", ADDRESS: " + address + ", PHONE: " + phone + 
			", SALARY: " + salaryPerMonth + "]";
	}

	
	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

}
