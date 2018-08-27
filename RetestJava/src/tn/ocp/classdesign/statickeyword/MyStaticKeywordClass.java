package tn.ocp.classdesign.statickeyword;

/**
 * 
 * Example of class using the static keyword
 * @author REGAYEG
 */
public class MyStaticKeywordClass {
	
	// TODO: use "static" keyword in many cases
	
	// class variable / static variables
	public static int numberOfInstances;
	
	// static iniitialization bloc
	static {
		numberOfInstances = 0;
	}
	
	// Class method / static method
	public static void show() {
		numberOfInstances++; // to count number of instances
		System.out.println("static variable = " + numberOfInstances);
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		MyStaticKeywordClass.show(); // static variable = 1
	}
}


