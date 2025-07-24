package java_project;

public class parttimestaff extends Person {
	
	private int nhour;
	private double rate;
	
	public parttimestaff() {}

	public parttimestaff(String id, String name, int age, String email, String phone, String sex, String address, int nhour, double rate) {
		super(id, name, age, email, phone, sex, address);
		this.nhour = nhour;
		this.rate = rate;
	}

	public int getNhour() {
		return nhour;
	}

	public void setNhour(int nhour) {
		this.nhour = nhour;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	
	public void print() {
		super.print();
		System.out.print("\nNumber of hours: "+nhour);
		System.out.print("\nRate: "+rate);
	}
	
	
	public void input() {
		super.input();
		System.out.print("\nEnter the number of hours: ");
		nhour = scanner.nextInt();
		System.out.print("\nEnter the rate: ");
		rate = scanner.nextDouble();
	}
	

}
