package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		String current = new java.io.File( "." ).getCanonicalPath();
		VBox content = new VBox();
		
		BorderPane mainWindow = new BorderPane();
		try {
			content.getChildren().addAll(
					Header.display("Jetmir Avdullahu", "Super Admin", current),
					MainComponent.display("Name" , "Trainers","Email","Website","Address",current));
//			mainWindow.setTop(Header.display("Jetmir Avdullahu", "Super Admin", current));	
//	        mainWindow.setCenter(MainComponent.display("Name" , "Trainers","Email","Website","Address",current));
	        mainWindow.setCenter(content);
			mainWindow.setLeft(Sidebar.display(current));
	        

		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(mainWindow, 800, 800);
		scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Titillium+Web:200,300,400,700&display=swap");
		
		primaryStage.setScene(scene);
		primaryStage.setMaximized(true);
		primaryStage.show();
	}
	
	public static void main(String[] args) {

		launch(args);
	}

}
