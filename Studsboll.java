package uppgifter;

import javafx.scene.shape.Circle;

public class Studsboll extends Main {

	Circle boll;
	int speedX, speedY, positionX, positionY;

	public Studsboll() {

		boll = new Circle(10);

		speedX = (int) (Math.random() * 4) + 1;
		speedY = (int) (Math.random() * 4) + 1;

		positionX = WIDTH / 2 - ((int) (Math.random() * 500) - 250);
		positionY = HEIGHT / 2 - ((int) (Math.random() * 500) - 250);

		boll.setTranslateX(positionX);
		boll.setTranslateY(positionY);

	}

	void update() {

		if (!bounceCheck())
			speedY++;

		positionX += speedX;
		positionY += speedY;

		boll.setTranslateX(positionX);
		boll.setTranslateY(positionY);

	}

	boolean bounceCheck() {

		if (positionX <= 10 || positionX >= WIDTH - 10) {
			speedX *= -1;
		}
		if (positionY <= 10 || positionY >= HEIGHT - 10) {
			speedY *= -1;
			return true;
		}

		return false;

	}
}