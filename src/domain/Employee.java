package domain;

public class Employee extends AbsStaffMember {

	//ATRIBUTES
	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;

	//CONSTRUCTOR
	public Employee(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone);
		if (salaryPerMonth < 0)
			throw new Exception();
		if (paymentRate == null)
			throw new Exception();

		this.salaryPerMonth = salaryPerMonth;
		this.paymentRate = paymentRate;
	}

	//METHODS
	public String getName() {
		return name;
	}

	public String toStringEmployee() {
		return "EMPLOYEE: [NAME: " + name + ", ADDRESS: " + address + ", PHONE: " + phone + ", SALARY: "
				+ getTotalPaid() + "]";
	}

	@Override
	public void pay() {
		totalPaid = paymentRate.pay(salaryPerMonth);
	}

}
