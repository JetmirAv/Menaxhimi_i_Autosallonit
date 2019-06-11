package controller;

import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.Modal;


public class CarsDetailsController implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		try {
			
			
			if(view.CarsDetails.storeComboBox.getSelectionModel().isEmpty()) {
				
				Modal.display(2, "Sukses", "Vetura nuk u regjistrua ne databaze", "Ok", "");
			
			}
			
			else if(models.Bought.insertBought()) {
				
				Modal.display(2, "Sukses", "Vetura u regjistrua me sukses ne databaz", "Ok", "");
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
