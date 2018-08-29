package tn.ocp.advclassdesign.nestedclasses.statics.testouterclass;

import tn.ocp.advclassdesign.nestedclasses.statics.MyOuterClass;

/**
 * Example of testing class that tests the inheritance of a class that has nested class
 * @author REGAYEG
 *
 */
public class MyTestClass extends MyOuterClass{
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TODO create a MyOuterClass.MyNestedClass object
		
		MyOuterClass.MyNestedInterface myClass = new MyTestClass.MyNestedClass() ;
		System.out.println(myClass.show()); // call the overridden show method from MyOuterClass.MyNestedClass
		// prints: Overridden
	}

}
