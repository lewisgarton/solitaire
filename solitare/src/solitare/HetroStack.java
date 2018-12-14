package solitare;

import java.util.ArrayList;

public class HetroStack extends CardStack{

	
	public HetroStack() {
		cards = new ArrayList<Card>();
	}
	
	
	@Override
	public boolean pushCheck(Card card) {
		boolean possible = false;
		
		if (cards.size() > 0) {												//stack is not empty
			Card topCard = cards.get(size()-1);
			if (topCard.getColor() != card.getColor()) { 					//Cards are different color
					if (topCard.getNumber() == card.getNumber()+1) {		//Top card is 1 less than the card being added
						possible = true;
					}
			}
		} else if (card.getNumber() == Card.KING) {
			possible = true;																//Stack is empty, king is possible
		}
		return possible;
	}

}
