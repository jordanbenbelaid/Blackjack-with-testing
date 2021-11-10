package blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BlackjackTest {

	Blackjack blackjack;
	
	@Before
	public void setup() {
		blackjack = new Blackjack();
	}
	
	
	@Test
	public void lessThanZeroTest() {
		int player1 = -4;
		int player2 = 5;
		int expected = 0;
		
		assertEquals(expected, blackjack.play(player1, player2));
	}
	
	@Test
	public void greaterThan21Test() {
		int player1 = 23;
		int player2 = 22;
		int expected = 0;
		
		assertEquals(expected, blackjack.play(player1, player2));
	}
	
	@Test
	public void player1Over21Test() {
		int player1 = 23;
		int player2 = 20;
		int expected = 20;
		
		assertEquals(expected, blackjack.play(player1, player2));
	}
	
	@Test
	public void player2Over21Test() {
		int player1 = 20;
		int player2 = 22;
		int expected = 20;
		
		assertEquals(expected, blackjack.play(player1, player2));
	}
	
	@Test
	public void player1WinsTest() {
		int player1 = 21;
		int player2 = 17;
		int expected = 21;
		
		assertEquals(expected, blackjack.play(player1, player2));
	}
	
	@Test
	public void player2WinsTest() {
		int player1 = 12;
		int player2 = 20;
		int expected = 20;
		
		assertEquals(expected, blackjack.play(player1, player2));
	}
}
