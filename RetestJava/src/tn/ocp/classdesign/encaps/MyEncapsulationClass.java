package tn.ocp.classdesign.encaps;

/**
 * Objective: Create encapsulation demo
 * NOTE: In encapsulation, classes are public/default, properties (fields) are private, 
 * NOTE: Getters begin with "is" (example: isHappy) if the property is a boolean and begin
 * 		 with "get" if the property is not a boolean.
 * NOTE: Setters begin with "set" whatever the properties are boolean or not
 * NOTE: The method name must have a prefix of set/get/is, followed by the first letter of
 * 		 the property in uppercase, followed by the rest of the property name.
 *
 * @author REGAYEG
 */

// A class (or interface) CANNOT be declared private or protected
// An interface CANNOT have private or protected fields!
class MyEncapsulationClass {
	
	//FIELDS
	
	// the next variable is declared public but, because the class is declared as default 
	// it forced this variable to be default too
	public int id; // this property is NOT following the encapsulation standards
	private int id2; // this property is following the encapsulation standards
	private boolean isAdmin; // this property is following the encapsulation standards
	private boolean Hungry; // this property is NOT following the encapsulation standards
	
	//CONSTRUCTORS
	
	MyEncapsulationClass() {
		super();
	}
	
	// GETTERS & SETTERS
	// the next getter is following the encasulation standards
	public int getId2() {
		return id2;
	}

	// the next setter is following the encasulation standards
	public void setId2(int id2) {
		this.id2 = id2;
	}	
	
	// the next getter is following the encasulation standards
	public boolean isAdmin() {
		return isAdmin;
	}	
}

