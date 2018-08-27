package tn.ocp.classdesign.polymorph.staticpolymorph;

class OverloadConstructorTest{
	
	public OverloadConstructorTest() {
		this(0); // call the constructor with params 
	}
	
	public OverloadConstructorTest(int a) {
		this(a,"Dummy");
	}
	
	public OverloadConstructorTest(int a, String name) {
		System.out.println("name is " + name + ", age is = " + a);
	}
	
	public static void main(String[] args) {
		OverloadConstructorTest constructor = new OverloadConstructorTest(24,"Firas"); 
		
	}
}
