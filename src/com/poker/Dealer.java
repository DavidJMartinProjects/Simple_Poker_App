package com.poker;

import java.util.Random;

public class Dealer {
	private Hand player1 = new Hand();
	private Hand player2 = new Hand();
	private Random random = new Random();
	private Deck myDeck = new Deck();

	public void dealHands() {
		myDeck.initialise_deck();
		System.out.println("The Dealer is dealing 2 hands...\n");

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
		System.out.println("--- Player 2 ---");
		System.out.println(player2);
	}

	public void startGame() {
		dealHands();
		showHands();
		evaluate(player1);
//		evaluate(player2);
	}
	
	public void evaluate(Hand aHand) {
		if(aPair(aHand) >= 1) {
			System.out.println("You have a Pair!");
		}
	}
	
	public int aPair(Hand player) {
		int check = 0;
		for(int i=0; i<5; i++) {
			if(player.hand.get(i).getValue() == player.hand.get(4).getValue()) {
				check++;
			}				
		}
		System.out.println("Check : " +check);
		return check;
	}
	
}
