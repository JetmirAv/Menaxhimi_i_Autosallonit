package models;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import view.Filter;
import view.Header;
import view.Main;
import view.MainComponent;
import view.Modal;
import view.UserInfo;

public class DeleteUserController implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent e) {
		
		
		int response = Modal.display(1, "Attention", "Are you sure you want to delete user " + 
				UserInfo.firstNameField.getText() + " " + UserInfo.lastNameField.getText(), "Confirm", "Cancel");
		if(response != -1) {
			Node event =  (Node) e.getSource();
			System.out.println(event.getId());
			
			try {
				Users.delete(Integer.parseInt(event.getId()));
				Modal.display(2, "Success", "User was deleted successfuly", "Ok", "");
				Main.content.getChildren().clear();
				MainComponent.vbox.getChildren().clear();
				MainComponent.count = 0;
				Header.labelBox.getChildren().remove(Header.labelBox.getChildren().size()-1);
				Main.content.getChildren().addAll(new Filter(""), new MainComponent());
				Main.nodeHistory.clear();
			} catch (NumberFormatException | SQLException | IOException e1) {
				Modal.display(2, "Error", "User could not be deleted", "Ok", "");
				
			}			
		}
		
	}
	
}
