package controller;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import models.Car;
import models.Users;

public class ShowMoreCarDetails implements EventHandler<ActionEvent>{
	
	@Override
	public void handle(ActionEvent e) {
		int k = 0;
		if (k == 0 ) {
			view.Cars.detailsOffset=view.Cars.detailsOffset+10;			
			k++;
		} else {
			view.Cars.detailsOffset=view.Cars.detailsOffset+5;			

		}
	System.out.println(view.Cars.detailsOffset);
	List<VBox> carInfo;
	try {
		carInfo = Car.merriTeDhenat(5, view.Cars.detailsOffset);
		System.out.println(carInfo);
		HBox box = new HBox(10);
		for (int i = 0; i < carInfo.size(); i++) {
			
			
			
			box.getChildren().addAll(carInfo.get(i));
			 
		}
		view.Cars.main.getChildren().add(box);

	} catch (SQLException | IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}


}

	
	}
	

