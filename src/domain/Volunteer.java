package domain;

public class Volunteer extends AbsStaffMember {
	

	protected String description;


	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		this.description=description;
	}

	public String toStringVolunteer() {
		return "EMPLOYEE: [NAME: " + name + ", ADDRESS: " + address + ", PHONE: " + phone + 
				", DESCRIPTION: " + description + "]";
	}
	
	@Override
	public void pay() {
		//TODO
		
	}

}
