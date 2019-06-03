package view;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javafx.geometry.Insets;
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
import javafx.scene.text.Font;



public class Header{

	public static HBox display(String fullName, String role, String current) throws IOException {

		FileInputStream logOutPath = 
                        new FileInputStream(current + "/src/img/power.png"); 	
		FileInputStream UserImgPath 
                        = new FileInputStream(current + "/src/img/user.png"); 	

		
		//The logOut image and styling 
		Image logOut = new Image(logOutPath);
		ImageView logOutView = new ImageView(logOut);
		logOutView.getStyleClass().add("logOut");
		logOutView.setFitHeight(30);
		logOutView.setFitWidth(30);
		Label labelLogOut = new Label();
		labelLogOut.getStyleClass().add("logout");
		labelLogOut.setGraphic(logOutView);
		labelLogOut.setTranslateY(-25);
		labelLogOut.setOnMouseEntered(e -> {
			labelLogOut.setCursor(Cursor.HAND);
		});
		
		
		//Users Image load and styling
		Image userImg = new Image(UserImgPath);
		Circle profilCir = new Circle(30);
		profilCir.setFill(new ImagePattern(userImg));
		
		
		
		//Box that will contain the users name and role
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
		
		
		//Box that will contain users full name, role and image
		HBox userHBox = new HBox();
		userHBox.setSpacing(10);
		userHBox.getStyleClass().add("userBox");
		userHBox.getChildren().addAll(profilCir, userBox);

		//Main Box that will be returned;
		HBox header = new HBox(); 
		header.setSpacing(50);
		header.setAlignment(Pos.BASELINE_RIGHT);
		header.getStylesheets().add(Header.class.getResource("header.css").toExternalForm());
		header.getStyleClass().add("header");
		header.getChildren().addAll(userHBox, labelLogOut);
		
		return header;
		
	}
}
