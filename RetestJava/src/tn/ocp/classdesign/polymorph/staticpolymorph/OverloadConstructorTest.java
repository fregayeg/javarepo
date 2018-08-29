package tn.ocp.classdesign.polymorph.staticpolymorph;

/**
 * Example of class containing overloaded constructors
 * @author REGAYEG
 *
 */
class OverloadConstructorTest{
	
	// CONSTRUCTORS
	
	public OverloadConstructorTest() {
		this(0); // call the constructor which have 1 param
	}
	
	public OverloadConstructorTest(int a) {
		this(a,"Dummy"); // call the constructor which have 2 params
	}
	
	public OverloadConstructorTest(int a, String name) {
		System.out.println("name is " + name + ", age is = " + a);
	}
	
	public static void main(String[] args) {
		
		OverloadConstructorTest constructor = new OverloadConstructorTest(24,"Firas"); 
		// prints: name is Firas, age is = 24
	}
}
