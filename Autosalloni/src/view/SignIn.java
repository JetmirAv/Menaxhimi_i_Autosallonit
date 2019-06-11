package view;

import java.io.FileInputStream;
import java.io.IOException;

import controller.LoginHandlerController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class SignIn extends HBox {

	public static PasswordField passwordField = new PasswordField();
	public static TextField emailField = new TextField();

	public SignIn() throws IOException {
		String current = new java.io.File(".").getCanonicalPath();
		FileInputStream autoPath = new FileInputStream(current + "/src/img/auto.png");
		FileInputStream bentleyPath = new FileInputStream(current + "/src/img/bentley.png");
//		FileInputStream eyePath = new FileInputStream(current + "/src/img/eye.png");

		HBox hbox = new HBox();
		Image autoImg = new Image(autoPath, 300, 600, false, false);
		ImageView autoView = new ImageView(autoImg);

		hbox.getChildren().addAll(autoView);

		VBox vbox = new VBox(25);
		vbox.setAlignment(Pos.CENTER_LEFT);
		vbox.setPadding(new Insets(0, 30, 0, 60));
		Image logoImg = new Image(bentleyPath, 200, 100, false, false);
		ImageView logoView = new ImageView(logoImg);
		vbox.getChildren().add(logoView);

		Text welcomeTxt = new Text("Welcome Back,");

		welcomeTxt.setStyle("-fx-font-weight:bold; -fx-font-family:'Titillium Web'; -fx-font-size:25");
		vbox.getChildren().add(welcomeTxt);

		Text entryTxt = new Text("Sign in to continue");
		entryTxt.setFill(Color.GREY);
		entryTxt.setFont(Font.font("Verdana", 16));
		vbox.getChildren().add(entryTxt);

		Label emailLbl = new Label("Email");
		emailField.setPromptText("email@email.email");
		emailField.setStyle("-fx-background-color: -fx-text-box-border "
				+ ", -fx-background; -fx-background-insets: 0, 0 0 1 0 ;" + "-fx-background-radius: 0 ;");
		vbox.getChildren().addAll(emailLbl);
		vbox.getChildren().addAll(emailField);

		Label passwordLbl = new Label("Password");
		vbox.getChildren().addAll(passwordLbl);

		passwordField.setPromptText("***********");
		passwordField.setId("passField");
		passwordField.setStyle("-fx-background-image:url('eyePath');");
		// passwordField.setStyle("-fx-background-image:url('logo.png');
		// -fx-background-repeat: no-repeat; -fx-background-position: right center;
		// -fx-font-size: 20");
		passwordField.setStyle("-fx-background-color: -fx-text-box-border , -fx-background;"
				+ " -fx-background-insets: 0, 0 0 1 0 ;-fx-background-radius: 0 ;");
		vbox.getChildren().addAll(passwordField);

		Button forgotPass = new Button(" Forgot password?");
		forgotPass.setOnMouseEntered(e -> {
			forgotPass.setCursor(Cursor.HAND);
		});
		forgotPass.getStyleClass().addAll("forgotPassBtn");
		vbox.getChildren().addAll(forgotPass);

		Button loginBtn = new Button("Login");
		loginBtn.setOnMouseEntered(e -> {
			loginBtn.setCursor(Cursor.HAND);
		});
		loginBtn.setOnAction(new LoginHandlerController());
		loginBtn.setStyle(
				" -fx-text-fill:white ; -fx-background-radius: 20, 1, 4, 10; -fx-pref-height: 38px; -fx-pref-width: 200px; -fx-background-color:#485D7A");
		vbox.getChildren().add(loginBtn);

		HBox signUpBox = new HBox();
		Text newUserTxt = new Text("New User? ");
		Button signUpBtn = new Button("Sign Up");
		signUpBtn.setOnMouseEntered(e -> {
			signUpBtn.setCursor(Cursor.HAND);
		});
		signUpBtn.getStyleClass().addAll("signUpBtn");
		signUpBox.getChildren().addAll(newUserTxt, signUpBtn);
		vbox.getChildren().add(signUpBox);

		hbox.getChildren().addAll(vbox);
		hbox.setAlignment(Pos.CENTER);
		hbox.getStylesheets().add(SignIn.class.getResource("signIn.css").toExternalForm());

		getChildren().add(hbox);
	}

}
