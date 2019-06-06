package controller;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.Main;
import view.Dashboard;

public class SideBarController implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent e) {
		System.out.println(e.getTarget().toString().split("'")[1].split("'")[0]);
		
		switch (e.getTarget().toString().split("'")[1].split("'")[0]) {
		case "_Dashboard":
				Main.mainWindow.setCenter(Dashboard.display());			
			break;
		case "_Cars":
			Main.mainWindow.setCenter(Dashboard.display());			
			break;
		case "_Users":
			Main.mainWindow.setCenter(Dashboard.display());			
			break;
		case "_Manufacturer":
			Main.mainWindow.setCenter(Dashboard.display());			
			break;
		case "_Settings":
			Main.mainWindow.setCenter(Dashboard.display());			
			break;
		default:
			break;
		}
		
	}
}
