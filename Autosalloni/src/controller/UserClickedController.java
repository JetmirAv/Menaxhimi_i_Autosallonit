package controller;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import models.Users;
import view.Header;
import view.Main;
import view.UserInfo;


public class UserClickedController implements EventHandler<MouseEvent> {

	@Override
	public void handle(MouseEvent e) {
		
		
		HBox box = (HBox) e.getSource();

		
		Label lblCreateUser = new Label("/Edit User");
		Header.lblLocation.getStyleClass().clear();
		Header.lblLocation.getStyleClass().add("lblHistory");
		lblCreateUser.getStyleClass().addAll("lblHistory", "active");
		Header.labelBox.getChildren().add(lblCreateUser);
		Main.history.add("Edit User");
	
		try {
			Users.findByPk(Integer.parseInt(box.getId()));
			Main.nodeHistory.addAll(Main.content.getChildren());
			Main.content.getChildren().clear();
			UserInfo.createUserHbox.getChildren().clear(); 
			UserInfo.updateBtn.setId(box.getId());
			UserInfo.deleteBtn.setId(box.getId());
			Main.content.getChildren().add(new UserInfo(false));
		} catch (NumberFormatException | SQLException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
