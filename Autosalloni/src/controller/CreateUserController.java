package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import models.Users;
import view.Dashboard;
import view.Main;
import view.MainComponent;
import view.Modal;
import view.UserInfo;

public class CreateUserController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {

		

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = null;
		try {
			myDate = formatter.parse(UserInfo.birthdayField.getText());
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

		try {
			if (Users.create(UserInfo.firstNameField.getText(), UserInfo.lastNameField.getText(),
					UserInfo.emailField.getText(), UserInfo.passField.getText(), sqlDate,
					UserInfo.gendre.getSelectionModel().getSelectedItem(), UserInfo.addressField.getText(),
					UserInfo.cityField.getText(), UserInfo.stateField.getText(), UserInfo.postalField.getText(),
					UserInfo.numberField.getText())) {

				Modal.display(2, "Success", "User created sucessgfully", "OK", "");
				Main.content.getChildren().clear();
				Main.content.getChildren().add(new Dashboard());

				UserInfo.firstNameField.clear();
				UserInfo.lastNameField.clear();
				UserInfo.emailField.clear();
				UserInfo.passField.clear();
				UserInfo.numberField.clear();
				UserInfo.birthdayField.clear();
				UserInfo.cityField.clear();
				UserInfo.stateField.clear();
				UserInfo.addressField.clear();
				UserInfo.postalField.clear();
				UserInfo.cardField.clear();
				UserInfo.expireField.clear();
				UserInfo.codeField.clear();
			} else {
				Modal.display(2, "Error", "Users was not created", "OK", "");
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
