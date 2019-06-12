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
import models.Store;
import models.Users;
import view.Filter;
import view.Header;
import view.Main;
import view.MainComponent;
import view.MainComponentCars;
import view.MainComponentStores;
import view.Modal;
import view.UpdateStore;
import view.UserInfo;

public class UpdateStoreController implements EventHandler<ActionEvent>{
	
	@Override
	public void handle(ActionEvent e) {
		
		Node event =  (Node) e.getSource();
		
		System.out.println(event.getId() + "haha");
		
		
		
		String nameField = UpdateStore.nameField.getText();
		String addressField = UpdateStore.addressField.getText();
		String cityField = UpdateStore.cityField.getText();
		String stateField = UpdateStore.stateField.getText();
		String postalField = UpdateStore.postalField.getText();
		String phoneNumberField = UpdateStore.phonenumberField.getText();
		
		
		
		try {
			
				if (Store.update(Integer.parseInt(event.getId()),nameField, addressField,
						cityField,postalField,stateField,phoneNumberField)) {

					Modal.display(2, "Success", "User updated sucessfully", "OK", "");
					Main.content.getChildren().clear();
					MainComponentStores.count = 0;
					MainComponentStores.formatVbox.getChildren().clear();
					UpdateStore.mainHbox.getChildren().clear();
					UpdateStore.middleVbox.getChildren().clear();
					UpdateStore.rightVbox.getChildren().clear();
					UpdateStore.leftVbox.getChildren().clear();
					
					Header.labelBox.getChildren().remove(Header.labelBox.getChildren().size()-1);
					Main.content.getChildren().addAll(new Filter("Car"), new MainComponentStores());
					Main.nodeHistory.clear();

				} else {

					System.out.println("Mbrijtem4");
					Modal.display(2, "Error", "Users was not updated", "OK", "");
				}
			} catch (NumberFormatException | SQLException | IOException  e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		

		System.out.println("Mbrijtem6");
		
	}

}