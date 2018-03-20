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

		Rectangle body = new Rectangle(width, 2.75*width );
		
		Polygon tip = new Polygon();
		
		tip.getPoints().addAll(new Double[]{
	            (width/2), (-width),
	            (width-150.0), (width),
	            (width+75.0), (width) });


		
		//Circle tire1 = new Circle(width / 7);
		//Circle tire2 = new Circle(width / 7);

		//tire1.setTranslateY(2 * width / 3);
		//tire2.setTranslateY(2 * width / 3);

		//tire1.setTranslateX(width / 5);
		//tire2.setTranslateX(width - width / 5);

		this.getChildren().addAll(body, tip );

	}

	public void changeColor() {

		Color color = new Color(Math.random(), Math.random(), Math.random(), 1);

		for (int i = 0; i < this.getChildren().size(); i++) {
			Shape s = (Shape) this.getChildren().get(i);
			s.setFill(color);
		}

	}
	double H = 5;
	public void Hyperdrive () {
		 H = 99;
	}

	public void Slow() {
		 H = 5;
	}
	
	public void moveUp() {
		
		this.setTranslateY(this.getTranslateY() - H);
	}

	public void moveDown() {
		this.setTranslateY(this.getTranslateY() + H);
	}

	public void moveLeft() {
		double deg = this.getRotate();
		deg = Math.toRadians(deg);

		this.setTranslateY(this.getTranslateY() - Math.sin(deg) * H);
		this.setTranslateX(this.getTranslateX() - Math.cos(deg) * H);
	}

	public void moveRight() {
		double deg = this.getRotate();
		deg = Math.toRadians(deg);

		this.setTranslateY(this.getTranslateY() + Math.sin(deg) * H);
		this.setTranslateX(this.getTranslateX() + Math.cos(deg) * H);
	}

}
