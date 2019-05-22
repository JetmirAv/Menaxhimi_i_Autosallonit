package view;


import java.io.FileInputStream;
import java.io.IOException;

import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;



public class Header{

	public static HBox display(String fullName, String role, String current) throws IOException {

		FileInputStream logOutPath = new FileInputStream(current + "/src/img/power.png"); 	
		FileInputStream UserImgPath = new FileInputStream(current + "/src/img/user.png"); 	

		
		//The logOut image and styling 
		Image logOut = new Image(logOutPath);
		ImageView logOutView = new ImageView(logOut);
		logOutView.getStyleClass().add("logOut");
		logOutView.setFitHeight(30);
		logOutView.setPreserveRatio(true);
		Label labelLogOut = new Label();
		labelLogOut.getStyleClass().add("logout");
		labelLogOut.setGraphic(logOutView);
		labelLogOut.setTranslateY(-25);
		labelLogOut.setOnMouseEntered(e -> {
			labelLogOut.setCursor(Cursor.HAND);
		});
		
		
		//Users Image load and styling
		Image userImg = new Image(UserImgPath);
		Circle profileCir = new Circle(30);
		profileCir.setFill(new ImagePattern(userImg));
		
		
		
		//Box that will contain the users name and role
		VBox userBox = new VBox();
		userBox.setSpacing(5);
		userBox.setAlignment(Pos.CENTER);
//		userBox.setTranslateY(5);
		Label userFullName = new Label(fullName);
		Label userRole = new Label(role);
		userFullName.getStyleClass().add("userFullName");
		userRole.getStyleClass().add("userRole");
		userBox.getChildren().addAll(userFullName, userRole);
		
		
		//Box that will contain users full name, role and image
		HBox userHBox = new HBox();
		userHBox.setAlignment(Pos.CENTER);
		userHBox.setSpacing(10);
		userHBox.getStyleClass().add("userBox");
		userHBox.getChildren().addAll(profileCir, userBox);
		userHBox.setOnMouseEntered(e -> {
			userBox.setCursor(Cursor.HAND);
		});
		
		
		//Main Box that will be returned;
		HBox header = new HBox(); 
		header.setSpacing(30);
		header.setAlignment(Pos.BASELINE_RIGHT);
		header.getStylesheets().add(Header.class.getResource("header.css").toExternalForm());
		header.getStyleClass().add("header");
		header.getChildren().addAll(userHBox, labelLogOut);
		
		
		//Responsive
		userHBox.prefWidthProperty().bind(header.widthProperty().divide(7));
		userHBox.prefHeightProperty().bind(header.widthProperty());
		userBox.prefWidthProperty().bind(userHBox.widthProperty().divide(5).multiply(4));
		profileCir.radiusProperty().bind(userHBox.widthProperty().divide(6));
		userFullName.scaleXProperty().bind(userBox.widthProperty().divide(100));
		userRole.scaleXProperty().bind(userBox.widthProperty().divide(100));

		
		
		
		return header;
		
	}
}
