package blackjack;

public class Blackjack {

public int play(int a, int b) {
		
		if (a < 0 || b < 0) {
			return 0;
		} else if (a > 21 && b > 21) {
			return 0;
		} else if (a > 21) {
			return b;
		} else if (b > 21) {
			return a;
		} else if (a > b) {
			return a;
		} else {
			return b;
		}

	}
}
