package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Locale;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import models.DatabaseConfig;

public class CreateStore extends HBox
{
	
	public static Label nameLbl = I18N.getLabel("name");
	public static TextField nameField = new TextField();
	public static Label cityLbl = I18N.getLabel("city");
	public static TextField cityField = new TextField();
	public static Label postalLbl = I18N.getLabel("postal");
	public static TextField postalField = new TextField();
	public static Label stateLbl = I18N.getLabel("state");
	public static TextField stateField = new TextField();
	public static Label addressLbl = I18N.getLabel("address");
	public static TextField addressField = new TextField();
	public static Label phonenumberLbl = I18N.getLabel("phoneNr");
	public static TextField phonenumberField = new TextField();
	public static Button signUpBtn = I18N.getButton("create");
	public static ComboBox<String> languagesCbo = new ComboBox<>();



	public  CreateStore() throws IOException
	{
		String current = new java.io.File(".").getCanonicalPath();
		languagesCbo.getItems().addAll(Main.allowedLanguages);
		languagesCbo.setValue(I18N.getDefaultLocale().getLanguage());
		languagesCbo.setOnAction(e -> switchLanguage());
		
		FileInputStream userPath = new FileInputStream(current + "/src/img/user.png");
		
		HBox mainHbox = new HBox(25);
		
		VBox leftVbox = new VBox(18);
		nameField.setPromptText("Store Name");
		cityField.setPromptText("Store City");
		postalField.setPromptText("Postal");
		leftVbox.setAlignment(Pos.CENTER_LEFT);
		leftVbox.getChildren().addAll(nameLbl,nameField,cityLbl,cityField,postalLbl,postalField);
		

		VBox middleVbox = new VBox(60);
//		Image img = new Image(userPath);		
//		Circle store1Circle = new Circle();
//		store1Circle.setRadius(50);
//		store1Circle.setFill(new ImagePattern(img));
		
		signUpBtn.setOnMouseEntered(e -> {
		signUpBtn.setCursor(Cursor.HAND);
		});
		signUpBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		signUpBtn.setPrefWidth(220);
		signUpBtn.setMaxWidth(220);
		signUpBtn.setOnAction(new controller.CreateStoreController());
		
		
		
//		middleVbox.getStyleClass().add("photoToCenter");
//		middleVbox.setPadding(new Insets(145, 0, 0, 0));	
		middleVbox.setAlignment(Pos.BOTTOM_CENTER);
		middleVbox.getChildren().addAll(signUpBtn);
		
		
		
		
		VBox rightVbox = new VBox(18);
		
		addressField.setPromptText("Store Address");
		
    	stateField.setPromptText("Store State");
    	
		phonenumberField.setPromptText("Store Phone");
		rightVbox.setAlignment(Pos.CENTER_LEFT);
		rightVbox.getChildren().addAll(addressLbl,addressField ,stateLbl, stateField,phonenumberLbl,phonenumberField);

		
		
		
		mainHbox.setAlignment(Pos.CENTER);
//		mainHbox.setStyle("-fx-border-color: black;\n" +
//                "-fx-border-insets: 5;\n" +
//                "-fx-border-width: 2;\n" +
//                "-fx-border-style: solid;\n"
//                + "");
		
		mainHbox.getChildren().addAll(leftVbox,middleVbox,rightVbox);
		
		getChildren().add(mainHbox);
		
		
	}
	public static void switchLanguage() {
		I18N.setLocale(new Locale(languagesCbo.getValue()));
	}
}
