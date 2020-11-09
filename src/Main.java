
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating instances of the Table class
		Table t1 = new Table(10);
		Table t2 = new Table(87);
		Table t3 = new Table(75);
		Table t4 = new Table(14);
				
		// Making sure that they are created
		System.out.println("t1 number is " + t1.tableNumber);
		System.out.println("t2 number is " + t2.tableNumber);
		System.out.println("t3 number is " + t3.tableNumber);
		System.out.println("t4 number is " + t4.tableNumber);
		
		// Creating instances of the Customer class
		Customer c1 = new Customer("Amilcar", "amilcar@cct.ie");
		Customer c2 = new Customer("Ken", "ken@cct.ie");
		Customer c3 = new Customer("Greg", "greg@cct.ie");
		
		// Booking tables t1, t3 and t4. Notice that we call
		// the "book" method from the table class
		// and pass the user that wants to book the table
		t1.book(c1);
		t3.book(c2);
		t4.book(c2);

		// Verifying if the tables are booked
		t1.isBooked();
		t2.isBooked();
		t3.isBooked();
		t4.isBooked();
		
	}

}
