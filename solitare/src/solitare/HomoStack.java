package solitare;

public class HomoStack extends CardStack{
	private String suit;
	
	@Override
	public boolean pushCard(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

}
