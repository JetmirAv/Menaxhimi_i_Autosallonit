package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import helpers.Validations;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.CarsInfo;
import view.Modal;

public class CarsInfoController implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent e) {
		try {
			try {
				if (Validations.validateBodyNumber(CarsInfo.txtForModel.getText())) {

				if (Validations.validateBodyNumber(CarsInfo.txtForbodyNumber.getText())) {
					if (Validations.validateBodyNumber(CarsInfo.engineModel.getText())) {

					if (view.CarsInfo.insertCar()) {
						Modal.display(2, "Sukses", "Vetura u regjistrua me sukses ne databaz", "Ok", "");
					} else {
						Modal.display(2, "Sukses", "Vetura nuk u regjistrua ne databaz", "Ok", "");

					}
					} else {
						Modal.display(2, "Error!", "Only numbers and uppercase letters are allowed on field Engine Models", "Ok", "");

					}

					} else {
					Modal.display(2, "Error!", "Only numbers and uppercase letters are allowed on Field Body Number", "Ok", "");

				}
				} else {
					Modal.display(2, "Error!", "Only numbers ,uppercase  and lowercase letters are allowed on field Model", "Ok", "");

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
