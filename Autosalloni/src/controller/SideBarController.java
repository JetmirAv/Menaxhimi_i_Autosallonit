package controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import models.Users;
import view.*;

public class SideBarController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {

		Header.lblLocation.getStyleClass().addAll("active", "lblHistory");
		switch (e.getTarget().toString().split("'")[1].split("'")[0]) {
		case "_Dashboard":
			Main.content.getChildren().clear();
			Main.content.getChildren().add(new Dashboard());
//			Main.mainContent = null;
//			Main.mainContent = new Dashboard();
			Header.labelBox.getChildren().clear();
			Header.lblLocation.setText("Dashboard");
			Header.labelBox.getChildren().addAll(Header.lblLocation);
			Main.history.clear();
			Main.history.add("_Dashboard");
			break;
		case "_Cars":
			try {
				Main.content.getChildren().clear();
				Main.content.getChildren().addAll(new Filter("Car"), MainComponentCars.display());
				Header.labelBox.getChildren().clear();
				Header.lblLocation.setText("Cars");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Cars");

			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Stores":
			try {
				Main.content.getChildren().clear();
				Main.content.getChildren().addAll(new Filter(""), new MainComponentStores());
//				Main.mainContent = null;
//				Main.mainContent = new MainComponentStores();
				Header.labelBox.getChildren().clear();
				Header.lblLocation.setText("Stores");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Stores");
			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Users":
			try {
				Main.content.getChildren().clear();
				Main.content.getChildren().addAll(new Filter(""), new MainComponent());
				System.out.println(Main.content.getChildren().toString());
//				MainComponent.usersList.getChildren().clear();
				Header.labelBox.getChildren().clear();
				Header.lblLocation.setText("Users");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Users");
			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Manufacturer":
			try {
				Main.content.getChildren().clear();
				Main.content.getChildren().addAll(new Filter(""), new MainComponentStores());
				Header.labelBox.getChildren().clear();
				Header.lblLocation.setText("Manufacturer");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Manufacturer");
			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Settings":
			try {
				Main.content.getChildren().clear();
				UserInfo.createUserHbox.getChildren().clear();
				Users.findByPk(1);
				Main.content.getChildren().addAll(new UserInfo(false));
				Header.labelBox.getChildren().clear();
				Header.lblLocation.setText("Settings");
				Header.labelBox.getChildren().addAll(Header.lblLocation);
				Main.history.clear();
				Main.history.add("_Settings");
			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		default:
			break;
		}

	}
	public static void addToHistory(String s) {
		Main.history.add(s);
	}
}
