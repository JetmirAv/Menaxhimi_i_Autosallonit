package controller;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.*;

public class SideBarController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {
		System.out.println(e.getTarget().toString().split("'")[1].split("'")[0]);

		switch (e.getTarget().toString().split("'")[1].split("'")[0]) {
		case "_Dashboard":
			Main.mainWindow.setCenter(Dashboard.display());
			Header.historyBox.getChildren().clear();
			Header.lblLocation.setText("Dashboard");
			Header.historyBox.getChildren().addAll(Header.bttnBack,Header.lblLocation);
//			Main.history.clear();
//			Main.history.add(Dashboard.display());
			break;
		case "_Cars":
			try {
				Main.mainWindow.setCenter(MainComponentCars.display());
				Header.historyBox.getChildren().clear();
				Header.lblLocation.setText("Cars");
				Header.historyBox.getChildren().addAll(Header.bttnBack,Header.lblLocation);
//				Main.history.clear();
//				Main.history.add(MainComponentCars.display());

			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Stores":
			try {
				Main.mainWindow.setCenter(MainComponentStores.display());
				Header.historyBox.getChildren().clear();
				Header.lblLocation.setText("Stores");
				Header.historyBox.getChildren().addAll(Header.bttnBack,Header.lblLocation);
//				Main.history.clear();
//				Main.history.add(MainComponentStores.display());
			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Users":
			try {
				Main.mainWindow.setCenter(MainComponent.display());
				Header.historyBox.getChildren().clear();
				Header.lblLocation.setText("Users");
				Header.historyBox.getChildren().addAll(Header.bttnBack,Header.lblLocation);
//				Main.history.clear();
//				Main.history.add(MainComponent.display());
			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Manufacturer":
			try {
				Main.mainWindow.setCenter(MainComponentStores.display());
				Header.historyBox.getChildren().clear();
				Header.lblLocation.setText("Manufacturer");
				Header.historyBox.getChildren().addAll(Header.bttnBack,Header.lblLocation);
				
//				Main.history.clear();
//				Main.history.add(MainComponentStores.display());
			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Settings":
			try {
				Main.mainWindow.setCenter(CreateUser.display());
				Header.historyBox.getChildren().clear();
				Header.lblLocation.setText("Settings");
				Header.historyBox.getChildren().addAll(Header.bttnBack,Header.lblLocation);
//				Main.history.clear();
//				Main.history.add(CreateUser.display());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		default:
			break;
		}

	}
}
