package controller;

import view.SignUp;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SignUpController implements EventHandler<ActionEvent> {


	public static int response = 0;
	
	@Override
	public void handle(ActionEvent e) {
		try {
			
			int response = view.Modal.display( 1, "Title", "Confirm", "cancel");
			
			
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
				
				System.out.println("Sukses");	
			} else {
				System.out.println(models.Users.count(false));
				System.out.println("Error");
			}
			
			
			
		} catch (SQLException | ParseException e1) {
			e1.printStackTrace();
			
		}
		
	}
}
