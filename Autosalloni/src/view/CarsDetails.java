package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.CarsDetailsController;
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
import models.DatabaseConfig;
import models.FuelType;
import models.Manufacturer;
import models.Store;

public class CarsDetails   {

    public static Car c ; 
    public static TextField textForManufacturer ;
  	public static TextField txtForModel ;
  	public static TextField txtForbodyNumber;
  	public static TextField txtForYearOfProduction;
  	public static TextField txtForSeats;
  	public static TextField txtForDoors;
    public static TextField txtForRoof;
  	public static TextField txtForAlarm;
  	public static TextField txtForCentral;
  	public static TextField txtForAirBag;
  	public static TextField txtForAutonomous;
    public static TextField txtForNavigator;
  	public static TextField txtForClimate;
  	public static TextField txtForFuelType ; 
  	public static TextField txtForFuelCapacity;
  	public static TextField txtForFuelConsumption;
  	public static TextField txtForHidraulic;
  	public static TextField txtForEngineModel;
  	public static TextField txtForEnginePowerModel;
  	public static TextField txtForHoursePower;
  	public static TextField txtForMaxSpeed;
  	public static TextField txtForSeconds0to100;
  	public static TextField txtForIsAutomatic;
  	public static TextField txtForGears;
  	public static TextField txtForTireModel;
  	public static TextField txtForTireSize;
  	public static TextField txtForAdditionalDesc;
  	public static TextField txtForIs4x4;
  	public static ComboBox storeComboBox ;
  	public static TextField price;
	
   
   public CarsDetails(Car c) throws SQLException {
		this.c=c;
		txtForFuelType = new TextField(c.getNameOfFuelTypeSQL());
		textForManufacturer = new TextField(c.getNameOFManufacturerSQL());
		storeComboBox = new ComboBox(FXCollections.observableArrayList(Store.getStore(c.getId())));
		txtForModel = new TextField(c.getModel());
		txtForModel.setEditable(false);
		txtForbodyNumber = new TextField(c.getBodyNumber());
		txtForYearOfProduction = new TextField(c.getBodyNumber()+"");
		txtForSeats = new TextField(c.getSeats() + "");
		txtForDoors = new TextField(c.getDoors() + "");
		txtForRoof = new TextField(c.isRoof() + "");
		txtForAlarm = new TextField(c.isAlarm() + "");
		txtForCentral = new TextField(c.isCentral() + "");
		txtForAirBag = new TextField(c.isAirbag() + "");
		txtForAutonomous = new TextField(c.isAutonomus() + "");
		txtForNavigator = new TextField(c.isNavigator() + "");
		txtForClimate = new TextField(c.isClimate() + "");
		txtForFuelCapacity = new TextField(c.getFuelCapacity() + "");
		txtForFuelConsumption = new TextField(c.getFuelConsumption() + "");
		txtForFuelConsumption = new TextField(c.getFuelConsumption() + "");
		txtForHidraulic = new TextField(c.isHidraulic() + "");
		txtForEngineModel = new TextField(c.getEngineModel() + "");
		txtForEnginePowerModel = new TextField(c.getEnginePower()+"");
		txtForHoursePower = new TextField(c.getHoursePower() + "");
		txtForMaxSpeed = new TextField(c.getMaxspeed()+"");
		txtForSeconds0to100 = new TextField(c.getSeconds0to100() + "");
		txtForIsAutomatic = new TextField(c.isAutomatic() + "");
		txtForGears = new TextField(c.getGears() + "");
		txtForTireModel = new TextField(c.getTireModel());
		txtForTireSize = new TextField(c.getTireSize() + "");
		txtForAdditionalDesc = new TextField(c.getAdditionalDesc() + "");
		txtForIs4x4 = new TextField(c.isIs4x4() + "");
		price = new TextField();
		
		
		txtForFuelType.setEditable(false);
		txtForYearOfProduction.setEditable(false);
		textForManufacturer.setEditable(false);
		txtForbodyNumber.setEditable(false);
		txtForbodyNumber.setEditable(false);
		txtForSeats.setEditable(false);
		txtForDoors.setEditable(false);
		txtForRoof.setEditable(false);
		txtForAlarm.setEditable(false);
		txtForCentral.setEditable(false);
		txtForAirBag.setEditable(false);
		txtForAutonomous.setEditable(false);
		txtForNavigator.setEditable(false);
		txtForClimate.setEditable(false);
		txtForFuelCapacity.setEditable(false);
		txtForFuelConsumption.setEditable(false);
	    txtForHidraulic.setEditable(false);
		txtForEngineModel.setEditable(false);
	    txtForEnginePowerModel.setEditable(false);
		txtForHoursePower.setEditable(false);
		txtForMaxSpeed.setEditable(false);
		txtForSeconds0to100.setEditable(false);
		txtForIsAutomatic.setEditable(false);
		txtForGears.setEditable(false);
		txtForTireModel.setEditable(false);
		txtForTireSize.setEditable(false);
		txtForAdditionalDesc.setEditable(false);
		txtForIs4x4.setEditable(false);
        price.setEditable(false);

	}
   
   
	public static VBox display () throws IOException, SQLException {


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

		
		Button buyBtn = new Button("Buy");
		buyBtn.getStyleClass().add("photoToCenter");
		HBox btnHbox = new HBox();
		btnHbox.setPrefWidth(100);
		btnHbox.setPrefHeight(40);
		btnHbox.getChildren().add(buyBtn);
		btnHbox.setPadding(new Insets(50, 0, 0, 0));
		btnHbox.setAlignment(Pos.CENTER);
		carsData.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(0, 30, 0, 30));
		
		storeComboBox.setOnAction(event -> {
			Store store = (Store) storeComboBox.getSelectionModel().getSelectedItem();			
			System.out.println(store.getId());	
			try {
				int priceOfCar = c.returnPrice(c.getId(),store.getId());
				price.setText(priceOfCar + "");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			

	});
		
		buyBtn.setOnAction(new CarsDetailsController());
		
		
		
		vbox.getChildren().addAll(photoHBox, carsData, secondCarsData, btnHbox);
		return vbox;
	}
	
	
	}

  
		
