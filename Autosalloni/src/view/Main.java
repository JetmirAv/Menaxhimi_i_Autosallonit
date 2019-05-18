package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		String current = new java.io.File( "." ).getCanonicalPath();
		Main.class.getResource(current + "/src/fonts/knk.woff");
		
		
		BorderPane mainWindow = new BorderPane();
		try {
			mainWindow.setTop(Header.display("Jetmir Avdullahu", "Super Admin", current));	
	        mainWindow.setCenter(MainComponent.display("Name" , "Trainers","Email","Website","Address",current));

		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(mainWindow, 800, 800);
		primaryStage.setScene(scene);
		primaryStage.setMaximized(true);
		primaryStage.show();
	}
	
	public static void main(String[] args) {

		launch(args);
	}

}
