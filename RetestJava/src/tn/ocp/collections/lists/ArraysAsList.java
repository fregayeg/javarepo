package tn.ocp.collections.lists;

import java.util.Arrays;
import java.util.List;

/**
 * Example of transforming Array into a fixed size list
 * NOTE: We cannot use add() or remove() to modify to list size
 * @author REGAYEG
 *
 */
public class ArraysAsList {

	public static void main(String[] args) {
		Integer [] integers = {1,2,3,4,5};
		List<Integer> listInt = Arrays.asList(integers);
		listInt.set(4, 6); // change 5 in index 4 with new value = 6
		
		System.out.println(listInt); // prints: [1, 2, 3, 4, 6]
	}
}
