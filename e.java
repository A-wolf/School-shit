package uppgifter;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class e extends Application {

	public static final double WINDOW_WIDTH = 800;
	public static final double WINDOW_HEIGHT = 600;
	public static final double ROCK_SIZE = 75;

	public static final ArrayList<KeyCode> keys = new ArrayList<KeyCode>();

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

		Rocket Rocket = new Rocket(ROCK_SIZE);

		root.getChildren().add(Rocket);

		scene.setOnKeyPressed(event -> {

			if (!keys.contains(event.getCode())) {
				keys.add(event.getCode());
			}

		});

		scene.setOnKeyReleased(event -> {

			if (keys.contains(event.getCode())) {

				keys.remove(event.getCode());
			}
		});

		AnimationTimer at = new AnimationTimer() {

			@Override
			public void handle(long now) {

				for (int i = 0; i < keys.size(); i++) {

					KeyCode key = keys.get(i);

					switch (key) {

					case W:
					case UP:
						Rocket.moveUp();
						break;
					case S:
					case DOWN:
						Rocket.moveDown();
						break;
					case A:
					case LEFT:
						Rocket.moveLeft();
						break;
					case D:
					case RIGHT:
						Rocket.moveRight();
						break;
					case E:
						Rocket.setRotate(Rocket.getRotate() + 2);
						break;
					case Q:
						Rocket.setRotate(Rocket.getRotate() - 2);
						break;
					case CONTROL:
						Rocket.Hyperdrive();
						Rocket.changeColor();
						break;
						
					case SHIFT:
						Rocket.Slow();
						Rocket.changeColor();
						break;
					}

					if (Rocket.getTranslateX() > WINDOW_WIDTH) {
						Rocket.setTranslateX(0 - ROCK_SIZE);
					} else if (Rocket.getTranslateX() < -ROCK_SIZE) {
						Rocket.setTranslateX(WINDOW_WIDTH);
					}

					if (Rocket.getTranslateY() > WINDOW_HEIGHT) {
						Rocket.setTranslateY(0 - ROCK_SIZE);
					} else if (Rocket.getTranslateY() < -ROCK_SIZE) {
						Rocket.setTranslateY(WINDOW_HEIGHT);
					}

				}

			}

		};

		at.start();

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
