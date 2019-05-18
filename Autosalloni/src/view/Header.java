package view;


import java.io.File;
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



public class Header{

	public static HBox display(String fullName, String role, String current) throws IOException {

		FileInputStream logOutPath = new FileInputStream(current + "/src/img/power.png"); 	
		FileInputStream UserImgPath = new FileInputStream(current + "/src/img/profile.jpg"); 	
	
		//The logOut image and styling 
		Image logOut = new Image(logOutPath);
		ImageView logOutView = new ImageView(logOut);
		logOutView.setFitHeight(30);
		logOutView.setFitWidth(30);
		Label labelLogOut = new Label();
		labelLogOut.setGraphic(logOutView);
		labelLogOut.setOnMouseEntered(e -> {
			labelLogOut.setCursor(Cursor.HAND);
		});
		
		//Users Image load and styling
		Image userImg = new Image(UserImgPath);
		ImageView userImgView = new ImageView(userImg);
		userImgView.setFitHeight(50);
		userImgView.setFitWidth(50);
		userImgView.setTranslateY(5);
		Label labelUserImg = new Label();
		labelUserImg.setGraphic(userImgView);
		
		
		//Box that will contain the users name and role
		VBox userBox = new VBox(10);
		userBox.setTranslateY(7);
		Label userFullName = new Label(fullName);
		Label userRole = new Label(role);
		userBox.getChildren().addAll(userFullName, userRole);
		userBox.setOnMouseEntered(e -> {
			userBox.setCursor(Cursor.HAND);
		});
		
		
		//Box that will contain users full name, role and image
		HBox userHBox = new HBox(10);
		userHBox.getChildren().addAll(labelUserImg, userBox);

		//Main Box that will be returned;
		HBox header = new HBox(20); 
		header.setAlignment(Pos.BASELINE_RIGHT);
		header.getStylesheets().add(Header.class.getResource("header.css").toExternalForm());
		header.getStyleClass().add("header");
		header.getChildren().addAll(userHBox, labelLogOut);
		
		return header;
		
	}
}
