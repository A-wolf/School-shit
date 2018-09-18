package uppgifter;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Card extends Group {

	String color;

	int value;

	public static final double WIDTH = 100;

	public static final double HEIGHT = 250;

	public Card(int a, int b) {

		switch (a) {

		case 1:
			color = "Hearts";
			break;

		case 2:
			color = "Spade";
			break;

		case 3:
			color = "Clover";
			break;

		case 4:
			color = "Dimonds";
			break;
		}

		if (b >= 2 && b <= 14) {

			value = b;

		}

		Text TheCardColor = new Text();
		TheCardColor.setText(color);

		Text TheCardValue = new Text();
		switch (value) {

		case 11:
			TheCardValue.setText("Knight");
			break;

		case 12:
			TheCardValue.setText("Queen");
			break;

		case 13:
			TheCardValue.setText("King");
			break;

		case 14:
			TheCardValue.setText("Ace");
			break;

		default:
			TheCardValue.setText("" + value);
			break;

		}

		Rectangle background = new Rectangle(WIDTH, HEIGHT);
		background.setFill(Color.WHITE);
		background.setStroke(Color.BLACK);
		background.setStrokeWidth(5);

		TheCardColor.setTranslateX(WIDTH / 2 - (WIDTH / 4));
		TheCardColor.setTranslateY(HEIGHT / 4);

		TheCardValue.setTranslateX(WIDTH / 2 - (WIDTH / 4));
		TheCardValue.setTranslateY(HEIGHT / 2);

		this.getChildren().addAll(background, TheCardColor, TheCardValue);
	}

}
