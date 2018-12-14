package solitare;

public class Card {
	public static final int JACK = 11; 
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 14;
	public static final String CLUBS = "clubs";
	public static final String SPADES = "spades";
	public static final String HEARTS = "hearts";
	public static final String DIAMONDS = "diamonds";
	public static final String RED = "red";
	public static final String BLACK = "black";
	
	private String suit;
	private int number;
	private String color;
	

	public Card(String suit, int number) {
		//TODO check suit, throw exception
		this.suit = suit.toLowerCase();
		//TODO check bounds of the number, throw exception
		this.number = number;
		this.setColor();
	}
	
	private void setColor() {
		if (suit == SPADES || suit == CLUBS) color = BLACK;
		else color = RED;
	}	
	
	
	public String getColor() {
		return color;
	}	
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
		this.setColor();
	}
	public void setNumber(int number) {
		//TODO check suit, throw exception
		this.number = number;
	}	
	public int getNumber() {
		return number;
	}
}
