package controller;

import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import models.Users;
import view.Main;
import view.Modal;
import view.SignIn;

public class LoginHandlerController implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent e) {
		
		try {
			Main.token = Users.login(SignIn.emailField.getText(), SignIn.passwordField.getText());
			if(Main.token.length() > 0) {
				SignIn.modal.close();
				Main.scene = new Scene(Main.mainWindow, 1440, 800);
			} else {
				SignIn.passwordField.clear();
				Modal.display(2, "Error!", "Email or password incorrect", "Ok", "");
			}
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
