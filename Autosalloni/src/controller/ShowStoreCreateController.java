package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import view.CarsInfo;
import view.CreateStore;
import view.Header;
import view.Main;

public class ShowStoreCreateController implements EventHandler<ActionEvent>{
	@Override
	
	
	public void handle(ActionEvent e) {

		
		
		Main.content.getChildren().clear();
		try {
			Main.content.getChildren().add(new CreateStore());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Label lblCreateUser = new Label("/Create Store");
		Header.lblLocation.getStyleClass().clear();
		Header.lblLocation.getStyleClass().add("lblHistory");
		lblCreateUser.getStyleClass().addAll("lblHistory", "active");
		Header.labelBox.getChildren().add(lblCreateUser);
	}
}
