package tn.ocp.classdesign.inherit;

/**
 * Example of inheritance demo class
 * @author REGAYEG
 */
//Illustrates how abstracting different kinds of numbers in a Number hierarchy
//becomes useful in practice
public class MyInheritClass {
	
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
		nums[0] = new Byte((byte) 10);
		nums[1] = new Integer(10);
		nums[2] = new Float(10.0f);
		nums[3] = new Double(10.0f);
		
		// pass the Number array to sum and print the result
		System.out.println("The sum of numbers is: " + sum(nums));
	}
}

