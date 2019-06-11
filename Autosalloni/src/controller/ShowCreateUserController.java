package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import view.Header;
import view.Main;
import view.UserInfo;

public class ShowCreateUserController implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent e) {
		try {
			UserInfo.firstNameField.setText("");
			UserInfo.lastNameField.setText("");
			UserInfo.emailField.setText("");
			UserInfo.birthdayField.setText("");
			UserInfo.gendre.setValue("");
			UserInfo.addressField.setText("");
			UserInfo.cityField.setText("");
			UserInfo.stateField.setText("");
			UserInfo.postalField.setText("");
			UserInfo.numberField.setText("");
			UserInfo.createUserHbox.setId("");
			Main.content.getChildren().clear();
			Main.content.getChildren().add(new UserInfo(true));
			Label lblCreateUser = new Label("/Create User");
			Header.lblLocation.getStyleClass().clear();
			Header.lblLocation.getStyleClass().add("lblHistory");
			lblCreateUser.getStyleClass().addAll("lblHistory", "active");
			Header.labelBox.getChildren().add(lblCreateUser);
			Main.history.add("CreateUser");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
