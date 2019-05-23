package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		//Project path
		String current = new java.io.File( "." ).getCanonicalPath();

		BorderPane mainWindow = new BorderPane();
		Scene scene = new Scene(mainWindow);
		mainWindow.prefHeightProperty().bind(scene.heightProperty());
		mainWindow.prefWidthProperty().bind(scene.widthProperty());

		VBox contentHeader = new VBox();
		contentHeader.setPadding(new Insets(0, 0, 20, 0));

		VBox content = new VBox();
		content.setPadding(new Insets(20));
		content.setAlignment(Pos.CENTER);
		
		
		HBox header = Header.display("Avdullahu", "Super Admin", current);
		header.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		header.prefHeightProperty().bind(mainWindow.widthProperty().divide(120));
		header.prefWidthProperty().bind(mainWindow.widthProperty().divide(7).multiply(5.5));
		
		VBox sideBar = Sidebar.display(current);
		sideBar.prefWidthProperty().bind(mainWindow.widthProperty().divide(7));
		sideBar.setMinWidth(20);
		sideBar.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		VBox mainComponent = MainComponent.display("Name" , "Trainers","Email","Website","Address",current);

		mainComponent.prefWidthProperty().bind(mainWindow.widthProperty().divide(7).multiply(5));
		
		try {
			
			content.getChildren().addAll(
					Filter.display(Main.class.getName()),
					Dashboard.display(),
					//mainComponent,
					Pagination.display(122));
			contentHeader.getChildren().addAll(header, content);
//			mainWindow.setTop(Header.display("Avdullahu", "Super Admin", current));	
//	        mainWindow.setCenter(MainComponent.display("Name" , "Trainers","Email","Website","Address",current));
	        mainWindow.setCenter(contentHeader);
			mainWindow.setLeft(sideBar);
	        

		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		scene.getStylesheets().add("https://fonts.googleapis.com/css?family=Titillium+Web:200,300,400,700&display=swap");
		scene.getStylesheets().add(Main.class.getResource("header.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setMaximized(true);
		primaryStage.setMinWidth(800);
		primaryStage.setMinHeight(800);
		primaryStage.show();
	}
	
	public static void main(String[] args) {

		launch(args);
	}

}
