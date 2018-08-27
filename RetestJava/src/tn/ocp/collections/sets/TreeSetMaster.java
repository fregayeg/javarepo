package tn.ocp.collections.sets;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example of using TreeSet to get an ordered collection 
 * This program is called pangram, which means a sentence that uses all letters in th alphabet
 * at least once
 * @author REGAYEG
 *
 */
public class TreeSetMaster {
	public static void main(String[] args) {
		// pangram sentence
		String pangram = "the quick brown fox jumps over the lazy dog";
		
		// declaring a TreeSet of type Character
		Set<Character> aToZee = new TreeSet<Character>();
		
		// Transforming the pangram String inti a char array
		// then, looping the new char array
		for (char gram : pangram.toLowerCase().toCharArray())
			aToZee.add(gram); // add every character from the array to the 
		
		// prints:the quick brown fox jumps over the lazy dog
		System.out.println("The pangram is: " + pangram); 
		
		// prints: [ , a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
		System.out.print("Sorted pangram characters are: " + aToZee);
	}
}

