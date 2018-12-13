package solitare;

import java.util.ArrayList;

public abstract class CardStack {
	private ArrayList<Card> cards;
	
	public abstract boolean pushCard(Card card);
	
	public Card popCard() {
		return cards.remove(-1);
	}
	
	public int size() {
		return cards.size();
	}
}
