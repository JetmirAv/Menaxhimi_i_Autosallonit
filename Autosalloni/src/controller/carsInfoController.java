package controller;

import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.Modal;


public class carsInfoController implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		try {
			if(view.CarsInfo.insertCar()) {
				Modal.display(2, "Sukses", "Vetura u regjistrua me sukses ne databaz", "Ok", "");
			};
			
			
			
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
