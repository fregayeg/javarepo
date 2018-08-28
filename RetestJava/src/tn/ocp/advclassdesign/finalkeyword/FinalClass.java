package tn.ocp.advclassdesign.finalkeyword;


abstract class NotFinalClass {
	
	/**
	 * final method
	 */
	protected final String show() {
		return "Empty";
	}
}
/**
 * Example of final class
 * NOTE: final classes are used usually to achieve immutability
 * NOTE: We are extending a final class 
 * NOTE: We are not allowed to override final methods from superclass
 * @author REGAYEG
 *
 */
public final class FinalClass extends NotFinalClass {
	
	// TODO: use final keyword in many cases
	
	//FIELDS
	int id; // ordinary field
	final String name; // final field
	
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
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO: test the immutability in this class
		
		FinalClass finalClass = new FinalClass();
		System.out.println(finalClass.name.substring(3)); // prints: nown 
		System.out.println(finalClass.name); // prints: Unknown (unchangeable)
		}
}
