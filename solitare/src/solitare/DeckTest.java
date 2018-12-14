package solitare;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DeckTest {
	
	@Test
	public void testDeckSize() {
		Deck d = new Deck();
		int deckSize = 52;
		assertEquals(deckSize, d.size());
	}
	
	@Test
	public void testDeckComplete() {
		// Check to ensure the deck creates a correct set of cards.
		// very clunky!
		
		ArrayList<String> clubs = new ArrayList<String>(Arrays.asList("a", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k"));
		@SuppressWarnings("unchecked")
		ArrayList<String> spades = (ArrayList<String>) clubs.clone();
		@SuppressWarnings("unchecked")
		ArrayList<String> hearts = (ArrayList<String>) clubs.clone();
		@SuppressWarnings("unchecked")
		ArrayList<String> diamonds = (ArrayList<String>) clubs.clone();
		
		int deckSize = 52;
		Deck d = new Deck();
		Card c;
		String suit;
		d.shuffle();
		
		for (int i = 0; i < deckSize; i++) {
			c = d.drawCard();
			suit = c.getSuit();
			if (suit == "clubs") clubs.remove(c.getNumber());
			else if (suit == "spades") spades.remove(c.getNumber());
			else if (suit == "diamonds") diamonds.remove(c.getNumber());
			else if (suit == "hearts") hearts.remove(c.getNumber());
		}
		
		assertEquals(spades.size(), 0);
		assertEquals(clubs.size(), 0);
		assertEquals(diamonds.size(), 0);
		assertEquals(hearts.size(), 0);		
	}
}
