package view;


import java.io.FileInputStream;
import java.io.IOException;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;



public class Header{

	public static HBox display(String fullName, String role, String current) throws IOException {
		
		
		
		
		
		
		HBox header = new HBox(20);
		header.setAlignment(Pos.BASELINE_RIGHT);
		header.setStyle("-fx-border-color: black; -fx-height: 50px; -fx-padding: 10px 15px");
		
		FileInputStream logOutPath = new FileInputStream(current + "/src/img/power.png"); 
		Image logOut = new Image(logOutPath);
		ImageView logOutView = new ImageView(logOut);
		logOutView.setFitHeight(30);
		logOutView.setFitWidth(30);

		Label labelLogOut = new Label();
		labelLogOut.setGraphic(logOutView);
		
		VBox userBox = new VBox(10);
		
		Label userFullName = new Label(fullName);
		Label userRole = new Label(fullName);

		userFullName.setStyle("-fx-font-family: \"Sans-serif\"; -fx-font-size: 20px");
		userRole.setStyle("-fx-font-family: \"knk\"; -fx-font-size: 20px");
		userBox.getChildren().addAll(userFullName, userRole);
		
		
		
		
		
		header.getChildren().addAll(userBox, labelLogOut);
		
		return header;
		
	}
}
