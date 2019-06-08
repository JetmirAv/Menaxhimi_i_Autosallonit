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

public class UpdateStore 
{
	
	public static HBox display() throws IOException
	{
		String current = new java.io.File(".").getCanonicalPath();
		
		//FileInputStream userPath = new FileInputStream(current + "/src/img/user.png");
		

		
		
		
		HBox mainHbox = new HBox(25);
		
		VBox leftVbox = new VBox(30);
		Label nameLbl = new Label("Name");
		TextField nameField = new TextField();
		nameField.setPromptText("Store Name");
		Label cityLbl = new Label("City");
		
		TextField cityField = new TextField();
		//cityLbl.setPadding(new Insets(50,0,0,0));
		cityField.setPromptText("Store City");
		cityField.setAlignment(Pos.CENTER_LEFT);
//		cityField.setStyle(" -fx-align:right; -fx-text-align: right; ");
//		Label postalLbl = new Label("Postal");
//		TextField postalField = new TextField();
//		postalField.setPromptText("Postal");
		leftVbox.setAlignment(Pos.CENTER_LEFT);
		leftVbox.getChildren().addAll(nameLbl,nameField,cityLbl,cityField);
		
		VBox middleVbox = new VBox(30);
//		Image img = new Image(userPath);		
//		Circle store1Circle = new Circle();
//		store1Circle.setRadius(50);
//		store1Circle.setFill(new ImagePattern(img));
		Label phonenumberLbl = new Label("PhoneNumber");
		TextField phonenumberField = new TextField();
		phonenumberField.setPromptText("Store Phone");
		Label postalLbl = new Label("Postal");
		TextField postalField = new TextField();
		postalField.setPromptText("Postal");
		Button updateStoreBtn = new Button("Update Store");
		updateStoreBtn.setOnMouseEntered(e -> {
		updateStoreBtn.setCursor(Cursor.HAND);
		});
		updateStoreBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		updateStoreBtn.setPrefWidth(220);
		updateStoreBtn.setMaxWidth(220);
		middleVbox.getStyleClass().add("photoToCenter");
		middleVbox.setPadding(new Insets(170, 0, 0, 0));	
		middleVbox.setAlignment(Pos.CENTER_LEFT);
		middleVbox.getChildren().addAll(phonenumberLbl,phonenumberField,postalLbl,postalField,updateStoreBtn);
		
		VBox rightVbox = new VBox(30);
		Label addressLbl = new Label("Address");
		TextField addressField = new TextField();
		addressField.setPromptText("Store Address");
		Label stateLbl = new Label("State");
		TextField stateField = new TextField();
    	stateField.setPromptText("Store State");
    	
		rightVbox.setAlignment(Pos.CENTER_LEFT);
		rightVbox.getChildren().addAll(addressLbl,addressField ,stateLbl , stateField);
		
		
		
		mainHbox.setAlignment(Pos.CENTER);
		mainHbox.setStyle("-fx-border-color: black;\n" +
                "-fx-border-insets: 5;\n" +
                "-fx-border-width: 2;\n" +
                "-fx-border-style: solid;\n");
		mainHbox.getChildren().addAll(leftVbox,middleVbox,rightVbox);
		return mainHbox;
		
		
	}

}
