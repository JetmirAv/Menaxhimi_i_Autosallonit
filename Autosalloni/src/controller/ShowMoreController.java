package controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import models.Users;

public class ShowMoreController implements EventHandler<ActionEvent>{
	
	@Override
	public void handle(ActionEvent e) {
    view.MainComponent.offset=view.MainComponent.offset+10;
	System.out.println(view.MainComponent.offset);
	List<HBox> user;
	try {
		user = Users.getUsers();
		for (int i = 0; i < user.size(); i++) {
			view.MainComponent.vbox.getChildren().add(user.get(i));
		}

	} catch (SQLException | IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	}
	}

