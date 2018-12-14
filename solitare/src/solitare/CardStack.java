package solitare;

import java.util.ArrayList;

public abstract class CardStack {
	protected ArrayList<Card> cards;
	
	public abstract boolean pushCheck(Card card);
	
	public void pushCard(Card card) {
		cards.add(card);
	}
	
	public Card popCard() {
		return cards.remove(cards.size()-1);
	}
	
	public int size() {
		return cards.size();
	}
}
