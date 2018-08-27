package tn.ocp.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Example of iterating an ArrayList (foreach loop, Iterator + for)
 * Example of clearing a list (while loop + Iterator)
 * @author REGAYEG
 *
 */
public class ArrayListIterate {

	public static void main(String[] args) {

		ArrayList<String> languageList = new ArrayList<>();
		languageList.add("C");
		languageList.add("C++");
		languageList.add("Java");
		
		System.out.println("using foreach/enhanced for loop without Iterator");
		for (String language : languageList) {
			System.out.print(" " + language); //  output: C C++ Java
		}
		
		System.out.println("\n*************************************");
		System.out.println("using for loop with Iterator");
		for(Iterator<String> iterator = languageList.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.print(" " + string); // C C++ Java
		}
		
		System.out.println("using while loop with Iterator to delete the list items");
		Iterator<String> iterator = languageList.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		
		System.out.println("\n" + languageList);// empty list []
	}
}

