package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.Modal;


public class CarsInfoController implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		try {
			
			try {
				if(view.CarsInfo.insertCar()) {
					Modal.display(2, "Sukses", "Vetura u regjistrua me sukses ne databaz", "Ok", "");
				}else {
					Modal.display(2, "Sukses", "Vetura nuk u regjistrua ne databaz", "Ok", "");

				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
