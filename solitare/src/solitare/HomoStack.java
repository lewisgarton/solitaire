package solitare;

public class HomoStack extends CardStack{
	private String suit;
	
	@Override
	public void pushCard(Card card) {
		// TODO Auto-generated method stub
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	@Override
	public boolean pushCheck(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

}
