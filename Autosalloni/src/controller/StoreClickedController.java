package controller;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import models.Store;
import models.Users;
import view.CarsInfo;
import view.CreateStore;
import view.Header;
import view.Main;
import view.UpdateStore;
import view.UserInfo;

public class StoreClickedController implements EventHandler<MouseEvent> {
	public void handle(MouseEvent  e) {
		

			HBox box = (HBox) e.getSource();

			
			UpdateStore.rightVbox.getChildren().clear();
			UpdateStore.middleVbox.getChildren().clear();
			UpdateStore.leftVbox.getChildren().clear();
			UpdateStore.mainHbox.getChildren().clear(); 
			Label lblCreateUser = new Label("/Edit Store");
			Header.lblLocation.getStyleClass().clear();
			Header.lblLocation.getStyleClass().add("lblHistory");
			lblCreateUser.getStyleClass().addAll("lblHistory", "active");
			Header.labelBox.getChildren().add(lblCreateUser);
			Main.history.add("Edit Store");
		
			try {
				Store.findByPk(Integer.parseInt(box.getId()));
				Main.nodeHistory.addAll(Main.content.getChildren());
				Main.content.getChildren().clear();
				UpdateStore.updateStoreBtn.setId(box.getId());
				UpdateStore.deleteStoreBtn.setId(box.getId());
				Main.content.getChildren().add(new UpdateStore());
				UpdateStore.leftVbox.getChildren().addAll(UpdateStore.deleteStoreBtn);
				UpdateStore.rightVbox.getChildren().add(UpdateStore.updateStoreBtn);
			} catch (NumberFormatException | SQLException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		
	}


}



