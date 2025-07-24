package java_project;

public class customer extends Person {
	
	
	private double bootcampfees;

	public customer() {}

	public customer(String id, String name, int age, String email, String phone, String sex, String address, double bootcampfees) {
		super(id, name, age, email, phone, sex, address);
		this.bootcampfees = bootcampfees;
	}

	public double getBootcampfees() {
		return bootcampfees;
	}

	public void setBootcampfees(double bootcampfees) {
		this.bootcampfees = bootcampfees;
	}
	
	
	@Override
	public void print() {
		super.print();
		System.out.print("\nBootcamp fees: " + bootcampfees);
	}
	
	
	@Override	
	public void input() {
		super.input();
		System.out.println("\nEnter bootcamp fees: ");
		bootcampfees = scanner.nextDouble();
	}
	
	
}
