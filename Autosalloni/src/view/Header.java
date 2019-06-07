package view;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class Header {

	public static HBox historyBox = new HBox();
	public static Label lblLocation = new Label("Dashboard");
	public static Button bttnBack = new Button("Back");
	public static HBox display(String fullName, String role) throws IOException {

		String current = new java.io.File(".").getCanonicalPath();

		FileInputStream logOutPath = new FileInputStream(current + "/src/img/power.png");
		FileInputStream UserImgPath = new FileInputStream(current + "/src/img/user.png");
		FileInputStream logoPath = new FileInputStream(current + "/src/img/logo.png");

		
		
		//Logo
		HBox logoBox = new HBox();
		Image logoImg = new Image(logoPath);
		logoBox.getChildren().add(new ImageView(logoImg));
		logoBox.setPrefWidth(200);
		logoBox.setPrefHeight(80);
		logoBox.setAlignment(Pos.CENTER_LEFT);
		logoBox.getStyleClass().add("logoImg");
		
		
		
		// The logOut image and styling
		Image logOut = new Image(logOutPath);
		ImageView logOutView = new ImageView(logOut);
		logOutView.getStyleClass().add("logOut");
		logOutView.setFitHeight(20);
		logOutView.setFitWidth(20);
		Label labelLogOut = new Label();
		labelLogOut.getStyleClass().add("logout");
		labelLogOut.setGraphic(logOutView);
		labelLogOut.setOnMouseEntered(e -> {
			labelLogOut.setCursor(Cursor.HAND);
		});

		// Users Image load and styling
		Image userImg = new Image(UserImgPath);
		Circle profilCir = new Circle(20);
		profilCir.setTranslateY(5);
		profilCir.setFill(new ImagePattern(userImg));

		// Box that will contain the users name and role
		VBox userBox = new VBox();
		userBox.setSpacing(5);
//		userBox.setTranslateY(5);
		Label userFullName = new Label(fullName);
		Label userRole = new Label(role);
		userFullName.getStyleClass().add("userFullName");
		userBox.getChildren().addAll(userFullName, userRole);
		userBox.setOnMouseEntered(e -> {
			userBox.setCursor(Cursor.HAND);
		});

		// Box that will contain users full name, role and image
		HBox userHBox = new HBox();
		userHBox.setSpacing(10);
		userHBox.getStyleClass().add("userBox");
		userHBox.getChildren().addAll(profilCir, userBox);

		//Box for user and Logout
		HBox profileBox = new HBox();
		profileBox.setSpacing(50);
		profileBox.setAlignment(Pos.CENTER_RIGHT);
		profileBox.getChildren().addAll(userHBox, labelLogOut);
		
		
		
		lblLocation.getStyleClass().addAll("lblHistory","active");
		historyBox.setSpacing(30);
		historyBox.setAlignment(Pos.CENTER_LEFT);
		historyBox.getChildren().addAll(bttnBack, lblLocation);
		historyBox.setPrefWidth(800); 
		historyBox.setMaxWidth(801);
		
		
		
		// Main Box that will be returned;
		HBox header = new HBox(100);
		header.getStylesheets().add(Header.class.getResource("header.css").toExternalForm());
		header.getStyleClass().add("header");
		header.getChildren().addAll(logoBox, historyBox, profileBox);
		header.setMaxHeight(20);

		return header;

	}
}
