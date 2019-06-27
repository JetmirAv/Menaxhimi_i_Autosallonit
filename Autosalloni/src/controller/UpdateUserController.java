package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;

import models.Users;
import view.Filter;
import view.Header;
import view.Main;
import view.MainComponent;
import view.Modal;
import view.UserInfo;

public class UpdateUserController implements EventHandler<ActionEvent>{
	
	@Override
	public void handle(ActionEvent e) {
		
		Node event =  (Node) e.getSource();
		System.out.println(event.getId());
		System.out.println("Mbrijtem");
		
		String password = helpers.PasswordEncrypt.decrypt(UserInfo.passField.getText());

		
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = null;
		try {
			myDate = formatter.parse(UserInfo.birthdayField.getText());
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

		System.out.println("Mbrijtem2");
			try {
				if (Users.update(Integer.parseInt(event.getId()), UserInfo.firstNameField.getText(), UserInfo.lastNameField.getText(),
						UserInfo.emailField.getText(), password, sqlDate,
						UserInfo.gendre.getSelectionModel().getSelectedItem(), UserInfo.addressField.getText(),
						UserInfo.cityField.getText(), UserInfo.stateField.getText(), UserInfo.postalField.getText(),
						UserInfo.numberField.getText())) {


					System.out.println("Mbrijtem3");
					Modal.display(2, "Success", "User updated sucessfully", "OK", "");
					if(Main.loggedRole == 1) {
						Main.content.getChildren().clear();
						MainComponent.vbox.getChildren().clear();
						MainComponent.vboxWithScroll.getChildren().clear();
						MainComponent.offset = 0;
						MainComponent.count = 0;
						Header.labelBox.getChildren().remove(Header.labelBox.getChildren().size()-1);
						Main.content.getChildren().addAll(new MainComponent());						
					}
					Main.nodeHistory.clear();

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

					System.out.println("Mbrijtem4");
					Modal.display(2, "Error", "Users was not updated", "OK", "");
				}
			} catch (NumberFormatException | SQLException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		

		System.out.println("Mbrijtem6");
		
	}

}
