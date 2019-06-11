package view;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import models.Users;

public class MainComponent extends VBox {

	public static VBox vbox = new VBox(5);
	public static int count = 0;

	public MainComponent() throws SQLException, IOException {

		HBox headerBox = new HBox();
		headerBox.setAlignment(Pos.CENTER);
		headerBox.setPrefHeight(20);
		Label lblImage = new Label("Image");
		Label lblName = new Label("First Name");
		Label lblSurname = new Label("Last Name");
		Label lblEmail = new Label("Email");
		Label lblPhone = new Label("Phone Number");
		Label lblCity = new Label("City");
		Label lblState = new Label("State");
		Label lblGender = new Label("Gender");
		Label lblBirthday = new Label("Birthday");

		lblImage.getStyleClass().add("userHeaderLabel");
		lblName.getStyleClass().add("userHeaderLabel");
		lblSurname.getStyleClass().add("userHeaderLabel");
		lblEmail.getStyleClass().add("userHeaderLabel");
		lblPhone.getStyleClass().add("userHeaderLabel");
		lblCity.getStyleClass().add("userHeaderLabel");
		lblState.getStyleClass().add("userHeaderLabel");
		lblGender.getStyleClass().add("userHeaderLabel");
		lblBirthday.getStyleClass().add("userHeaderLabel");

		lblImage.setPrefWidth(50);
		lblName.setPrefWidth(120);
		lblSurname.setPrefWidth(120);
		lblEmail.setPrefWidth(230);
		lblPhone.setPrefWidth(180);
		lblCity.setPrefWidth(120);
		lblState.setPrefWidth(120);
		lblGender.setPrefWidth(90);
		lblBirthday.setPrefWidth(140);

		headerBox.getChildren().addAll(lblImage, 
				lblName, lblSurname, 
				lblEmail, lblPhone, 
				lblGender, lblBirthday,
				lblCity, lblState);

		if(count == 0) {
			vbox.getChildren().add(headerBox);
			
			List<HBox> user = Users.getUsers();
			for (int i = 0; i < user.size(); i++) {
				vbox.getChildren().add(user.get(i));
			}
			Button createUser = new Button("Create User");
			createUser.setOnAction(new controller.ShowCreateUserController());
			
			vbox.getChildren().add(createUser);
			count++;
		}
		getChildren().add(vbox);

	}

	public void destroyObject(){
		getChildren().clear();
	}
}
