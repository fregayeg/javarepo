package tn.ocp.advclassdesign.abstractclasses;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Example of simpel abstract class
 * NOTE: abstract is like concrete class, it may NOT contain any abstract methods
 * NOTE: a class that have one/+ abstract method should become immediately an abstract class
 * NOTE: abstract classes can be extended but NOT used to instantiate with "new" keyword
 * @author REGAYEG
 *
 */
abstract class AbstractClass {
	
	//TODO: create an abstract method in this abstract class
	
	public abstract void show(); // this is an abstract method
	
	// ordinary methods in abstract class is legal
	public void print() {
		System.out.println("Hello world");
	}
}

/**
 * Concrete class extending an abstract class
 * @author REGAYEG
 *
 */
public class ConcreteClassExtendingAbsClass extends AbstractClass {
	
	// TODO: redefine abstract methods from superclass
	
	@Override
	public void show() {
		System.out.println("Hello Firas");
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO: test the redefined show in ConcreteClassExtendingAbsClass
		
		ConcreteClassExtendingAbsClass concreteClass = new ConcreteClassExtendingAbsClass();
		concreteClass.show(); // prints: Hello Firas
	}
}
