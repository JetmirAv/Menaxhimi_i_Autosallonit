package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	

	
	public static String token = null; 
	public static int loggedId = 0;
	public static String loggedName = null;
	public static String loggedSurname = null;
	public static int loggedRole = 0;
	public static String loggedEmail = null;
	public static String loggedImg = null;
	public static BorderPane mainWindow = new BorderPane();
	public static ArrayList<String> history = new ArrayList<String>();
	public static ArrayList<Node> nodeHistory = new ArrayList<Node>();
	public static VBox content = new VBox();
	public static Scene scene = null;
	public static ComboBox<String> languagesCbo = new ComboBox<>();
	public static ObservableList<String> allowedLanguages = FXCollections.observableArrayList();

	@Override
	public void start(Stage primaryStage) throws Exception {

		// ObservableList<String> allowedLanguages =
		// FXCollections.observableArrayList();

		for (int i = 0; i < I18N.getLanguages().size(); i++) {
			allowedLanguages.add(I18N.getLanguages().get(i).getLanguage());
		}
		if (loggedName == null) {

			SignIn.display();

		} else {

			scene = new Scene(mainWindow, 1440, 800);

		}

		
		content.setSpacing(30);
		content.setPadding(new Insets(50, 10, 30, 10));

		try {
			if(Main.loggedRole == 1) {
				content.getChildren().add(new Dashboard());
			} else {
				content.getChildren().add(Cars.display());
			}
			mainWindow.setCenter(content);				
			mainWindow.setTop(new Header());
			mainWindow.setLeft(new Sidebar());

		} catch (Exception e) {
			e.printStackTrace();
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
//	public static void switchLanguage() {
//		I18N.setLocale(new Locale(languagesCbo.getValue()));
//	}

}
