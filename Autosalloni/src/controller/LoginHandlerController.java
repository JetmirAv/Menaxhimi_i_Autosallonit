package controller;

import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import models.Users;
import view.Modal;
import view.SignIn;

public class LoginHandlerController implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent e) {
		
		try {
			String token = Users.login(SignIn.emailField.getText(), SignIn.passwordField.getText());
			if(token.length() > 0) {
				Modal.display(2, "Sucess!", "Bravo", "Ok", "");

			} else {
				Modal.display(2, "Error!", "Email or password incorrect", "Ok", "");
			}
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
