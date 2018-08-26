package tn.ocp.classdesign.polymorph.staticpolymorph;

/**
 * Example of class containing abstract method show() overloaded (static polymorphism)
 * @author REGAYEG
 *
 */
abstract class MyStaticPolymorph {
	
	// TODO: Create overloading methods
	
	abstract int show(int i); // show a number
	abstract String show(String str); // show a string
	abstract boolean show(boolean isMessaged); // show a boolean
	abstract void show(); // nothing to show
}
/**
 * Concrete class extending MyStaticPolymorph class and implement abstract methods show()
 * @author REGAYEG
 *
 */
public class MyStaticPolymorphTest extends MyStaticPolymorph{
	
	// TODO: Redefine show methods
	
	@Override
	public int show(int i) {
		return i;	
	}

	@Override
	String show(String str) {
		// TODO Auto-generated method stub
		return "String";
	}

	@Override
	boolean show(boolean isMessaged) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	void show() {
		System.out.println("none");
	}
	
	public static void main(String[] args) {
		
		// TODO: test all the show() method versions
		MyStaticPolymorph myStaticPolymorph = new MyStaticPolymorphTest();
		System.out.println(myStaticPolymorph.show(true)); // prints: false
	}
}


