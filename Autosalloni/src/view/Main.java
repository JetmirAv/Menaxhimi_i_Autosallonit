package view;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static String name = null;
	public static String surname = null;
	public static String role = null;
	public static String email = null;
	public static BorderPane mainWindow = new BorderPane();
	public static ArrayList<String> history = new ArrayList<String>();
	public static ArrayList<Node> nodeHistory = new ArrayList<Node>();
	public static VBox content = new VBox();

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = null;
		
		if (name == null) {

			scene = new Scene(new SignIn());
			
		} else {
			content.setSpacing(30);
			content.setPadding(new Insets(50, 10, 30, 10));

			content.getChildren().add(new Dashboard());

			try {
				mainWindow.setCenter(content);
				mainWindow.setTop(new Header());
				mainWindow.setLeft(new Sidebar());

			} catch (Exception e) {
				e.printStackTrace();
			}

			scene = new Scene(mainWindow, 1440, 800);

		}
		scene.getStylesheets()
				.add("https://fonts.googleapis.com/css?family=Titillium+Web:200,300,400,700&display=swap");
		scene.getStylesheets().add(Main.class.getResource("header.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Autosalloni");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) throws IOException {
		launch(args);
	}

}
