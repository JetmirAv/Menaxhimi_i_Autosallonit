package controller;

import view.Main;
import view.Modal;
import view.SignIn;
import view.SignUp;
import view.UserInfo;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import helpers.Validations;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class SignUpController implements EventHandler<ActionEvent> {

	public static int response = 0;

	@Override
	public void handle(ActionEvent e) {
		
		
		
String str = "";
		
		
		if(!Validations.textFieldValidations(SignUp.nameField.getText())) {
			str+= "Name not valid. ";
		}
		
		if(!Validations.isValidEmail(SignUp.emailField.getText())) {
			str+="email not valid. ";
		}
		
		
		if(!Validations.textFieldValidations(SignUp.lastnameField.getText())) {
			str+= "LastName not valid. ";
		}
		
		if(!Validations.textFieldValidations(SignUp.addressField.getText())) {
			str+= "Address not valid. ";
		}
		
		if(!Validations.textFieldValidations(SignUp.cityField.getText())) {
			str+= "City not valid. ";
		}
		
		
		if(!Validations.textFieldValidations(SignUp.stateField.getText())) {
			str+= "State not valid. ";
		}
		
		
		if(!Validations.textFieldValidations(SignUp.postalField.getText())) {
			str+= "Postal not valid. ";
		}
		
		if(!Validations.validateCode(SignUp.cardCodeField.getText())) {
			str+="code not valid. ";
		}

		
		if(str.length()!=0) {	
			Modal.display(2, "Error", str , "Ok", "");

			} else {
		
		
		
		
		
		
		
		try {

			String password = helpers.PasswordEncrypt.encrypt(SignUp.passField.getText());

			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date myDate = formatter.parse(SignUp.birthdayField.getText());
			java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

			int userId = models.Users.create(SignUp.nameField.getText(), SignUp.lastnameField.getText(),
					SignUp.emailField.getText(), password, sqlDate, SignUp.gendre.getValue(),
					SignUp.addressField.getText(), SignUp.cityField.getText(), SignUp.stateField.getText(),
					SignUp.postalField.getText(), SignUp.phoneField.getText(), SignUp.imgField.getText());

			if (userId > 0) {
				boolean result = models.Card.insertCard(userId, SignUp.cardField.getText(),
						Integer.valueOf(SignUp.expYearField.getText()), Integer.valueOf(SignUp.expYearField.getText()),
						Integer.valueOf(SignUp.cardCodeField.getText()));
				if (result) {
					
					SignUp.modal.close();
					SignIn.modal.close();
					Main.scene = new Scene(Main.mainWindow, 1440, 800);

				}
			}

		} catch (SQLException | ParseException e1) {
			e1.printStackTrace();

		}

	}
}
}
