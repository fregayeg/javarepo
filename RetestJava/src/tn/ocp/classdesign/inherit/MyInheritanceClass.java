package tn.ocp.classdesign.inherit;

/**
 * Example of inheritance demo class
 * @author REGAYEG
 */
//Illustrates how abstracting different kinds of numbers in a Number hierarchy
//becomes useful in practice
public class MyInheritanceClass {
	
	// FIELDS
	
	protected int id;
	protected String name;
	
	// CONSTRUCTORS
	
	public MyInheritanceClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "id = " + id + ", name = " + name ;
	}
	
	// DEMOs in Inheritance
	
	// take an array of numbers and sum them up
	public static double sum(Number[] nums) {	
		
		double sum = 0.0;
		
		for (Number num : nums) {
			sum += num.doubleValue(); // doubleValue() method converts to double type
		}
		return sum;
	}
	
	/**
	 * main method 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create a Number array
		Number[] nums = new Number[4];
		// assign derived class objects
		nums[0] = new Byte((byte) 10); // Byte is a subclass of Number
		nums[1] = new Integer(10); // Integer is a subclass of Number
		nums[2] = new Float(10.0f); // Float is a subclass of Number
		nums[3] = new Double(10.0f); // Double is a subclass of Number
		
		// pass the Number array to sum and print the result
		System.out.println("The sum of numbers is: " + sum(nums)); // prints: The sum of numbers is: 40.0
	}
}

