package com.poker;

public class Card implements Comparable<Card>{
	
	private int value;
	private String suit;
	
	public Card(int value, String suit) {
		super();
		this.value = value;
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return "Card [value=" + value + ", suit=" + suit + "] \n";
	}

	@Override
	public int compareTo(Card o) {
		int result = Integer.compare(o.value, this.value);
		return result;
	}

}
