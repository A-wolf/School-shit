package uppgifter;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	ArrayList<Studsboll> bollar = new ArrayList<Studsboll>();

	final int WIDTH = 600, HEIGHT = 600;
	Scene scene;

	public static void main2(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		scene = main();

		primaryStage.setScene(scene);
		primaryStage.show();

		new AnimationTimer() {

			@Override
			public void handle(long now) {

				for (int i = 0; i < bollar.size(); i++) {
					bollar.get(i).update();
				}

			}

		}.start();
	}

	Scene main() {
		Group root = new Group();
		Scene scene = new Scene(root, WIDTH, HEIGHT);

		for (int i = 0; i < 40; i++) {
			bollar.add(new Studsboll());

			root.getChildren().add(bollar.get(i).boll);
		}

		return scene;
	}
}
