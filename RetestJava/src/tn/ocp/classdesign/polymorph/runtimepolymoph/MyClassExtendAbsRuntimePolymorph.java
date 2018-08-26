package tn.ocp.classdesign.polymorph.runtimepolymoph;

/**
 * Example of abstract class containing abstract methods show() to be overriden
 * @author REGAYEG
 *
 */
abstract class MyAbstractClass {
	// TODO: Override show method in MyClassExtendAbsRuntimePolymorph class
	//abstract method
	abstract void show();
}

/**
 * Example of concrete class extending an abstract class which contain an abstract method
 * NOTE: we are forced to implement the abstract method from the superclass as we are in 
 * a concrete class
 * 
 * @author REGAYEG
 */
public class MyClassExtendAbsRuntimePolymorph extends MyAbstractClass{

	@Override
	void show() {
		
		System.out.println("Overriden");
	}
	
	public static void main(String[] args) {
		// TODO: call the overriden show()
		MyAbstractClass classExtendAbsRuntimePolymorph = new MyClassExtendAbsRuntimePolymorph();
		classExtendAbsRuntimePolymorph.show(); // prints: "Overriden"
	}
}

