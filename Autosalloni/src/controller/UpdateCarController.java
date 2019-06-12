package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import helpers.helpers;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import models.Car;
import models.FuelType;
import models.Manufacturer;
import models.Users;
import view.Filter;
import view.Header;
import view.Main;
import view.MainComponent;
import view.Modal;
import view.UserInfo;
import view.*;

public class UpdateCarController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {

		Node event = (Node) e.getSource();

		System.out.println("Test");
		System.out.println(UpdateCars.manufacturerComboBox.getSelectionModel().getSelectedItem());
		System.out.println("Test");

		Manufacturer manufacturer = (Manufacturer) view.UpdateCars.manufacturerComboBox.getSelectionModel()
				.getSelectedItem();
		FuelType fuelType = (FuelType) view.UpdateCars.fuelTypeIdComboBox.getSelectionModel().getSelectedItem();

		try {
			try {
				System.out.println("ktu ja nis");
				Integer.parseInt(UpdateCars.txtForPrice.getText());
				System.out.println("E konvertoj");
				System.out.println(Integer.parseInt(UpdateCars.txtForPrice.getText()));
				System.out.println("qe edhe id");
				System.out.println(Integer.parseInt(event.getId()));
				boolean res1 =models.Car.update(manufacturer.getId(), UpdateCars.txtForModel.getText(),
						UpdateCars.txtForbodyNumber.getText(),
						Integer.parseInt(UpdateCars.yearOfProdComboBox.getValue().toString()),
						Integer.parseInt(UpdateCars.seatsComboBox.getValue().toString()),
						Integer.parseInt(UpdateCars.doorsComboBox.getValue().toString()),
						helpers.convertToBoolean(UpdateCars.roofComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.alarmComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.centralComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.airbagComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.autonomusComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.navigatorComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.climateComboBox.getValue()), fuelType.getId(),
						Integer.parseInt(UpdateCars.fuelCapacity.getValue().toString()),
						Double.valueOf(String.valueOf(UpdateCars.fuelConsumption.getValue())),
						helpers.convertToBoolean(UpdateCars.hidraulicComboBox.getValue()),
						UpdateCars.engineModel.getText(),
						Double.valueOf(String.valueOf(UpdateCars.enginePower.getValue())),
						Integer.parseInt(UpdateCars.hoursePowerCapacity.getValue().toString()),
						Integer.parseInt(UpdateCars.maxspeed.getValue().toString()),
						Double.valueOf(String.valueOf(UpdateCars.seconds0to100.getValue())),
						helpers.convertToBoolean(UpdateCars.isAutomaticComboBox.getValue()),
						Integer.parseInt(UpdateCars.gears.getValue().toString()),
						String.valueOf(UpdateCars.tireModelComboBox.getValue()),
						Integer.parseInt(UpdateCars.tireSize.getValue().toString()),
						UpdateCars.additionalDesc.getText(),
						helpers.convertToBoolean(UpdateCars.is4x4ComboBox.getValue()), Integer.parseInt(event.getId()));
				boolean res2 = models.Car.updateCarByPrice(Integer.parseInt(UpdateCars.txtForPrice.getText()),
						Integer.parseInt(event.getId()));
				
				if (!res1 || !res2) {
					Modal.display(2, "Error", "Users was not updated", "OK", "");
					return;

				}
			} catch (NumberFormatException eqw) {

				boolean res3 = models.Car.update(manufacturer.getId(), UpdateCars.txtForModel.getText(),
						UpdateCars.txtForbodyNumber.getText(),
						Integer.parseInt(UpdateCars.yearOfProdComboBox.getValue().toString()),
						Integer.parseInt(UpdateCars.seatsComboBox.getValue().toString()),
						Integer.parseInt(UpdateCars.doorsComboBox.getValue().toString()),
						helpers.convertToBoolean(UpdateCars.roofComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.alarmComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.centralComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.airbagComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.autonomusComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.navigatorComboBox.getValue()),
						helpers.convertToBoolean(UpdateCars.climateComboBox.getValue()), fuelType.getId(),
						Integer.parseInt(UpdateCars.fuelCapacity.getValue().toString()),
						Double.valueOf(String.valueOf(UpdateCars.fuelConsumption.getValue())),
						helpers.convertToBoolean(UpdateCars.hidraulicComboBox.getValue()),
						UpdateCars.engineModel.getText(),
						Double.valueOf(String.valueOf(UpdateCars.enginePower.getValue())),
						Integer.parseInt(UpdateCars.hoursePowerCapacity.getValue().toString()),
						Integer.parseInt(UpdateCars.maxspeed.getValue().toString()),
						Double.valueOf(String.valueOf(UpdateCars.seconds0to100.getValue())),
						helpers.convertToBoolean(UpdateCars.isAutomaticComboBox.getValue()),
						Integer.parseInt(UpdateCars.gears.getValue().toString()),
						String.valueOf(UpdateCars.tireModelComboBox.getValue()),
						Integer.parseInt(UpdateCars.tireSize.getValue().toString()),
						UpdateCars.additionalDesc.getText(),
						helpers.convertToBoolean(UpdateCars.is4x4ComboBox.getValue()),
						Integer.parseInt(event.getId())); 
						
				if (!res3) {
					Modal.display(2, "Error", "Users was not updated", "OK", "");
					return;
				}

			}
			Modal.display(2, "Success", "User updated sucessfully", "OK", "");
			Main.content.getChildren().clear();
			MainComponentCars.vbox.getChildren().clear();
			MainComponentCars.count = 0;
			Header.labelBox.getChildren().remove(Header.labelBox.getChildren().size() - 1);
			Main.content.getChildren().addAll(new Filter(""), new MainComponentCars());
			
			Main.nodeHistory.clear();

		} catch (NumberFormatException | SQLException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
