package java_project;

public class fulltimestaff extends Person{
	
	
	private double salary;
	
	public fulltimestaff() {}
	
	
	public fulltimestaff(double salary) {
		super();
		this.salary = salary;
	}


	public fulltimestaff(String id, String name, int age, String email, String phone, String sex, String address, double salary) {
		super(id, name, age, email, phone, sex, address);
		this.salary = salary;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public void print() {
		super.print();
		System.out.print("\nSalary: "+salary);
	}
	
	
	@Override
	public void input() {
		super.input();
		System.out.print("\nEnter the salary: ");
		salary = scanner.nextDouble();
	}
	
	

}
