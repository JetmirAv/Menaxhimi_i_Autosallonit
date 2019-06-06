package view;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class SignUp {
	
	public static TextField nameField;
	public static TextField lastnameField;
	public static TextField emailField;
	public static TextField passField;
	
	
	public static VBox display(String current) throws IOException
	{
		FileInputStream autoPath = new FileInputStream(current + "/src/img/auto.png");
		
		Text signUpTxt = new Text("Sign Up");
		signUpTxt.setFont(new Font("Times New Roman",30));
		signUpTxt.setFill(Color.WHITE);

		VBox vbox = new VBox(15);
		vbox.setPadding(new Insets(40,40,40,40));
		vbox.getChildren().add(signUpTxt);
		vbox.setAlignment(Pos.CENTER);

		HBox hbox = new HBox();
		TextField nameField = new TextField();
		nameField.setPromptText("First Name");
		nameField.setPrefWidth(250);
		TextField lastnameField = new TextField();
		lastnameField.setPromptText("Last Name");
		lastnameField.setPrefWidth(250);
		
		hbox.getChildren().addAll(nameField,lastnameField);
		hbox.setSpacing(20);
		hbox.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox);
		
		
		
		//VBox vbox2 = new VBox();
		HBox hbox2 = new HBox();
		TextField birthdayField = new TextField();
		birthdayField.setPromptText("Birthday");
		birthdayField.setPrefWidth(220);
		ChoiceBox<String> gendre = new ChoiceBox<>();
		gendre.getItems().add("M");
		gendre.getItems().add("F");
		gendre.setPrefWidth(30);
		gendre.setValue("M");
		//emailField.setMaxWidth(500);
		TextField phoneField = new TextField();
		phoneField.setPromptText("Phone Number");
		phoneField.setPrefWidth(220);
		//phoneField.setMaxWidth(500);
		hbox2.getChildren().addAll(birthdayField,gendre,phoneField);
		hbox2.setSpacing(15);
		hbox2.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox2);

		HBox hbox3 = new HBox();
		TextField emailField = new TextField();
		emailField.setPromptText("Email");
		emailField.setPrefWidth(250);
		//emailField.setMaxWidth(500);
		TextField passField = new TextField();
		passField.setPromptText("Password");
		passField.setPrefWidth(250);
		//passField.setMaxWidth(500);
		hbox3.getChildren().addAll(emailField,passField);
		hbox3.setSpacing(20);
		hbox3.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox3);
		
		HBox hbox4 = new HBox();
		TextField addressField = new TextField();
		addressField.setPromptText("Address");
		addressField.setPrefWidth(160);
		//emailField.setMaxWidth(500);
		TextField cityField = new TextField();
		cityField.setPromptText("City");
		cityField.setPrefWidth(160);
		TextField stateField = new TextField();
		stateField.setPromptText("State");
		stateField.setPrefWidth(160);
		hbox4.getChildren().addAll(addressField,cityField,stateField);
		hbox4.setSpacing(20);
		hbox4.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox4);

		
		
		HBox hbox5 = new HBox();
		TextField postalField = new TextField();
		postalField.setPromptText("Postal Number");
		postalField.setPrefWidth(250);
		//emailField.setMaxWidth(500);
		TextField cardField = new TextField();
		cardField.setPromptText("Card Number");
		cardField.setPrefWidth(250);
		hbox5.getChildren().addAll(postalField,cardField);
		hbox5.setSpacing(20);
		hbox5.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox5);
		
		
		
		HBox hbox6 = new HBox();
		TextField expMonthField = new TextField();
		expMonthField.setPromptText("expMonth");
		expMonthField.setPrefWidth(249);
		//emailField.setMaxWidth(500);
		TextField expYearField = new TextField();
		expYearField.setPromptText("expYear");
		expYearField.setPrefWidth(249);
		hbox6.getChildren().addAll(expMonthField,expYearField);
		hbox6.setSpacing(20);
		hbox6.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox6);
		

		Button signUpBtn = new Button("Sign Up");
		signUpBtn.setOnMouseEntered(e -> {
		signUpBtn.setCursor(Cursor.HAND);
		});
		signUpBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		signUpBtn.setPrefWidth(520);
		signUpBtn.setMaxWidth(520);
		vbox.getChildren().add(signUpBtn);

		Text memberTxt = new Text("Already a member?");
		vbox.getChildren().add(memberTxt);
		memberTxt.setFill(Color.WHITE);


		Button signInBtn = new Button("Sign In");
		signInBtn.setOnMouseEntered(e -> {
		signInBtn.setCursor(Cursor.HAND);
		});
		
		signUpBtn.setOnAction(new controller.SignUpController());
		
		signInBtn.setStyle("    -fx-background-color: transparent;\r\n" + 
				"    -fx-border: none;\r\n" + 
				"	-fx-padding:0 5px 5px 10px;\r\n" +  
				"	-fx-text-fill:#5DA4C7;");
		vbox.getChildren().add(signInBtn);
		
		vbox.setStyle(" -fx-background-image: url(autoPath);\r\n" + 
				"    -fx-background-repeat: stretch;   \r\n" + 
				"    -fx-background-size: 900 506;\r\n" + 
				"    -fx-background-position: center center;\r\n" + 
				"    -fx-effect: dropshadow(three-pass-box, black, 30, 0.5, 0, 0); \r\n" + 
				"");
		return vbox;
	}

}
