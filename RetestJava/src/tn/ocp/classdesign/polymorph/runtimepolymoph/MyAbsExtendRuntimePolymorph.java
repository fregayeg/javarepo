package tn.ocp.classdesign.polymorph.runtimepolymoph;

/**
 * Example of abstract class containing abstract methods show()
 * @author REGAYEG
 *
 */
abstract class MyAbstractClass {
	
	abstract void show();
}

/**
 * Example of concrete class extending an abstract class which contain an abstract method
 * NOTE: we are forced to implement the abstract method from the superclass as we are in 
 * a concrete class
 * 
 * @author REGAYEG
 */
public class MyAbsExtendRuntimePolymorph extends MyAbstractClass{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Overriden");
	}
	
	public static void main(String[] args) {
		MyAbstractClass absExtendRuntimePolymorph = new MyAbsExtendRuntimePolymorph();
		absExtendRuntimePolymorph.show(); // prints: "overriden"
	}
}

