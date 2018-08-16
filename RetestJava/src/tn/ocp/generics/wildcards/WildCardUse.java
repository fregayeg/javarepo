package tn.ocp.generics.wilcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of class using Wilcards in generics
 * 
 * @author REGAYEG
 */
public class WildCardUse {
	
	// TODO make method to print a list
	/**
	 * .print a list
	 * @param list
	 */
	static void printList(List<?> list) {
		System.out.print("list: ");
		
		for (Object element : list)
			System.out.print( element + " ");
		
	}
	
	// TODO: test the wildcards with lists
	/**
	 * main method
	 * @param args
	 */
	public static void main(String []args) {
		
		List<Number> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		printList(list); // prints: 10
		
		System.out.println("\n////////////");
		
		List<String> strList = new ArrayList<>();
		strList.add("ABC");
		strList.add("abc");
		printList(strList); // ABC abc
		
	}

}


