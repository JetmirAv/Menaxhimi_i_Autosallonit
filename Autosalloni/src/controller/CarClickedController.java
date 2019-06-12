package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import models.Car;
import models.Users;
import view.Header;
import view.Main;
import view.UserInfo;
import view.UpdateCars;

public class CarClickedController implements EventHandler<MouseEvent> {

	@Override
	public void handle(MouseEvent e) {
		HBox box = (HBox) e.getSource();
		System.out.println(box.getId());

		Label lblCreateUser = new Label("/Edit Car");
		Header.lblLocation.getStyleClass().clear();
		Header.lblLocation.getStyleClass().add("lblHistory");
		lblCreateUser.getStyleClass().addAll("lblHistory", "active");
		Header.labelBox.getChildren().add(lblCreateUser);

		Car c;
		try {
			c = Car.getAllDetailsOfCar(Integer.parseInt(box.getId()));

			// Fillimi

			ArrayList<Integer> years = new ArrayList<Integer>();

			for (int i = Calendar.getInstance().get(Calendar.YEAR); i >= 1940; i--) {
				years.add(i);
			}
			
			UpdateCars.yearOfProdComboBox = new ComboBox<>(FXCollections.observableArrayList(years));
			UpdateCars.id = c.getId();

			UpdateCars.fuelTypeIdComboBox.getSelectionModel().select(c.getNameOfFuelTypeSQL());
			//UpdateCars.storesComboBox.getSelectionModel().select(FXCollections.observableArrayList(Store.getStore(c.getId())));
			UpdateCars. manufacturerComboBox.getSelectionModel().select(c.getNameAndId(c.getId()));
			UpdateCars.updateBtn.setId(String.valueOf(c.getId()));
			UpdateCars.deleteBtn.setId(String.valueOf(c.getId()));
			UpdateCars.txtForModel = new TextField(c.getModel());
			UpdateCars.txtForbodyNumber = new TextField(c.getBodyNumber());
			UpdateCars.yearOfProdComboBox.getSelectionModel().select(c.getYearOfProd() + "");
			UpdateCars.seatsComboBox.getSelectionModel().select(c.getSeats() + "");
			UpdateCars.doorsComboBox.getSelectionModel().select(c.getDoors() + "");
			UpdateCars.roofComboBox.getSelectionModel().select(c.isRoof() + "");
			UpdateCars.alarmComboBox.getSelectionModel().select(c.isAlarm() + "");
			UpdateCars.centralComboBox.getSelectionModel().select(c.isCentral() + "");
			UpdateCars.airbagComboBox.getSelectionModel().select(c.isAirbag() + "");
			UpdateCars.autonomusComboBox.getSelectionModel().select(c.isAutonomus() + "");
			UpdateCars.navigatorComboBox.getSelectionModel().select(c.isNavigator() + "");
			UpdateCars.climateComboBox.getSelectionModel().select(c.isClimate() + "");
			UpdateCars.fuelCapacity = new Spinner<>(0, 300, c.getFuelTypeId(), 1);
			UpdateCars.fuelConsumption = new Spinner<Double>(0, 300, c.getFuelConsumption(), 1);
			UpdateCars.hidraulicComboBox.getSelectionModel().select(c.isHidraulic() + "");
			UpdateCars.engineModel = new TextField(c.getEngineModel() + "");
			UpdateCars.hoursePowerCapacity = new Spinner<>(0, 300, c.getHoursePower(), 1);
			UpdateCars.maxspeed = new Spinner<>(0, 350, c.getMaxspeed(), 1);
			UpdateCars.seconds0to100 = new Spinner<>(0, 300, c.getSeconds0to100(), 1);
			UpdateCars.isAutomaticComboBox.getSelectionModel().select(c.isAutomatic() + "");
			UpdateCars.gears = new Spinner<>(4, 7, c.getGears(), 1);
			UpdateCars.tireModelComboBox.getSelectionModel().select(c.getTireModel());
			UpdateCars.tireSize = new Spinner<>(0, 350, c.getTireSize(), 1);
			UpdateCars.additionalDesc = new TextField(c.getAdditionalDesc() + "");
			UpdateCars.is4x4ComboBox.getSelectionModel().select(c.isIs4x4() + "");
			// price = new TextField();

			// Fundi

			Main.nodeHistory.addAll(Main.content.getChildren());
			Main.content.getChildren().clear();
			Main.content.getChildren().add(UpdateCars.display());
		} catch (NumberFormatException | SQLException | IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	}

}
