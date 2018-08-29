package tn.ocp.advclassdesign.finalkeyword;

/**
 * this class is going to be a superclass of FinalClass 
 * @author REGAYEG
 *
 */
abstract class NotFinalClass {}

/**
 * Example of final class
 * NOTE: final classes are usually used to achieve immutability
 * NOTE: We are extending an abstract (NON-final) class 
 * NOTE: We are not allowed to override final methods from superclass
 * @author REGAYEG
 *
 */
public final class FinalClass extends NotFinalClass {
	
	// TODO: use final keyword in many cases
	
	//FIELDS
	int id; // ordinary field
	final String name ; // final field
	
	// CONSTRUCTORS
	// default constructor
	public FinalClass() {
		this("Unknown");
	}
	
	// constructor with params
	public FinalClass(String pName) {
		name = pName;
	}
	
	/**
	 * final method
	 * NOTE: final method CANNOT be overridden
	 * NOTE: all methods in a final class are implicitly final
	 * NOTE: we can apply the "final" keyword to parameters in a method
	 * NTOE: the final parameter CANNOT be changed once assigned
	 */
	protected final String showAge(final int id) {
		//id = 0; // this is not allowed because id is final
		return "Age is = " + id;
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO: test the immutability in this class
		
		FinalClass finalClass = new FinalClass();
		System.out.println(finalClass.name.substring(3)); // prints: nown 
		System.out.println(finalClass.name); // prints: Unknown (unchangeable)
		System.out.println(finalClass.showAge(24)); // prints: Age is = 24
	}
}
