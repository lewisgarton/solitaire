package solitare;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	private String[] suits = {"clubs", "spades", "hearts", "diamonds" }; 
	private String[] values = {"a", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k"};
	
	public Deck() {
		for (String suit : suits) {
			for (String value : values) {
				cards.add(new Card(suit, value));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card drawCard() {
		return cards.remove(-1);
	}
	
	public void returnCard(Card card) {
		cards.add(0, card);
	}
	
	public int cardsRemaining() {
		return cards.size();
	}
}
