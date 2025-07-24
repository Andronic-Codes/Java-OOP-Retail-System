package java_project;
import java.util.Scanner;

public class Person {
	
		Scanner scanner = new Scanner(System.in);
		 
		 private String id;
		 private String name;
		 private int age;
		 private String email;
		 private String phone;
		 private String sex;
		 private String address;
		 
		 
		 public Person() { } // Empty constructor


		 public Person(String id, String name, int age, String email, String phone, String sex, String address) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.email = email;
			this.phone = phone;
			this.sex = sex;
			this.address = address;
		}
		 
		 

		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPhone() {
			return phone;
		}


		public void setPhone(String phone) {
			this.phone = phone;
		}


		public String getSex() {
			return sex;
		}


		public void setSex(String sex) {
			this.sex = sex;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}
		 
		 
		public void print() {
			System.out.print("\n-----------------");
			System.out.print("\nID:  "+id);
			System.out.print("\nName:  "+name);
			System.out.print("\nAge:  "+age);
			System.out.print("\nPhone:  "+phone);
			System.out.print("\nGender:  "+sex);
			System.out.print("\nAddress:  "+address);
			System.out.print("\nEmail:  "+email);
		}
		
		
		public void input() {
			System.out.print("\n-----------------");
			System.out.print("\nEnter the ID: ");
			id = scanner.nextLine();
			System.out.print("\nEnter the Name: ");
			name = scanner.nextLine();
			System.out.print("\nEnter the Age: ");
			age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("\nEnter the Phone: ");
			phone = scanner.nextLine();
			System.out.print("\nEnter the Gender: ");
			sex = scanner.nextLine();
			System.out.print("\nEnter the Address: ");
			address = scanner.nextLine();
			System.out.print("\nEnter the Email: ");
			email = scanner.nextLine();
			
		}
		
		
}

