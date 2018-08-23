package tn.ocp.classdesign.polymorph.runtimepolymoph;

/**
 * Example of superclass containing a method
 * @author REGAYEG
 *
 */
class RuntimePolymorph {
	
	void show(int i) {
		System.out.println("none");
	}
}

/**
 * Example of class inherting the MyExtendRuntimePolymorph class and overriding the method show()
 * @author REGAYEG
 *
 */
public class MyExtendRuntimePolymorph extends RuntimePolymorph {
	
	@Override
	void show(int i) {
		System.out.println(""+i);
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		RuntimePolymorph myRuntimePloymorph = new MyExtendRuntimePolymorph();
		myRuntimePloymorph.show(1); // prints: 1
		
	}
}

