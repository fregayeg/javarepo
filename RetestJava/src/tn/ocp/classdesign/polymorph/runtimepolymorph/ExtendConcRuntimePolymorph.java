package tn.ocp.classdesign.polymorph.runtimepolymorph;

/**
 * Example of superclass containing a method show() to be overriden
 * @author REGAYEG
 *
 */
class RuntimePolymorph {
	
	// TODO: Override show method
	void show(int i) {
		System.out.println("none");
	}
}

/**
 * Example of class inherting the ExtendConcRuntimePolymorph class and overriding the method show()
 * @author REGAYEG
 *
 */
public class ExtendConcRuntimePolymorph extends RuntimePolymorph {
	
	// Overridden method
	@Override
	void show(int i) {
		System.out.println(""+i);
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		RuntimePolymorph myRuntimePloymorph = new ExtendConcRuntimePolymorph();
		myRuntimePloymorph.show(1); // prints: 1
		
	}
}

