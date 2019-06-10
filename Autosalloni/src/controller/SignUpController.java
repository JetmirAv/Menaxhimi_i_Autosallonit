package controller;

import view.SignUp;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import models.Bought;

public class SignUpController implements EventHandler<ActionEvent> {


	public static int response = 0;
	
	@Override
	public void handle(ActionEvent e) {
		try {
			int response = view.Modal.display( 1, "Title",
					"Are you sure you want to create this user. "
					+ "And some other dummy tekst for testing this method", 
					"Confirm", "cancel");
			if(response == 0) {
				DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date myDate = formatter.parse("1999-05-19");
				java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());			
				
				models.Users.create(
						SignUp.nameField.getText(), 
						SignUp.lastnameField.getText(), 
						SignUp.emailField.getText(), 
						SignUp.passField.getText(), 
						sqlDate, 
						"M", 
						SignUp.nameField.getText(), 
						SignUp.nameField.getText(), 
						SignUp.nameField.getText(),
						SignUp.nameField.getText(), 
						SignUp.nameField.getText());
			}			
			
		} catch (SQLException | ParseException e1) {
			e1.printStackTrace();
			
		}
		
	}
}
