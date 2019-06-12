package controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import helpers.Validations;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import models.Users;
import view.Dashboard;
import view.Main;
import view.Modal;
import view.UserInfo;

public class CreateUserController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {

		String str = "";
		
		
		if(!Validations.textFieldValidations(UserInfo.firstNameField.getText())) {
			str+= "FirstName not valid. ";
		}
		
		if(!Validations.isValidEmail(UserInfo.emailField.getText())) {
			str+="email not valid. ";
		}
		
		
		if(!Validations.textFieldValidations(UserInfo.lastNameField.getText())) {
			str+= "LastName not valid. ";
		}
		
		if(!Validations.textFieldValidations(UserInfo.addressField.getText())) {
			str+= "Address not valid. ";
		}
		
		if(!Validations.textFieldValidations(UserInfo.cityField.getText())) {
			str+= "City not valid. ";
		}
		
		
		if(!Validations.textFieldValidations(UserInfo.stateField.getText())) {
			str+= "State not valid. ";
		}
		
		
		if(!Validations.textFieldValidations(UserInfo.postalField.getText())) {
			str+= "Postal not valid. ";
		}
		
		if(!Validations.validateCode(UserInfo.codeField.getText())) {
			str+="code not valid. ";
		}
		
		if(str.length()!=0) {	
			Modal.display(2, "Error", str , "Ok", "");

			} else {
		
		String password = helpers.PasswordEncrypt.encrypt(UserInfo.passField.getText());

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
					UserInfo.emailField.getText(), password, sqlDate,
					UserInfo.gendre.getSelectionModel().getSelectedItem(), UserInfo.addressField.getText(),
					UserInfo.cityField.getText(), UserInfo.stateField.getText(), UserInfo.postalField.getText(),
					UserInfo.phoneNumber.getText(), "") > 0) {

				Modal.display(2, "Success", "User created sucessfully", "OK", "");
				Main.content.getChildren().clear();
				Main.content.getChildren().add(new Dashboard());

				UserInfo.firstNameField.clear();
				UserInfo.lastNameField.clear();
				UserInfo.emailField.clear();
				UserInfo.passField.clear();
				UserInfo.numberField.clear();
				UserInfo.phoneNumber.clear();
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
}
