package view;

import java.io.FileInputStream;
import java.io.IOException;

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

public class CreateStore 
{
	
	public static HBox display() throws IOException
	{
		String current = new java.io.File(".").getCanonicalPath();
		
		FileInputStream userPath = new FileInputStream(current + "/src/img/user.png");
		
//		VBox mainVbox = new VBox(25);
//		
//		HBox firstHbox = new HBox(20);
//		Label nameLbl = new Label("Name");
//		TextField nameField = new TextField();
//		nameField.setPromptText("Store Name");
//		Label addressLbl = new Label("Address");
//		TextField addressField = new TextField();
//		addressField.setPromptText("Store Address");
//		firstHbox.getChildren().addAll(nameLbl,nameField,addressLbl,addressField);
//		
//		
//		HBox secondHbox = new HBox(8);
//		Label cityLbl = new Label("City");
//		TextField cityField = new TextField();
//		cityField.setPromptText("Store City");
//		Image img = new Image(userPath);		
//		Circle store1Circle = new Circle();
//		store1Circle.setRadius(50);
//		store1Circle.setFill(new ImagePattern(img));
//		secondHbox.getStyleClass().add("photoToCenter");
//		secondHbox.setPadding(new Insets(5, 0, 0, 30));		
//		Label stateLbl = new Label("City");
//		TextField stateField = new TextField();
//		stateField.setPromptText("Store State");
//		
//		secondHbox.getChildren().addAll(cityLbl,cityField,store1Circle,stateLbl,stateField);
//		
//		
//		HBox thirdHbox = new HBox(20);
//		Label postalLbl = new Label("Name");
//		TextField postalField = new TextField();
//		postalField.setPromptText("Postal");
//		Label phonenumberLbl = new Label("PhoneNumber");
//		TextField phonenumberField = new TextField();
//		phonenumberField.setPromptText("Store Phone");
//		thirdHbox.getChildren().addAll(postalLbl,postalField,phonenumberLbl,phonenumberField);
//		
//		mainVbox.setAlignment(Pos.CENTER);
//		mainVbox.getChildren().addAll(firstHbox,secondHbox,thirdHbox);
//		return mainVbox;
		
		
		
		
		HBox mainHbox = new HBox(25);
		
		VBox leftVbox = new VBox(18);
		Label nameLbl = new Label("Name");
		TextField nameField = new TextField();
		nameField.setPromptText("Store Name");
		Label cityLbl = new Label("City");
		TextField cityField = new TextField();
		cityField.setPromptText("Store City");
		Label postalLbl = new Label("Postal");
		TextField postalField = new TextField();
		postalField.setPromptText("Postal");
		leftVbox.setAlignment(Pos.CENTER_LEFT);
		leftVbox.getChildren().addAll(nameLbl,nameField,cityLbl,cityField,postalLbl,postalField);
		
		VBox middleVbox = new VBox(60);
		Image img = new Image(userPath);		
		Circle store1Circle = new Circle();
		store1Circle.setRadius(50);
		store1Circle.setFill(new ImagePattern(img));
		Button signUpBtn = new Button("Sign Up");
		signUpBtn.setOnMouseEntered(e -> {
		signUpBtn.setCursor(Cursor.HAND);
		});
		signUpBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		signUpBtn.setPrefWidth(220);
		signUpBtn.setMaxWidth(220);
		middleVbox.getStyleClass().add("photoToCenter");
		middleVbox.setPadding(new Insets(145, 0, 0, 0));	
		middleVbox.setAlignment(Pos.CENTER);
		middleVbox.getChildren().addAll(store1Circle,signUpBtn);
		
		VBox rightVbox = new VBox(18);
		Label addressLbl = new Label("Address");
		TextField addressField = new TextField();
		addressField.setPromptText("Store Address");
		Label stateLbl = new Label("City");
		TextField stateField = new TextField();
    	stateField.setPromptText("Store State");
    	Label phonenumberLbl = new Label("PhoneNumber");
		TextField phonenumberField = new TextField();
		phonenumberField.setPromptText("Store Phone");
		rightVbox.setAlignment(Pos.CENTER_LEFT);
		rightVbox.getChildren().addAll(addressLbl,addressField ,stateLbl , stateField,phonenumberLbl,phonenumberField);
		
		
		
		mainHbox.setAlignment(Pos.CENTER);
		mainHbox.setStyle("-fx-border-color: black;\n" +
                "-fx-border-insets: 5;\n" +
                "-fx-border-width: 2;\n" +
                "-fx-border-style: solid;\n");
		mainHbox.getChildren().addAll(leftVbox,middleVbox,rightVbox);
		return mainHbox;
		
		
	}

}
