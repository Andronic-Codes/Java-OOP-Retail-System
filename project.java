package java_project;
import java.util.*;

public class project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        crud_customer Crud_Customer = new crud_customer();
        crud_fulltimestaff Crud_fulltimestaff = new crud_fulltimestaff();
        crud_parttimestaff Crud_parttimestaff = new crud_parttimestaff();
        ArrayList<workshop> workshop_booking = new ArrayList<workshop>();
        String[] timing = {"10:00 to 10:30", "10:30 to 11:00", "11:00 to 11:30", "11:30 to 12:00", "12:00 to 12:30", "12:30 to 13:00", "13:00 to 13:30", "13:30 to 14:00"};

        while (true) {
            menu.main_menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                menu.customer_menu();
                int customer_choice = scanner.nextInt();
                scanner.nextLine(); // consume newline after int

                if (customer_choice == 1) {
                    Crud_Customer.insert();
                } else if (customer_choice == 2) {
                    Crud_Customer.retrieve();
                } else if (customer_choice == 3) {
                    Crud_Customer.modify();
                } else if (customer_choice == 4) {
                    Crud_Customer.delete();
                }
            } else if (choice == 2) {
                menu.staff_menu();
                int staff_choice = scanner.nextInt();
                scanner.nextLine(); // consume newline after int

                if (staff_choice == 1) {
                    menu.fulltimestaff_menu();
                    int fts_choice = scanner.nextInt();
                    scanner.nextLine(); // consume newline after int

                    if (fts_choice == 1) {
                        Crud_fulltimestaff.insert();
                    } else if (fts_choice == 2) {
                        Crud_fulltimestaff.retrieve();
                    } else if (fts_choice == 3) {
                        Crud_fulltimestaff.modify();
                    } else if (fts_choice == 4) {
                        Crud_fulltimestaff.delete();
                    }
                } else if (staff_choice == 2) {
                    menu.parttimestaff_menu();
                    int pts_choice = scanner.nextInt();
                    scanner.nextLine(); // consume newline after int

                    if (pts_choice == 1) {
                        Crud_parttimestaff.insert();
                    } else if (pts_choice == 2) {
                        Crud_parttimestaff.retrieve();
                    } else if (pts_choice == 3) {
                        Crud_parttimestaff.modify();
                    } else if (pts_choice == 4) {
                        Crud_parttimestaff.delete();
                    }
                }
            } else if (choice == 3) {
            	System.out.println("Enter the department to check available slots: ");
                String department = scanner.nextLine();
                System.out.println("Enter the day to check available slots: ");
                String day = scanner.nextLine();

                String[] slot_timing = {"10:00 to 10:30", "10:30 to 11:00", "11:00 to 11:30", "11:30 to 12:00", "12:00 to 12:30", "12:30 to 13:00", "13:00 to 13:30", "13:30 to 14:00"};

                for (int i = 1; i <= 8; i++) {
                    boolean isSlotAvailable = true;
                    for (workshop w : workshop_booking) {
                        if (w.getDepartment().equals(department) && w.getDay().equals(day)) {
                            if (w.getBooking()[i - 1] == 1) {
                                isSlotAvailable = false;
                                System.out.println("Slot " + slot_timing[i - 1] + " is booked.");
                                break;
                            }
                        }
                    }

                    if (isSlotAvailable) {
                        System.out.println("Slot " + slot_timing[i - 1] + " is available.");
                    }
                }
            	
            } else if (choice == 4) {
                System.out.println("\nHere are the lists of all the full-time staff and their availability: \n");
                ArrayList<fulltimestaff> fts_data = Crud_fulltimestaff.getFulltimestaff_data();
                ArrayList<parttimestaff> pts_data = Crud_parttimestaff.getParttimestaff_data();
                ArrayList<customer> customer_data = Crud_Customer.getCustomer_data();

                // Print full-time staff availability
                for (fulltimestaff x : fts_data) {
                    System.out.print("Staff id: " + x.getId() + ", Name: " + x.getName() + ", Availability: ");
                    boolean isBooked = false;
                    for (workshop w : workshop_booking) {
                        if (x.getId().equals(w.getStaff_id())) {
                            System.out.print("Booked");
                            isBooked = true;
                            break;
                        }
                    }
                    if (!isBooked) {
                        System.out.print("Free");
                    }
                    System.out.println();
                }

                // Print part-time staff availability
                for (parttimestaff x : pts_data) {
                    System.out.print("Staff id: " + x.getId() + ", Name: " + x.getName() + ", Availability: ");
                    boolean isBooked = false;
                    for (workshop w : workshop_booking) {
                        if (x.getId().equals(w.getStaff_id())) {
                            System.out.print("Booked");
                            isBooked = true;
                            break;
                        }
                    }
                    if (!isBooked) {
                        System.out.print("Free");
                    }
                    System.out.println();
                }

                // Print customer details
                for (customer x : customer_data) {
                    System.out.println("Customer id: " + x.getId() + ", Name: " + x.getName());
                }

                // Booking process
                System.out.println("\nEnter the staff id to be booked: ");
                String staff_id = scanner.nextLine();
                System.out.println("\nEnter the customer id to be booked: ");
                String cust_id = scanner.nextLine();
                System.out.println("\nEnter the booking day to be booked: ");
                String day = scanner.nextLine();
                System.out.println("\nEnter the slot number to be booked: ");
                int slot = scanner.nextInt();
                scanner.nextLine(); // consume newline after int
                System.out.println("\nEnter the department to be booked: ");
                String department = scanner.nextLine();

                workshop new_data = new workshop();
                new_data.setCustomer_id(cust_id);
                new_data.setDay(day);
                new_data.setStaff_id(staff_id);
                new_data.setDepartment(department);
                new_data.setBooking(slot);
                workshop_booking.add(new_data);
                System.out.println("Booking successful");
                //---------Printing the booking details---------
                System.out.println("\n------------------------------------------------");
                if (Crud_parttimestaff.get_name_by_id(staff_id)!=null) 
                System.out.println("Staff Name booked: " + Crud_parttimestaff.get_name_by_id(staff_id));
                if (Crud_fulltimestaff.get_name_by_id(staff_id)!=null) 
                    System.out.println("Staff Name booked: " + Crud_fulltimestaff.get_name_by_id(staff_id));
                if (Crud_Customer.get_name_by_id(cust_id)!=null) 
                    System.out.println("Customer Name booked: " + Crud_Customer.get_name_by_id(cust_id));
                System.out.println("\nDays booked: " + day);
                System.out.println("\nDepartment: " + department);
                System.out.println("\nSlot booked for: "+timing[slot - 1]);
                
                double fees=0.0;
                for(workshop x : workshop_booking) {
                	if(x.getCustomer_id().equals(cust_id))
                	{x.calculate_fees();
                		fees = x.getFees();}
                };
                
                System.out.println("\nBooking Fees: " + fees);
                
                
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }
        }

        scanner.close();
    }
}
