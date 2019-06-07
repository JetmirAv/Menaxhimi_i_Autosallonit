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

		String current = null;
		try {
			current = new java.io.File(".").getCanonicalPath();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		switch (e.getTarget().toString().split("'")[1].split("'")[0]) {
		case "_Dashboard":
			Main.mainWindow.setCenter(Dashboard.display());
			Main.history.clear();
			Main.history.add(Dashboard.display());
			break;
		case "_Cars":
			try {
				Main.mainWindow.setCenter(MainComponentCars.display());
				Main.history.clear();
				Main.history.add(Dashboard.display());

			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Stores":
			try {
				Main.mainWindow.setCenter(MainComponentStores.display());
				Main.history.clear();
				Main.history.add(Dashboard.display());
			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Users":
			try {
				Main.mainWindow.setCenter(MainComponent.display());
				Main.history.clear();
				Main.history.add(Dashboard.display());
			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Manufacturer":
			try {
				Main.mainWindow.setCenter(MainComponentStores.display());
				Main.history.clear();
				Main.history.add(Dashboard.display());
			} catch (IOException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "_Settings":
			try {
				Main.mainWindow.setCenter(CreateUser.display(current));
				Main.history.clear();
				Main.history.add(Dashboard.display());
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
