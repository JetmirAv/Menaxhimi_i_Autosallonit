package view;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
		nameField = new TextField();
		nameField.setPromptText("First Name");
		nameField.setPrefWidth(237);
		lastnameField = new TextField();
		lastnameField.setPromptText("Last Name");
		lastnameField.setPrefWidth(237);
		hbox.getChildren().addAll(nameField,lastnameField);
		hbox.setSpacing(20);
		hbox.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox);

		
		emailField = new TextField();
		emailField.setPromptText("Email");
		emailField.setPrefWidth(500);
		emailField.setMaxWidth(500);
		vbox.getChildren().add(emailField);

		
		passField = new TextField();
		passField.setPromptText("Password");
		passField.setPrefWidth(500);
		passField.setMaxWidth(500);
		vbox.getChildren().add(passField);
		

		Button signUpBtn = new Button("Sign Up");
		signUpBtn.setOnMouseEntered(e -> {
		signUpBtn.setCursor(Cursor.HAND);
		});
		signUpBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		signUpBtn.setPrefWidth(500);
		signUpBtn.setMaxWidth(500);
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
