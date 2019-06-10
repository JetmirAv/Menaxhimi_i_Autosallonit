package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import models.Car;
import models.FuelType;
import models.Manufacturer;
import models.Store;

public class CarsDetails {

	
	
	
	public static VBox display (Car car) throws IOException, SQLException {
		
		
		 TextField textForManufacturer = new TextField(car.getNameOFManufacturerSQL());
		 TextField txtForModel = new TextField(car.getModel());
		 txtForModel.setEditable(false);
		 TextField txtForbodyNumber = new TextField(car.getBodyNumber());
		 txtForbodyNumber.setEditable(false);
		 TextField txtForYearOfProduction = new TextField(car.getBodyNumber()+"");
		 txtForYearOfProduction.setEditable(false);
		 TextField txtForSeats = new TextField(car.getSeats() + "");
		 txtForSeats.setEditable(false);
		 TextField txtForDoors = new TextField(car.getDoors() + "");
		 txtForDoors.setEditable(false);
		 TextField txtForRoof = new TextField(car.isRoof() + "");
		 txtForRoof.setEditable(false);
		 TextField txtForAlarm = new TextField(car.isAlarm() + "");
		 txtForAlarm.setEditable(false);
		 TextField txtForCentral = new TextField(car.isCentral() + "");
		 txtForCentral.setEditable(false);
		 TextField txtForAirBag = new TextField(car.isAirbag() + "");
		 txtForAirBag.setEditable(false);
		 TextField txtForAutonomous = new TextField(car.isAutonomus() + "");
		 txtForAutonomous.setEditable(false);
		 TextField txtForNavigator = new TextField(car.isNavigator() + "");
		 txtForNavigator.setEditable(false);
		 TextField txtForClimate = new TextField(car.isClimate() + "");
		 txtForClimate.setEditable(false);
		 TextField txtForFuelType = new TextField(car.getNameOfFuelTypeSQL());
		 txtForFuelType.setEditable(false);
		 TextField txtForFuelCapacity = new TextField(car.getFuelCapacity() + "");
		 txtForFuelCapacity.setEditable(false);
		 TextField txtForFuelConsumption = new TextField(car.getFuelConsumption() + "");
		 txtForFuelConsumption.setEditable(false);
		 TextField txtForHidraulic = new TextField(car.isHidraulic() + "");
		 txtForHidraulic.setEditable(false);
		 TextField txtForEngineModel = new TextField(car.getEngineModel() + "");
		 txtForEngineModel.setEditable(false);
		 TextField txtForEnginePowerModel = new TextField(car.getEnginePower()+"");
		 txtForEnginePowerModel.setEditable(false);
		 TextField txtForHoursePower = new TextField(car.getHoursePower() + "");
		 txtForHoursePower.setEditable(false);
		 TextField txtForMaxSpeed = new TextField(car.getMaxspeed()+"");
		 txtForMaxSpeed.setEditable(false);
		 TextField txtForSeconds0to100 = new TextField(car.getSeconds0to100() + "");
		 txtForSeconds0to100.setEditable(false);
		 TextField txtForIsAutomatic = new TextField(car.isAutomatic() + "");
		 txtForIsAutomatic.setEditable(false);
		 TextField txtForGears = new TextField(car.getGears() + "");
		 txtForGears.setEditable(false);
		 TextField txtForTireModel = new TextField(car.getTireModel());
		 txtForTireModel.setEditable(false);
		 TextField txtForTireSize = new TextField(car.getTireSize() + "");
		 txtForTireSize.setEditable(false);
		 TextField txtForAdditionalDesc = new TextField(car.getAdditionalDesc() + "");
		 txtForAdditionalDesc.setEditable(false);
		 TextField txtForIs4x4 = new TextField(car.isIs4x4() + "");
		 txtForIs4x4.setEditable(false);
		 ComboBox storeComboBox = new ComboBox(FXCollections.observableArrayList(Store.getStore()));
		 TextField price = new TextField();
		 
		 
			
			
		
			
		 
		 
		
				
		String current = new java.io.File(".").getCanonicalPath();
		VBox vbox = new VBox();
		vbox.getStylesheets().add(MainComponent.class.getResource("CarsForm.css").toExternalForm());

		HBox photoHBox = new HBox();

		FileInputStream userPath;
		userPath = new FileInputStream(current + "/src/img/user.png");

		Image img = new Image(userPath);
		
		Circle store1Circle = new Circle();
		store1Circle.setRadius(50);
		store1Circle.setFill(new ImagePattern(img));
 
		photoHBox.getChildren().add(store1Circle);
		photoHBox.getStyleClass().add("photoToCenter");
		photoHBox.setPadding(new Insets(20, 0, 0, 0));

		// First Row
		Label storeLabel = new Label("Store");
		storeLabel.setMinWidth(60);

		Label manufacturerIdLabel = new Label("Manufacturer Id");
		manufacturerIdLabel.setMinWidth(60);
		TextField textField = new TextField("ManufacturerField");

		Label storeNameLabel = new Label("Model");
		storeNameLabel.setMinWidth(60);

		Label bodyNumberLabel = new Label("Body Number");
		storeNameLabel.setMinWidth(60);

		Label yearOfProdLabel = new Label("Year of Production");
		manufacturerIdLabel.setMinWidth(60);
		
		Label priceLabel = new Label("Price");
		price.setMinWidth(60);

		// Second row
		Label seatsLabel = new Label("Seats");
		manufacturerIdLabel.setMinWidth(60);

		Label doorsLabel = new Label("Seats");
		manufacturerIdLabel.setMinWidth(60);

		Label roofLabel = new Label("Roof");
		manufacturerIdLabel.setMinWidth(60);

		Label alarmLabel = new Label("Alarm");
		manufacturerIdLabel.setMinWidth(60);

		Label centralLabel = new Label("Central");
		manufacturerIdLabel.setMinWidth(60);

		Label airbagLabel = new Label("Airbag");
		manufacturerIdLabel.setMinWidth(60);

		// Third Row
		Label autonomusLabel = new Label("Autonomus");
		autonomusLabel.setMinWidth(60);

		Label navigatorLabel = new Label("Navigator");
		navigatorLabel.setMinWidth(60);

		Label climateLabel = new Label("Climate");
		climateLabel.setMinWidth(60);

		Label fuelTypeIdLabel = new Label("Fuel TypeId");
		fuelTypeIdLabel.setMinWidth(60);

		Label fuelCapacityLabel = new Label("Fuel capacity");
		climateLabel.setMinWidth(60);

		Label fuelConsumptionLabel = new Label("Fuel consumption");
		fuelConsumptionLabel.setMinWidth(60);

		// Fourth Row
		Label hidraulicLabel = new Label("Hidraulic");
		climateLabel.setMinWidth(60);

		Label engineModelLabel = new Label("Engine Model");
		engineModelLabel.setMinWidth(60);

		Label enginePowerLabel = new Label("Engine Power");
		enginePowerLabel.setMinWidth(60);

		Label hoursePowerLabel = new Label("Fuel capacity");
		hoursePowerLabel.setMinWidth(60);

		Label maxspeedLabel = new Label("Max speed");
		maxspeedLabel.setMinWidth(60);

		Label seconds0to100Label = new Label("Seconds 0 to 100");
		seconds0to100Label.setMinWidth(60);

		// fifth row
		Label isAutomaticLabel = new Label("Is Automatic");
		isAutomaticLabel.setMinWidth(60);

		Label gearsLabel = new Label("Gears");
		gearsLabel.setMinWidth(60);

		Label tireModelLabel = new Label("Tire model");
		tireModelLabel.setMinWidth(60);

		Label tireSizeLabel = new Label("Tire size");
		engineModelLabel.setMinWidth(60);

		Label additionalDescLabel = new Label("Additional description");
		additionalDescLabel.setMinWidth(60);

		Label is4x4Label = new Label("Is 4x4");
		is4x4Label.setMinWidth(60);

		GridPane carsData = new GridPane();
		carsData.setVgap(10);
		carsData.setHgap(70);
		carsData.setPadding(new Insets(20, 5, 5, 10));

		GridPane secondCarsData = new GridPane();
		secondCarsData.setVgap(10);
		secondCarsData.setHgap(60);
		secondCarsData.setPadding(new Insets(20, 0, 0, 20));

		// first row storeLabel

		carsData.add(storeLabel, 0, 0);
		carsData.add(manufacturerIdLabel, 1, 0);
		carsData.add(storeNameLabel, 2, 0);
		carsData.add(bodyNumberLabel, 3, 0);
		carsData.add(yearOfProdLabel, 4, 0);
		carsData.add(priceLabel, 5, 0);
		

		// second row storeComboBox
		
		carsData.add(storeComboBox, 0, 1);
		carsData.add(textForManufacturer, 1, 1);
		carsData.add(txtForModel, 2, 1);	
		carsData.add(txtForbodyNumber, 3, 1);
		carsData.add(txtForYearOfProduction, 4, 1);
		carsData.add(price, 5, 1);

		txtForModel.setPrefWidth(124);
		txtForbodyNumber.setPrefWidth(124);
		price.setPrefWidth(124);
		txtForYearOfProduction.setPrefWidth(124);
		textForManufacturer.setPrefWidth(124);

		// third row
		secondCarsData.add(seatsLabel, 0, 2);
		secondCarsData.add(doorsLabel, 1, 2);
		secondCarsData.add(roofLabel, 2, 2);
		secondCarsData.add(alarmLabel, 3, 2);
		secondCarsData.add(centralLabel, 4, 2);
		secondCarsData.add(airbagLabel, 5, 2);

		// fourth row
		secondCarsData.add(txtForSeats, 0, 3);
		secondCarsData.add(txtForDoors, 1, 3);
		secondCarsData.add(txtForRoof, 2, 3);
		secondCarsData.add(txtForAlarm, 3, 3);
		secondCarsData.add(txtForCentral, 4, 3);
		secondCarsData.add(txtForAirBag, 5, 3);

		// fifth row
		secondCarsData.add(autonomusLabel, 0, 4);
		secondCarsData.add(navigatorLabel, 1, 4);
		secondCarsData.add(climateLabel, 2, 4);
		secondCarsData.add(fuelTypeIdLabel, 3, 4);
		secondCarsData.add(fuelCapacityLabel, 4, 4);
		secondCarsData.add(fuelConsumptionLabel, 5, 4);

		// sixth row
		secondCarsData.add(txtForAutonomous, 0, 5);
		secondCarsData.add(txtForNavigator, 1, 5);
		secondCarsData.add(txtForClimate, 2, 5);
		secondCarsData.add(txtForFuelType, 3, 5);
		secondCarsData.add(txtForFuelCapacity, 4, 5);
		secondCarsData.add(txtForFuelConsumption, 5, 5);

		// seventh row
		secondCarsData.add(hidraulicLabel, 0, 6);
		secondCarsData.add(engineModelLabel, 1, 6);
		secondCarsData.add(enginePowerLabel, 2, 6);
		secondCarsData.add(hoursePowerLabel, 3, 6);
		secondCarsData.add(maxspeedLabel, 4, 6);
		secondCarsData.add(seconds0to100Label, 5, 6);

		// eighth row
		 // txtForEngineModel.setText(carsOfDetail.get(3) + "");
		secondCarsData.add(txtForHidraulic, 0, 7);
		secondCarsData.add(txtForEngineModel, 1, 7);
		secondCarsData.add(txtForEnginePowerModel, 2, 7);
		secondCarsData.add(txtForHoursePower, 3, 7);
		secondCarsData.add(txtForMaxSpeed, 4, 7);
		secondCarsData.add(txtForSeconds0to100, 5, 7);

		// nineth row
		secondCarsData.add(isAutomaticLabel, 0, 8);
		secondCarsData.add(gearsLabel, 1, 8);
		secondCarsData.add(tireModelLabel, 2, 8);
		secondCarsData.add(tireSizeLabel, 3, 8);
		secondCarsData.add(additionalDescLabel, 4, 8);
		secondCarsData.add(is4x4Label, 5, 8);

		// tenth row
		secondCarsData.add(txtForIsAutomatic, 0, 9);
		secondCarsData.add(txtForGears, 1, 9);
		secondCarsData.add(txtForTireModel, 2, 9);
		secondCarsData.add(txtForTireSize, 3, 9);
		secondCarsData.add(txtForAdditionalDesc, 4, 9);
		secondCarsData.add(txtForIs4x4, 5, 9);

		Button insertBtn = new Button("Buy");
		insertBtn.getStyleClass().add("photoToCenter");
		HBox btnHbox = new HBox();
		btnHbox.setPrefWidth(100);
		btnHbox.setPrefHeight(40);
		btnHbox.getChildren().add(insertBtn);
		btnHbox.setPadding(new Insets(50, 0, 0, 0));
		btnHbox.setAlignment(Pos.CENTER);
		carsData.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(0, 30, 0, 30));
		
		storeComboBox.setOnAction(event -> {
			Store store = (Store) storeComboBox.getSelectionModel().getSelectedItem();			
			System.out.println(store.getId());	
			try {
				int priceOfCar = car.returnPrice(store.getId(), car.getId());
				if
				(priceOfCar==0) {
					
					price.setText("No stock for this car !");
				}
				
				else
				{
					price.setText(priceOfCar + "");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	});
		
		

		vbox.getChildren().addAll(photoHBox, carsData, secondCarsData, btnHbox);
		return vbox;

	}	

		
}