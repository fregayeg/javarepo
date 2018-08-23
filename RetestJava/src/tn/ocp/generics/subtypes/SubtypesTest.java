package tn.ocp.generics.subtypes;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of using subtypes with generics
 * Subtyping means: assigning a derived type object to its base type reference
 * NOTE: subtyping is not allowed with generics but allowed only for classes
 * @author REGAYEG
 */
class Subtype {
}

public class SubtypesTest {

	public static void main(String[] args) {
		
		// Legal code that doesn't work
		List<Number> intList1 = new ArrayList<Number>();
		intList1.add(new Integer(10)); // okay!
		intList1.add(new Float(10.0f)); // okay!	
		
		System.out.println(intList1);// prints: 10, 10.0
		
		// Illegal code that doesn't work
		//List<Number> intList2 = new ArrayList<Integer>();// doesn't compile
		//intList2.add(new Integer(10)); 
		//intList2.add(new Float(10.0f));	
		
		//System.out.println(intList2);
	}

}

