package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CreateUser 
{
	public static HBox display(String current) throws IOException
	{
		
		FileInputStream autoPath = new FileInputStream(current + "/src/img/auto.png");
		
//		Text signUpTxt = new Text("Sign Up");
//		signUpTxt.setFont(new Font("Times New Roman",30));
//		signUpTxt.setFill(Color.BLACK);

		HBox mainHbox = new HBox(200);
		mainHbox.setPadding(new Insets(40,40,40,40));
//		mainHbox.getChildren().add(signUpTxt);
//		firstVbox.setAlignment(Pos.CENTER);

		VBox leftVbox = new VBox(8);
		
		Label firstNameLbl = new Label("First Name");
		TextField firstNameField = new TextField();
		firstNameField.setPromptText("Test");
		
		Label lastNameLbl = new Label("Last Name");
		TextField lastNameField = new TextField();
		lastNameField.setPromptText("Test");
		
	
		
		Label emailLbl = new Label("Email");
		TextField emailField = new TextField();
		emailField.setPromptText("Test");
		
		Label passLbl = new Label("Password");
		TextField passField = new TextField();
		passField.setPromptText("********");
		

		HBox bottomHbox = new HBox(5);
		VBox vbox1 = new VBox(3);
		Label birthdayLbl = new Label("Birthday");
		TextField birthdayField = new TextField();
		vbox1.getChildren().addAll(birthdayLbl,birthdayField);
		VBox vbox2 = new VBox();
		Label gendreLbl = new Label("Label");
		ChoiceBox<String> gendre = new ChoiceBox<>();
		gendre.getItems().add("M");
		gendre.getItems().add("F");
		gendre.setPrefWidth(30);
		gendre.setValue("M");
		vbox2.getChildren().addAll(gendreLbl,gendre);
		vbox2.setPadding(new Insets(2,0,0,0));
		bottomHbox.getChildren().addAll(vbox1,vbox2);
		
		
		Label numberLbl = new Label("Phone Number");
		TextField numberField = new TextField();
		numberField.setPromptText("123456789");
		
		
		leftVbox.getChildren().addAll(firstNameLbl,firstNameField,lastNameLbl,lastNameField,
									  emailLbl,emailField,passLbl,passField,bottomHbox,numberLbl,numberField);
		
		
		VBox rightVbox = new VBox(8);
		
		HBox topHbox = new HBox(5);
		VBox vbox3 = new VBox(3);
		Label cityLbl = new Label("City");
		TextField cityField = new TextField();
		vbox3.getChildren().addAll(cityLbl,cityField);
		VBox vbox4 = new VBox();
		Label stateLbl = new Label("State");
		TextField stateField = new TextField();
		
		vbox4.getChildren().addAll(stateLbl,stateField);
		topHbox.getChildren().addAll(vbox3,vbox4);

		
		
		Label addresslLbl = new Label("Postal");
		TextField addressField = new TextField();
		addressField.setPromptText("Address");
		
		Label postalLbl = new Label("Postal");
		TextField postalField = new TextField();
		postalField.setPromptText("Test");
		
		
		Label cardLbl = new Label("Card Number");
		TextField cardField = new TextField();
		cardField.setPromptText("123456678");
		
		Label expireLbl = new Label("Expired Date");
		TextField expireField = new TextField();
		expireField.setPromptText("__ / ____");
		
		Label codeLbl = new Label("Code");
		TextField codeField = new TextField();
		codeField.setPromptText("1234");
		
		Button signInBtn = new Button("Sign In");
		signInBtn.setOnMouseEntered(e -> {
		signInBtn.setCursor(Cursor.HAND);
		});
		
		
		
		signInBtn.setStyle("    -fx-background-color: transparent;\r\n" + 
				"    -fx-border: none;\r\n" + 
				"	-fx-padding:0 5px 5px 10px;\r\n" +  
				"	-fx-text-fill:#5DA4C7;");
		
		rightVbox.getChildren().addAll(topHbox,addresslLbl,addressField,postalLbl,postalField,cardLbl,cardField,expireLbl,expireField,
				codeLbl, codeField,signInBtn);
		
		
		
		mainHbox.getChildren().addAll(leftVbox,rightVbox);
		return mainHbox;
	}

}


//HBox hbox1 = new HBox();
//Label firstnameLbl = new Label("First Name");
//TextField nameField = new TextField();
//nameField.setPromptText("John");
//hbox1.getChildren().addAll(nameField);
//firstVbox.getChildren().addAll(firstnameLbl,hbox1);
//
//HBox hbox2 = new HBox();
//Label lastnameLbl = new Label("Last Name");
//TextField lastnameField = new TextField();
//lastnameField.setPromptText("Doe");
//hbox2.getChildren().addAll(lastnameField);
//firstVbox.getChildren().addAll(lastnameLbl,hbox2);
//
//HBox hbox3 = new HBox();
//Label emailLbl = new Label("Email");
//TextField emailField = new TextField();
//emailField.setPromptText("example@example.example");
//hbox3.getChildren().addAll(emailField);
//firstVbox.getChildren().addAll(emailLbl,hbox3);
//
//HBox hbox4 = new HBox();
//Label passLbl = new Label("Last Name");
//TextField passField = new TextField();
//passField.setPromptText("********00");
//hbox4.getChildren().addAll(passField);
//firstVbox.getChildren().addAll(passLbl,hbox4);





