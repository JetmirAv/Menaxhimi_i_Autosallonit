package controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.HBox;
import models.Car;

public class ShowMoreCarsController implements EventHandler<ActionEvent>{
	
	@Override
	public void handle(ActionEvent e) {
    view.MainComponentCars.carOffset = view.MainComponentCars.carOffset + 12;
	List<HBox> car;
	try {
		car = Car.getCars();
		for (int i = 0; i < car.size(); i++) {
			view.MainComponentCars.vbox.getChildren().add(car.get(i));
		}
	} catch (SQLException | IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
	
	}
	
	


