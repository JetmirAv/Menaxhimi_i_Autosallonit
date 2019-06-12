package controller;

import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import view.Modal;

public class DeleteCarController implements EventHandler<ActionEvent>{
	
	@Override
	public void handle(ActionEvent e) {
		
		Node event =  (Node) e.getSource();
		try {
			models.Car.delete(Integer.parseInt(event.getId()));
			Modal.display(2, "Success", "Car deleted sucessfully", "OK", "");

		} catch (NumberFormatException | SQLException e1) {
			e1.printStackTrace();
			Modal.display(2, "Error", "Car was not deleted", "OK", "");

		}
	
	
	}
	}