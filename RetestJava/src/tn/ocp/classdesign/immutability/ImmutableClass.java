package tn.ocp.classdesign.immutability;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
	
	// FIELDS
	private final int id;
	private final String name;
	private final Set<String> setOfQualities;
	private static int numberOfInstances;
	
	// CONSTRUCTORS
	
	public ImmutableClass() {
		this(numberOfInstances,"\"Unknown\"", new HashSet<>());
	}
	public ImmutableClass(String pName) {
		this(numberOfInstances,pName,new HashSet<>());
	}
	public ImmutableClass(String pName, Set<String> pSet) {
		this(numberOfInstances,pName,pSet);
	}
	public ImmutableClass(int pNbrOfInst, String pName) {
		this(pNbrOfInst,pName,new HashSet<>());
	}
	private ImmutableClass(int pNbrOfInst ,String pName, Set<String> pSet){
		
		if(pNbrOfInst == numberOfInstances)
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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((setOfQualities == null) ? 0 : setOfQualities.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImmutableClass other = (ImmutableClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (setOfQualities == null) {
			if (other.setOfQualities != null)
				return false;
		} else if (!setOfQualities.equals(other.setOfQualities))
			return false;
		return true;
	}
	public static void main(String[] args) {
		// prepare new set to be assigned to the object
		Set<String> qualities= new HashSet<>();		
		
		ImmutableClass user = new ImmutableClass("Firas", qualities ); // autoincrement id, name and the set
		qualities.add("Kind");
		qualities.add("Gentle");
		qualities.add("Sometimes joking");
		
		//System.out.println(user);
		
		ImmutableClass user2 = new ImmutableClass();
		//System.out.println(user2); // id = 
		
		ImmutableClass user3 = new ImmutableClass("Omar",qualities);
		ImmutableClass user4 = new ImmutableClass(0,"Karim", qualities);
		ImmutableClass user5 = new ImmutableClass(-1,"Achraf");
		ImmutableClass user6 = new ImmutableClass(10,"Hakim");

		List<ImmutableClass> list = new ArrayList<>();
		list.add(user3);
		list.add(user4);
		list.add(user5);	
		list.add(user6);
	
		for(Iterator<ImmutableClass> iterator = list.iterator(); iterator.hasNext() ;) {
			ImmutableClass useri = iterator.next();
			if(useri.getId() <= 0 ) {
				System.out.println("erreur: l'id de " + useri.getName() + " est invalide");
				continue;
			}
			
			System.out.println(useri);
		}
		/*
		if(user4.getId() <= 0) {
			System.out.println("erreur id: doit etre superieur à zero");
		}else {
		System.out.println(user4); // id = 1 
		}
		ImmutableClass user5 = new ImmutableClass("Omar", qualities);
		System.out.println(user5); // id = 3

		System.out.println(user5.equals(user));
		*/
		
	}
}
