package java_project;
import java.util.*;

public class crud_fulltimestaff {
	
	Scanner scanner = new Scanner(System.in);
	private ArrayList<fulltimestaff> fulltimestaff_data = new ArrayList<fulltimestaff>();
	
	public crud_fulltimestaff() {
		fulltimestaff f1 = new fulltimestaff("f1", "Abcd", 22, "abc@hotmail.com", "111", "Male", "123 London", 1400);
		fulltimestaff f2 = new fulltimestaff("f2", "Bcde", 12, "bcd@gmail.com", "222", "Female", "234 London", 2000);
		fulltimestaff f3 = new fulltimestaff("f3", "Fghi", 12, "fgh@gmail.com", "333", "Male", "456 London", 1600);
		fulltimestaff_data.add(f1);
		fulltimestaff_data.add(f2);
		fulltimestaff_data.add(f3);
		}
	
	
	public String get_name_by_id(String id) {
		for (fulltimestaff x : fulltimestaff_data) {
			
			if(x.getId().equals(id)) {
				return x.getName();
			}

		}
		return null;
	}
	
	
	
	public void print_all_names() { // print all full-time id and name
		for(fulltimestaff x : fulltimestaff_data) {
			System.out.print("\nFull-time Staff ID: " + x.getId() + " , Name: " + x.getName());
		}
	}
	
	public void insert() {
		fulltimestaff new_data = new fulltimestaff();
		new_data.input();
		fulltimestaff_data.add(new_data);
		System.out.println("\nFull-time Staff data added successfully...");
	}
	
	public void modify() {
		try {
		System.out.println("/n Please input the phone number of the record to modify: ");
		String search_phone = scanner.nextLine();
		boolean found = false;
		for (fulltimestaff x : fulltimestaff_data) {
			if(x.getPhone().equals(search_phone)) {
				found = true;
				x.print();
				fulltimestaff modified_data = new fulltimestaff();
				modified_data.input();
				fulltimestaff_data.add(modified_data);
				fulltimestaff_data.remove(x);
				System.out.println("\nFull-time Staff data added successfully...");
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
		System.out.print("Enter the phone number of the Full-time Staff: ");
		String entered_phone = scanner.nextLine();
		boolean found = false;
		for (fulltimestaff x : fulltimestaff_data) {
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
		System.out.print("Enter the phone number of the Full-time Staff: ");
		String entered_phone = scanner.nextLine();
		boolean found = false;
		for (fulltimestaff x : fulltimestaff_data) {
			if(x.getPhone().equals(entered_phone)) {
				found = true;
				x.print();
				System.out.print("\n Are you sure you want to delete yes/no?");
				String response = scanner.nextLine();
				if(response.toLowerCase().equals("yes")) {
					fulltimestaff_data.remove(x);
					System.out.println("\n Data got deleted successfully");
				}
				break;
			}
		}
		
		if(found==false) {
		System.out.println("\nSorry not found.");
		}
			
	}



	public ArrayList<fulltimestaff> getFulltimestaff_data() {
		return fulltimestaff_data;
	}



	public void setFulltimestaff_data(ArrayList<fulltimestaff> fulltimestaff_data) {
		this.fulltimestaff_data = fulltimestaff_data;
	}
	
	

}
