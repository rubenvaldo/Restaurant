/*
 * Table class
 */
public class Table {

	// Attributes
	public int tableNumber;
	public int capacity;
	public boolean isAvailable;
	
	// Now my custom classes can be variable types
	// in other classes, similar to the idea of a foreing key
	public Customer bookedBy;
	
	// Constructor. We're forcing to be given a number.
	public Table(int tableNumber) {
		System.out.println("New Table Created");
		isAvailable = true;
		this.tableNumber = tableNumber;
	}
	
	// This is a book method. And it is required to be
	// given a customer.
	public boolean book(Customer customer) {
		// If the table is available
		if(isAvailable) {
			// Assign the customer to the 
			// bookedBy variable
			this.bookedBy = customer;
			// Make the table not available anymore
			isAvailable = false;
			// Let the client know that the booking
			// was successful.
			return true;
		}
		else {
			// Let the client know that the booking
			// was not successful
			return false;
		}
	}
	
	// This is a method to verify if the table is booked or not
	public void isBooked() {
		if(!isAvailable) {
			// As part of the response, we're indicating the table number and the name
			// of the user that booked the table.
			System.out.println("Table " + tableNumber + " is booked by " + bookedBy.name);
		}
		else {
			System.out.println("Table " + tableNumber + " is free");
		}
		
	}
	
}
