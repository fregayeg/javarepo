package tn.ocp.classdesign.immutability;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Example of immutable class
 * FIELDS: id, name, setOfQualities
 * CONSTRUCTORS: 
 * 1- default, 2- with String param, 3 - with String and Set params, 4 -with int and String and Set params
 * METHODS FROM Object: toString()
 * @author Firas
 */
public final class ImmutableClass {
	
	private final int id;
	private final String name;
	private final Set<String> setOfQualities;
	private static int numberOfInstances = 0;
	
	public ImmutableClass() {
		this(numberOfInstances,"\"Unknown\"", new HashSet<>());
	}
	public ImmutableClass(String pName) {
		this(numberOfInstances,pName,new HashSet<>());
	}
	public ImmutableClass(String pName, Set<String> pSet) {
		this(numberOfInstances,pName,pSet);
	}
	private ImmutableClass(int pNbrOfInst ,String pName, Set<String> pSet){
		pNbrOfInst = ++numberOfInstances;
		id = pNbrOfInst;
		name = pName;
		setOfQualities = pSet;
	}	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Set<String> getSetOfQualities() {
		return setOfQualities;
	}

	@Override
	public String toString() {
		String strForSet = setOfQualities.isEmpty() ? "No qualities" : setOfQualities.toString();
		return "[id = " + id + ", name = " + name + ", qualities = " + strForSet;
	}
	
	public static void main(String[] args) {
		// prepare new set to be assigned to the object
		Set<String> qualities= new HashSet<>();		
		
		ImmutableClass user = new ImmutableClass("Firas", qualities ); // autoincrement id, name and the set
		
		qualities.add("Kind");
		qualities.add("Gentle");
		qualities.add("Sometimes joking");
		
		System.out.println(user);
		ImmutableClass user2 = new ImmutableClass();
		System.out.println(user2);
		
		ImmutableClass user3 = new ImmutableClass("Omar");
		ImmutableClass user4 = new ImmutableClass("Omar");

		System.out.println(user3);
		
		System.out.println(user3.equals(user4));
		
	}
}
