package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static BorderPane mainWindow = new BorderPane();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		String current = new java.io.File( "." ).getCanonicalPath();
		VBox content = new VBox();	
//		BorderPane.setMargin(mainWindow.getCenter(), new Insets(20));

		try {
			mainWindow.setCenter(Dashboard.display());
			mainWindow.setTop(Header.display("Jetmir Avdullahu", "Super Admin", current));
			mainWindow.setLeft(Sidebar.display(current));

		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		Scene scene = new Scene(mainWindow, 1440, 800);
		scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Titillium+Web:200,300,400,700&display=swap");
		scene.getStylesheets().add(Main.class.getResource("header.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
//		primaryStage.setMaximized(true);
		primaryStage.show();
	}
	
	public static void main(String[] args) throws IOException {
		launch(args);
	}

}
