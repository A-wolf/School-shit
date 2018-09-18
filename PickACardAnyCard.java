package uppgifter;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PickACardAnyCard extends Application {

	public static final double MARGIN = 20;
	public static final double WIDTH = Card.WIDTH + MARGIN;
	public static final double HEIGHT = Card.HEIGHT + MARGIN;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Cards deck = new Cards();
		deck.shuffle();

		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);

		scene.setOnKeyPressed(event -> {

			if (event.getCode() == KeyCode.SPACE) {

				root.getChildren().add(deck.draw());
			}
		});

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
