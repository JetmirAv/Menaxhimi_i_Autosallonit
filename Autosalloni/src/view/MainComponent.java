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
		Label lblImage = I18N.getLabel("logo");
		Label lblName = I18N.getLabel("name");
		Label lblSurname = I18N.getLabel("lastNameU");
		Label lblEmail = I18N.getLabel("email");
		Label lblPhone = I18N.getLabel("phoneNr");
		Label lblCity = I18N.getLabel("city");
		Label lblState = I18N.getLabel("state"); 
		Label lblGender = I18N.getLabel("genderU");
		Label lblBirthday = I18N.getLabel("birthdayU");

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
			Button createUser = I18N.getButton("create");
			createUser.setOnAction(new controller.ShowCreateUserController());
			createUser.getStyleClass().add("updateBtn");
			createUser.getStyleClass().add("btnFormat");
			createUser.setTranslateX(550);

			vbox.getChildren().add(createUser);
			count++;
		}
		getChildren().add(vbox);

	}

	public void destroyObject(){
		getChildren().clear();
	}
}
