package java_project;
import java.util.*;

public class crud_customer {
	
	Scanner scanner = new Scanner(System.in);
	private ArrayList<customer> customer_data = new ArrayList<customer>();
	
	
	public crud_customer() {
	customer c1 = new customer("c1", "Abcd", 12, "abc@gmail.com", "111", "Male", "123 London", 420.5);
	customer c2 = new customer("c2", "Bcde", 12, "bcd@gmail.com", "222", "Female", "234 London", 320.5);
	customer c3 = new customer("c3", "Fghi", 12, "fgh@gmail.com", "333", "Male", "456 London", 120.5);
	customer_data.add(c1);
	customer_data.add(c2);
	customer_data.add(c3);
	}
	
	
	public String get_name_by_id(String id) {
		for (customer x : customer_data) {
			
			if(x.getId().equals(id)) {
				return x.getName();
			}

		}
		return null;
	}
	
	
	
	public void print_all_names() { // print all customers id and name
		for(customer x : customer_data) {
			System.out.print("\nCustomer ID: " + x.getId() + " , Name: " + x.getName());
		}
	}
	
	
	public void insert() {
		customer new_data = new customer();
		new_data.input();
		customer_data.add(new_data);
		System.out.println("\nCustomer data added successfully...");
	}
	
	
	public void modify() {
		try {
		System.out.println("/n Please input the phone number of the record to modify: ");
		String search_phone = scanner.nextLine();
		boolean found = false;
		for (customer x : customer_data) {
			if(x.getPhone().equals(search_phone)) {
				found = true;
				x.print();
				customer modified_data = new customer();
				modified_data.input();
				customer_data.add(modified_data);
				customer_data.remove(x);
				System.out.println("\nCustomer data added successfully...");
				break;
			}
		}
	

		if(found==false) {
		System.out.println("\nSorry not found.");
		}

		} catch (Exception ex) {
			System.out.println("\nSomething went wrong...");
		}
	}
	
	
	public void retrieve() {
		System.out.print("Enter the phone number of the customer: ");
		String entered_phone = scanner.nextLine();
		boolean found = false;
		for (customer x : customer_data) {
			if(x.getPhone().equals(entered_phone)) {
				found = true;
				x.print();
				break;
			}
		}
	

		if(found==false) {
		System.out.println("\nSorry not found.");
		}
	
	}
	
	public void delete() {
		System.out.print("Enter the phone number of the customer: ");
		String entered_phone = scanner.nextLine();
		boolean found = false;
		for (customer x : customer_data) {
			if(x.getPhone().equals(entered_phone)) {
				found = true;
				x.print();
				System.out.print("\n Are you sure you want to delete yes/no?");
				String response = scanner.nextLine();
				if(response.toLowerCase().equals("yes")) {
					customer_data.remove(x);
					System.out.println("\n Data got deleted successfully");
				}
				break;
			}
		}
		
		if(found==false) {
		System.out.println("\nSorry not found.");
		}
		
	}


	public ArrayList<customer> getCustomer_data() {
		return customer_data;
	}


	public void setCustomer_data(ArrayList<customer> customer_data) {
		this.customer_data = customer_data;
	}
	
	
	
	
	
	
}


