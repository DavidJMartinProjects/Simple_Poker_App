package com.poker;

import java.util.TreeSet;

public class Hand {
	TreeSet<Card> hand = new TreeSet<>();

	@Override
	public String toString() {
		String myString = new String();
		
		for(Card myCard : hand) {
			myString+= myCard.toString();
		}		
		return myString;
	}	
	
}
