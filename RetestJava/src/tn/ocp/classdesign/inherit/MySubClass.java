package tn.ocp.classdesign.inherit;

public class MySubClass extends MyInheritanceClass{
	
	private String mail;
	
	// CONSTRUCTORS
	
	public MySubClass(int pId, String pName) {
		super(pId,pName);
	}
	
	public MySubClass(int pId, String pName, String pMail) {
		super(pId, pName);
		mail = pMail;
	}
	
	// invoke toString from superclass! 
	@Override
	public String toString() {
		return super.toString() + ", mail = " + mail;
	}
	
	public static void main(String[] args) {
		
		// TODO: make test on SubClass's objects
		
		MyInheritanceClass mySubclass1 = new MySubClass(125,"Imed", "imed@imed.com");
		MyInheritanceClass mySubclass2 = new MySubClass(5269, "Omar");
		
		System.out.println(mySubclass1); // id = 125, name = Imed, mail = imed@imed.com
		System.out.println(mySubclass2); // id = 5269, name = Omar, mail = null
	}
	
}
