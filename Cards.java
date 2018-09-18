package uppgifter;

import java.util.ArrayList;
import java.util.Collections;

public class Cards {

	private ArrayList<Card> cards = new ArrayList<Card>();

	public Cards() {

		for (int j = 1; j < 5; j++) {

			for (int i = 1; i < 15; i++) {

				Card c = new Card(j, i);
				cards.add(c);

			}

		}

	}

	public void shuffle() {

		Collections.shuffle(cards);

	}

	public Card draw() {

		Card card = cards.get(0);

		cards.remove(0);

		return card;

	}

}
