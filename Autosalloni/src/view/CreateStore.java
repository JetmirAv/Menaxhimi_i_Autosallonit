package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
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
	
	public static Label nameLbl = new Label("Name");
	public static TextField nameField = new TextField();
	public static TextField addressField = new TextField();
	public static Label cityLbl = new Label("City");
	public static TextField cityField = new TextField();
	public static Label postalLbl = new Label("Postal");
	public static TextField postalField = new TextField();
	public static TextField stateField = new TextField();
	public static TextField phonenumberField = new TextField();



	public  CreateStore() throws IOException
	{
		String current = new java.io.File(".").getCanonicalPath();
		
		FileInputStream userPath = new FileInputStream(current + "/src/img/user.png");
		
		HBox mainHbox = new HBox(25);
		
		VBox leftVbox = new VBox(18);
		nameField.setPromptText("Store Name");
		cityField.setPromptText("Store City");
		postalField.setPromptText("Postal");
		leftVbox.setAlignment(Pos.CENTER_LEFT);
		leftVbox.getChildren().addAll(nameLbl,nameField,cityLbl,cityField,postalLbl,postalField);
		

		VBox middleVbox = new VBox(60);
		Image img = new Image(userPath);		
		Circle store1Circle = new Circle();
		store1Circle.setRadius(50);
		store1Circle.setFill(new ImagePattern(img));
		Button signUpBtn = new Button("Create Store");
		signUpBtn.setOnMouseEntered(e -> {
		signUpBtn.setCursor(Cursor.HAND);
		});
		signUpBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		signUpBtn.setPrefWidth(220);
		signUpBtn.setMaxWidth(220);
		signUpBtn.setOnAction(new controller.CreateStoreController());
		
		
		
		middleVbox.getStyleClass().add("photoToCenter");
		middleVbox.setPadding(new Insets(145, 0, 0, 0));	
		middleVbox.setAlignment(Pos.CENTER);
		middleVbox.getChildren().addAll(store1Circle,signUpBtn);
		
		
		
		
		VBox rightVbox = new VBox(18);
		Label addressLbl = new Label("Address");
		addressField.setPromptText("Store Address");
		Label stateLbl = new Label("State");
    	stateField.setPromptText("Store State");
    	Label phonenumberLbl = new Label("PhoneNumber");
		phonenumberField.setPromptText("Store Phone");
		rightVbox.setAlignment(Pos.CENTER_LEFT);
		rightVbox.getChildren().addAll(addressLbl,addressField ,stateLbl, stateField,phonenumberLbl,phonenumberField);

		
		
		
		mainHbox.setAlignment(Pos.CENTER);
		mainHbox.setStyle("-fx-border-color: black;\n" +
                "-fx-border-insets: 5;\n" +
                "-fx-border-width: 2;\n" +
                "-fx-border-style: solid;\n");
		mainHbox.getChildren().addAll(leftVbox,middleVbox,rightVbox);
		getChildren().add(mainHbox);
		
		
	}
}
