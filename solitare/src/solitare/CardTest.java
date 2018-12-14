package solitare;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void testCardColor() {
		// Ensure all cards are assigned the correct value
		assertEquals(new Card(Card.SPADES, Card.ACE).getColor(), Card.BLACK);
		assertEquals(new Card(Card.CLUBS, Card.ACE).getColor(), Card.BLACK);
		assertEquals(new Card(Card.HEARTS, Card.ACE).getColor(), Card.RED);
		assertEquals(new Card(Card.DIAMONDS, Card.ACE).getColor(), Card.RED);
	}

}
