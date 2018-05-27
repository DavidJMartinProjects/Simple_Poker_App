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
		String cardValue = new String();
		
		switch(this.value) {
			case 11 : {
				cardValue = "Jack";
				break;
			}
			case 12 : {
				cardValue = "Queen";
				break;
			}
			case 13 : {
				cardValue = "King";
				break;
			}
			case 14 : {
				cardValue = "Ace";
				break;
			}
			default : {
				cardValue = String.valueOf(value);
			}
		}
		return "Card [value=" + cardValue + ", suit=" + suit + "] \n";
	}

	@Override
	public int compareTo(Card o) {
		return Integer.compare(this.value, o.value);
	}
}
