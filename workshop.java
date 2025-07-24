package java_project;

public class workshop extends workshop_fees {
	
	private String department;
	private String day;
	private String[] slot_timing = {"10:00 to 10:30", "10:30 to 11:00", "11:00 to 11:30", "11:30 to 12:00", "12:00 to 12:30", "12:30 to 13:00", "13:00 to 13:30", "13:30 to 14:00"};
	private int[] booking = {0, 0, 0, 0, 0, 0, 0, 0};
	private String staff_id;
	private String customer_id;
	private double fees;
	
	
	public workshop() {
		
	}

	public workshop(String department, String[] slot_timing, int[] booking, String staff_id, String customer_id,
			double fees) {
		super();
		this.department = department;
		this.slot_timing = slot_timing;
		this.booking = booking;
		this.staff_id = staff_id;
		this.customer_id = customer_id;
		this.fees = fees;
	}

	@Override
	public void calculate_fees() {
		if(!this.department.equals("Bakery")) {
			this.fees = workshop_fees.base_fees;
		}
		else {
			this.fees = Math.round(workshop_fees.base_fees*0.68);
		}
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String[] getSlot_timing() {
		return slot_timing;
	}

	public void setSlot_timing(String[] slot_timing) {
		this.slot_timing = slot_timing;
	}

	public int[] getBooking() {
		return booking;
	}

	public void setBooking(int slot_no) {
		this.booking[slot_no - 1] = 1;
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	
	
	
}
