package controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import models.Users;
import view.*;

public class SideBarController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {

		Header.lblLocation.getStyleClass().addAll("active", "lblHistory");
		switch (e.getTarget().toString().split("'")[1].split("'")[0]) {
		case "Dashboard":
			Main.content.getChildren().clear();
			Main.content.getChildren().add(new Dashboard());
			Header.labelBox.getChildren().clear();
			Header.lblLocation.setText("Dashboard");
			Header.labelBox.getChildren().addAll(Header.lblLocation);
			Main.history.clear();
			Main.history.add("_Dashboard");
			break;
		case "Cars":
			try {
				Main.content.getChildren().clear();
				if(Main.loggedRole == 1) {
					Main.content.getChildren().addAll(new Filter("Car"), new MainComponentCars());					
				} else {
					Main.content.getChildren().addAll(Cars.display());
				}
				Header.labelBox.getChildren().clear();
				Header.lblLocation.setText("Cars");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Cars");

			} catch (IOException | SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case "Stores":
			try {
				Main.content.getChildren().clear();
				Main.content.getChildren().addAll(new Filter(""), new MainComponentStores());
				Header.labelBox.getChildren().clear();
				Main.nodeHistory.clear();
				Header.lblLocation.setText("Stores");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Stores");
			} catch (IOException | SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case "Users":
			try {
				Main.content.getChildren().clear();
				Main.content.getChildren().addAll(new Filter(""), new MainComponent());
				System.out.println(Main.content.getChildren().toString());
				Header.labelBox.getChildren().clear();
				Header.lblLocation.setText("Users");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Users");
			} catch (IOException | SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case "Profile":
			
			Header.labelBox.getChildren().clear();
			Header.lblLocation.setText("Edit Profile");
			Header.labelBox.getChildren().addAll(Header.lblLocation);
			Main.history.clear();
			Main.history.add("_Edit Profile");
			Main.history.add("Edit User");
			try {
				Users.findByPk(Main.loggedId);
				Main.nodeHistory.addAll(Main.content.getChildren());
				Main.content.getChildren().clear();
				UserInfo.createUserHbox.getChildren().clear();
				UserInfo.updateBtn.setId(String.valueOf(Main.loggedId));
				UserInfo.deleteBtn.setId(String.valueOf(Main.loggedId));
				Main.content.getChildren().add(new UserInfo(false));
			} catch (NumberFormatException | SQLException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;

		case "Paneli":
			Main.content.getChildren().clear();
			Main.content.getChildren().add(new Dashboard());
			Header.labelBox.getChildren().clear();
			Header.lblLocation.setText("Dashboard");
			Header.labelBox.getChildren().addAll(Header.lblLocation);
			Main.history.clear();
			Main.history.add("_Dashboard");
			break;
		case "Veturat":
			try {
				Main.content.getChildren().clear();
				if(Main.loggedRole == 1) {
					Main.content.getChildren().addAll(new Filter("Car"), new MainComponentCars());					
				} else {
					Main.content.getChildren().addAll(Cars.display());
				}
				Header.labelBox.getChildren().clear();
				Header.lblLocation.setText("Cars");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Cars");

			} catch (IOException | SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case "Dyqanet":
			try {
				Main.content.getChildren().clear();
				Main.content.getChildren().addAll(new Filter(""), new MainComponentStores());
				Header.labelBox.getChildren().clear();
				Main.nodeHistory.clear();
				Header.lblLocation.setText("Stores");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Stores");
			} catch (IOException | SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case "Perdoruesit":
			try {
				Main.content.getChildren().clear();
				Main.content.getChildren().addAll(new Filter(""), new MainComponent());
				System.out.println(Main.content.getChildren().toString());
				Header.labelBox.getChildren().clear();
				Header.lblLocation.setText("Users");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Users");
			} catch (IOException | SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case "Profili":
			Header.labelBox.getChildren().clear();
			Header.lblLocation.setText("Edit Profile");
			Header.labelBox.getChildren().addAll(Header.lblLocation);
			Main.history.clear();
			Main.history.add("_Edit Profile");

			try {
				Users.findByPk(Main.loggedId);
				Main.nodeHistory.addAll(Main.content.getChildren());
				Main.content.getChildren().clear();
				UserInfo.createUserHbox.getChildren().clear();
				UserInfo.updateBtn.setId(String.valueOf(Main.loggedId));
				UserInfo.deleteBtn.setId(String.valueOf(Main.loggedId));
				Main.content.getChildren().add(new UserInfo(false));
			} catch (NumberFormatException | SQLException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			break;
		default:
			break;
		}
	}
}
