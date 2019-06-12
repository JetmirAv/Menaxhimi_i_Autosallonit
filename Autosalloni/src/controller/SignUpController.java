package controller;

import view.Main;
import view.SignIn;
import view.SignUp;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class SignUpController implements EventHandler<ActionEvent> {

	public static int response = 0;

	@Override
	public void handle(ActionEvent e) {
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
					Main.token = models.Users.login(SignUp.emailField.getText(), password);
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
