package tn.ocp.generics.wilcards;

import java.util.ArrayList;
import java.util.List;

public class WildCardsLimitations {

	public static void main(String[] args) {
		List<?> wildCardList = new ArrayList<>();
		//wildCardList.add(new Integer(120)); // doesn't compile		
		System.out.println(wildCardList);
	}

}
