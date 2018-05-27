package com.poker;

import java.util.Random;

public class Dealer {
	private Hand player1 = new Hand();
	private Hand player2 = new Hand();
	private Random random = new Random();
	private Deck myDeck = new Deck();

	public void dealHands() {
		myDeck.initialise_deck();

		int cardsInDeck = 52;
		for (int i = 0; i < 10; i++) {
			int randomCard = random.nextInt(cardsInDeck);

			while (randomCard > myDeck.getTheDeck().size()) {
				randomCard = random.nextInt(cardsInDeck);
			} 
				if (i % 2 == 0) {
					player1.hand.add(myDeck.getTheDeck().get(randomCard));					
				} else {
					player2.hand.add(myDeck.getTheDeck().get(randomCard));					
				}
				myDeck.getTheDeck().remove(randomCard);
				cardsInDeck--;			
		}
	}

	public void showHands() {
		System.out.println("--- Player 1 ---");
		System.out.println(player1);
		System.out.println();
		System.out.println("--- Player 2 ---");
		System.out.println(player2);
	}

	public void startGame() {
		dealHands();
		showHands();
	}
}
