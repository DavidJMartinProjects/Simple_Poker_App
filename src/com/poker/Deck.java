package com.poker;

import java.util.Stack;

public class Deck {

	private Stack<Card> theDeck = new Stack<Card>();
	
	public Stack<Card> getTheDeck() {
		return theDeck;
	}

	public void setTheDeck(Stack<Card> theDeck) {
		this.theDeck = theDeck;
	}

	public void initialise_deck() {

		for (int suit = 0; suit < 4; suit++) {
			String theSuit;

			switch (suit) {
				case 0: {
					theSuit = "Clubs";
					break;
				}
				case 1: {
					theSuit = "Spades";
					break;
				}
				case 2: {
					theSuit = "Hearts";
					break;
				}
				case 3: {
					theSuit = "Diamonds";
					break;
				}
				default: {
					theSuit = "unknown";
					break;
				}
			}

			for (int value = 2; value < 15; value++) {
				Card myCard = new Card(value, theSuit);
				theDeck.add(myCard);
			}
		}
		System.out.println("Deck Initialised...\n");
	}

	public void showDeck() {
		for (Card myCard : theDeck) {
			System.out.println(myCard);
		}
	}

}
