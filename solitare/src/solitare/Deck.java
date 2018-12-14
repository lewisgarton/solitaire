package solitare;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private String[] suits = {Card.SPADES, Card.CLUBS, Card.DIAMONDS, Card.HEARTS};
	
	public Deck() {
		for (String suit : suits) {
			for (int i = 1; i < 14; i++) {
				cards.add(new Card(suit, i));
			}
		}
	}
	
	public int size() {
		return cards.size();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card drawCard() {
		return cards.remove(cards.size()-1);
	}
	
	public void returnCard(Card card) {
		cards.add(0, card);
	}
	
	public int cardsRemaining() {
		return cards.size();
	}
}
