package tn.ocp.advclassdesign.nestedclasses.statics;

/**
 * Example of concrete class containing a static nested class and a static nested interface
 * @author REGAYEG
 *
 */
public class MyOuterClass {
	
	// FIELDS
	static int numberOfInstances; // static field
	int number; // instance field
	
	// Nested CLASSES
	
	// 1 - static nested interface 
	protected static interface MyNestedInterface {
		String show();
	}
	
	// 2 - static abstract nested class implementing a static nested interface
	protected static class MyNestedClass implements MyNestedInterface {
		
		// FIELDS
		private int id; // private field
		String name; // default field
		static int numberOfInstances; // default static member in static nested class!
		
		// CONSTRUCTORS 
		public MyNestedClass() {}
		
		// METHODS
		
		@Override
		public String show() {
			return "Overridden";
		}
		
		// access static field of the outer class
		public void getOuterField() {
			MyOuterClass.numberOfInstances = 1; 
		}
		
	}
	
	// 3 - static abstract nested class implementing a nested interface
	// NOTE: static nested classes can be abstract
	private static abstract class MyNestedClass2 implements MyNestedInterface {}
	
	// METHODS
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO: test access on private field of nested class from outer class.
		
		MyNestedClass myNestedClass = new MyNestedClass();
		myNestedClass.id = 1; // outer class can access private field of nested class!
		System.out.println(myNestedClass.id); // prints: 1
	}
}

/**
 * Example of interface that has static nested class and static nested interface
 * NOTE: any member inside a an interface is implicitly static
 * @author REGAYEG
 */
interface MyInterface {
	class MyClass {} // this class is implicitly static
	interface MyNestedInterface {} // this interface is implicitly static
}

