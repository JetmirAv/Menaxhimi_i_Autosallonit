package controller;

import view.SignUp;

import java.sql.Date;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SignUpController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {
		try {
			models.Users.create(
					SignUp.nameField.getText(), 
					SignUp.lastnameField.getText(), 
					SignUp.emailField.getText(), 
					SignUp.passField.getText(), 
					new Date(2019, 05, 19), 
					"M", 
					SignUp.nameField.getText(), 
					SignUp.nameField.getText(), 
					SignUp.nameField.getText(),
					SignUp.nameField.getText(), 
					SignUp.nameField.getText());
			
			System.out.println("Sukses");
		} catch (SQLException e1) {
			e1.printStackTrace();
			
		}
		
	}
}
