/*
 * Simple customer class
 */
public class Customer {

	// Attributes
	public String name;
	public String email;
	
	// Constructor. When we have parameters in the constructor
	// we're forcing the objects to be given these values
	// from the client class
	public Customer(String name, String email) {
		
		// The "this" keyword indicated that the 
		// "name" variable refers to the attribute one
		// The other name is the one declared in the constructor
		this.name = name;
		this.email = email;
		
	}
	
	
	
}
