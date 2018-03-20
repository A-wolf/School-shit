package uppgifter;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Rocket extends Group {

	public Rocket() {
		this(75);
	}

	public Rocket(double width) {

		Rectangle body = new Rectangle(width, 2.75 * width);

		Polygon tip = new Polygon();

		tip.getPoints().addAll(
				new Double[] { (width / 2), (-1.5 * width), (width - 150.0), (width), (width + 75.0), (width) });

		this.getChildren().addAll(body, tip);

	}

	public void changeColor() {

		Color color = new Color(Math.random(), Math.random(), Math.random(), 1);

		for (int i = 0; i < this.getChildren().size(); i++) {
			Shape s = (Shape) this.getChildren().get(i);
			s.setFill(color);
		}

	}

	double H = 5;

	public void Hyperdrive() {
		H = 99;

		System.out.println("Hyperdrive engaded");
	}

	public void Slow() {
		H = 5;

		System.out.println("Hyperdrive disengaded");
	}

	public void moveUp() {

		this.setTranslateY(this.getTranslateY() - H);
	}

	public void moveDown() {
		this.setTranslateY(this.getTranslateY() + H);
	}

	public void moveLeft() {
		this.setRotate(this.getRotate() + 5);
	}

	public void moveRight() {
		this.setRotate(this.getRotate() + 5);

	}

}
