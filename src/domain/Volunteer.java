package domain;

public class Volunteer extends AbsStaffMember {
	
	//ATRIBUTES
	protected String description;


	//CONSTRUCTOR
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		this.description=description;
	}

	//METHODS
	public String toStringVolunteer() {
		return "EMPLOYEE: [NAME: " + name + ", ADDRESS: " + address + ", PHONE: " + phone + 
				", DESCRIPTION: " + description + "]";
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
	}
	

}
