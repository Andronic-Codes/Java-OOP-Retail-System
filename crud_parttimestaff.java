package java_project;
import java.util.*;

public class crud_parttimestaff {
	
	Scanner scanner = new Scanner(System.in);
	private ArrayList<parttimestaff> parttimestaff_data = new ArrayList<parttimestaff>();
	
	public crud_parttimestaff() {
		parttimestaff s1 = new parttimestaff("p1", "Abcd", 22, "abc@hotmail.com", "111", "Male", "123 London", 45, 12.5);
		parttimestaff s2 = new parttimestaff("p2", "Bcde", 12, "bcd@gmail.com", "222", "Female", "234 London", 55, 13);
		parttimestaff s3 = new parttimestaff("p3", "Fghi", 12, "fgh@gmail.com", "333", "Male", "456 London", 50, 14);
		parttimestaff_data.add(s1);
		parttimestaff_data.add(s2);
		parttimestaff_data.add(s3);
		}
	
	
	public String get_name_by_id(String id) {
		for (parttimestaff x : parttimestaff_data) {
			
			if(x.getId().equals(id)) {
				return x.getName();
			}

		}
		return null;
	}
	
	
	public void print_all_names() { // print all part-time id and name
		for(parttimestaff x : parttimestaff_data) {
			System.out.print("\nPart-time Staff ID: " + x.getId() + " , Name: " + x.getName());
		}
	}
	
	public void insert() {
		parttimestaff new_data = new parttimestaff();
		new_data.input();
		parttimestaff_data.add(new_data);
		System.out.println("\nPart-time Staff data added successfully...");
	}
	
	
	public void modify() {
		try {
		System.out.println("/n Please input the phone number of the record to modify: ");
		String search_phone = scanner.nextLine();
		boolean found = false;
		for (parttimestaff x : parttimestaff_data) {
			if(x.getPhone().equals(search_phone)) {
				found = true;
				x.print();
				parttimestaff modified_data = new parttimestaff();
				modified_data.input();
				parttimestaff_data.add(modified_data);
				parttimestaff_data.remove(x);
				System.out.println("\nPart-time Staff data added successfully...");
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
		System.out.print("Enter the phone number of the Part-time Staff: ");
		String entered_phone = scanner.nextLine();
		boolean found = false;
		for (parttimestaff x : parttimestaff_data) {
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
		System.out.print("Enter the phone number of the Part-time Staff: ");
		String entered_phone = scanner.nextLine();
		boolean found = false;
		for (parttimestaff x : parttimestaff_data) {
			if(x.getPhone().equals(entered_phone)) {
				found = true;
				x.print();
				System.out.print("\n Are you sure you want to delete yes/no?");
				String response = scanner.nextLine();
				if(response.toLowerCase().equals("yes")) {
					parttimestaff_data.remove(x);
					System.out.println("\n Data got deleted successfully");
				}
				break;
			}
		}
		
		if(found==false) {
		System.out.println("\nSorry not found.");
		}
		
	}


	public ArrayList<parttimestaff> getParttimestaff_data() {
		return parttimestaff_data;
	}


	public void setParttimestaff_data(ArrayList<parttimestaff> parttimestaff_data) {
		this.parttimestaff_data = parttimestaff_data;
	}
	
	
	
	

}
