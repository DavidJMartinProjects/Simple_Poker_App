package com.poker;

import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;

public class Hand {
	List<Card> hand = new ArrayList<>();

	@Override
	public String toString() {
		String myString = new String();
		
		for(Card myCard : hand) {
			myString+= myCard.toString();
		}		
		return myString;
	}	
	
}
