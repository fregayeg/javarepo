package tn.ocp.generics.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of generic method inside the GenericMethod class
 *
 * @author REGAYEG
 */
class GenericMethod {
	/**
	 * Generic method
	 * 
	 * @param list: the list which is going to be modified
	 * @param val: the value which is going to be inserted into the list
	 */
	public static <T> void fill(List<T> list, T val) {
		
		for(int i=0; i < list.size(); i++)
			list.set(i, val);
	}
}

/**
 * Test class
 * 
 * @author REGAYEG
 */
public class GenericMethodTest {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		
		System.out.println("The original list is: " + intList);
		
		// generic method call
		GenericMethod.fill(intList, 100);
		
		System.out.println("The list after calling GenericMethod.fill() is: " + intList);
		// prints: the original list is [10, 20]
		// 		   the list after calling GenericMethod.fill() is: [100, 100]
	}

}


