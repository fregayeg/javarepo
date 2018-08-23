package tn.ocp.collections.abstractandinterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Example: An Abstract class implementing Iterable interface
 * NOTE: a class implementing Iterable interface can be used for iterating with a foreach loop
 * without need to implement abstract methods from Iterable. ( as we use abstract class)
 * @author REGAYEG
 */
abstract class TestA implements Iterable<String> {
	
}

/**
 * Example: A Concrete class implementing Iterable interface
 * NOTE: a class implementing Iterable interface can be used for iterating with a foreach loop
 * 		 but here we have to implement abstract methods from Iterable (as we use concrete class)
 * @author REGAYEG
 */
class TestB implements Iterable<String>{

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
		List<String> arrList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>(); 
		
		Set<String> hashSet = new HashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		
	}
	
}
