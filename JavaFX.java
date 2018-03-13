package uppgifter;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;

import javafx.stage.Stage;

public class JavaFX extends Application {

	double i = 600;

	Scene scene;
	final double WIDTH = i;
	final double HEIGHT = i;

	@Override
	public void start(Stage primaryStage) throws Exception {

		scene = upg1();

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public Scene upg1() {

		Group root1 = new Group();

		Scene scene = new Scene(root1, WIDTH, HEIGHT);

		for (i = 0; i < 50; i++) {

			Circle rect = new Circle(Math.random() * 600 / 6);
			rect.setLayoutX(Math.random() * 600);
			rect.setLayoutY(Math.random() * 600);
			rect.setFill(
					Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));

			root1.getChildren().add(rect);
		}
		return scene;

	}

	public static void main(String[] args) {
		launch();
	}

}