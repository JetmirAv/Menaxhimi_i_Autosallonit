package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Card
{
	
	public static VBox display(String current) throws IOException
	{
		VBox vbox = new VBox(10);
		
		HBox hbox1 = new HBox(15);
		TextField numberField = new TextField();
		numberField.setPromptText("Card Number");
		numberField.setPrefWidth(400);
		numberField.setStyle("-fx-border-radius: 10 10 10 10;\r\n" + 
				"-fx-background-radius: 10 10 10 10;  -fx-border-color:black;"
				+ "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");
		
	
//		
		hbox1.getChildren().addAll(numberField);

		
		
		HBox hbox2 = new HBox(20);
		hbox2.setPadding(new Insets(0,20,20,0));
		TextField expYearField = new TextField();
		expYearField.setPromptText("__/____");
		expYearField.setStyle("-fx-border-radius: 10 10 10 10;\r\n" + 
				"-fx-background-radius: 10 10 10 10; -fx-border-color:black;"
				+ " -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");
		TextField codeField = new TextField();
		codeField.setPromptText("Code");
		codeField.setStyle("-fx-border-radius: 10 10 10 10;\r\n" + 
				"-fx-background-radius: 10 10 10 10;  -fx-border-color:black;"
				+ " -fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.8), 10, 0, 0, 0);");
		
		hbox2.getChildren().addAll(codeField,expYearField);

		vbox.setAlignment(Pos.CENTER);
		vbox.getChildren().addAll(hbox1,hbox2);
		
		
		
		return vbox;
	
	}
	
	
}