package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import controller.CarsInfoController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.util.StringConverter;
import models.Car;
import models.FuelType;
import models.Manufacturer;
import models.Users;
import helpers.helpers;
//import models.FuelType;
import models.Store;

public class UpdateCars {
	public static Button updateBtn = new Button("Update");
	public static Button deleteBtn = new Button("Delete User");
	public static ComboBox manufacturerComboBox = new ComboBox(showData());
	public static ComboBox storesComboBox = new ComboBox(stores());
	public static TextField txtForModel = new TextField();
	public static TextField txtForbodyNumber;
	public static ComboBox yearOfProdComboBox;
	public static TextField txtForPrice = new TextField();
	public static String seats[] = { "2", "4", "5", "6", "7" };
	public static ComboBox seatsComboBox = new ComboBox(FXCollections.observableArrayList(seats));
	public static String doors[] = { "3", "5", "7" };
	public static ComboBox doorsComboBox = new ComboBox(FXCollections.observableArrayList(doors));
	public static String trueFalse[] = { "true", "false" };
	public static ComboBox roofComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static ComboBox alarmComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static ComboBox centralComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static ComboBox airbagComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static ComboBox autonomusComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static ComboBox navigatorComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static ComboBox climateComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static ComboBox fuelTypeIdComboBox = new ComboBox(fuelTypes());
	public static Spinner<Integer> fuelCapacity;
	public static Spinner<Double> fuelConsumption;
	public static ComboBox hidraulicComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static TextField engineModel = new TextField();
	public static Spinner<Double> enginePower = new Spinner<>(0, 300, 0, 1);
	public static Spinner<Integer> hoursePowerCapacity;
	public static Spinner<Integer> maxspeed;
	public static Spinner<Double> seconds0to100;
	public static ComboBox isAutomaticComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static Spinner<Integer> gears;
	public static String tireModel[] = { "summer", "winter" };
	public static ComboBox tireModelComboBox = new ComboBox(FXCollections.observableArrayList(tireModel));
	public static Spinner<Integer> tireSize;
	public static TextField additionalDesc;
	public static ComboBox is4x4ComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static int id;

	

	public static VBox display() throws IOException, SQLException {
		System.out.println(id);
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
		Label storeLabel = new Label("Stores Id");
		storeLabel.setMinWidth(60);

		Label manufacturerIdLabel = new Label("Manufacturer ");
		manufacturerIdLabel.setMinWidth(60);

		Label storeNameLabel = new Label("Model");
		storeNameLabel.setMinWidth(60);

		Label bodyNumberLabel = new Label("Body Number");
		storeNameLabel.setMinWidth(60);

		Label yearOfProdLabel = new Label("Year of Production");
		manufacturerIdLabel.setMinWidth(60);

		Label priceLabel = new Label("Price");
		manufacturerIdLabel.setMinWidth(60);

		// Second row
		Label seatsLabel = new Label("Seats");
		manufacturerIdLabel.setMinWidth(60);

		Label doorsLabel = new Label("Doors");
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
		carsData.setPadding(new Insets(20, 0, 0, 0));

		GridPane secondCarsData = new GridPane();
		secondCarsData.setVgap(10);
		secondCarsData.setHgap(60);
		secondCarsData.setPadding(new Insets(20, 0, 0, 20));

		models.Car.getSomeDetailsOfCar();
		ArrayList<models.Car> veturat = models.Car.kerret;
		// first row
		secondCarsData.add(storeLabel, 0, 0);
		secondCarsData.add(manufacturerIdLabel, 1, 0);
		secondCarsData.add(storeNameLabel, 2, 0);
		secondCarsData.add(bodyNumberLabel, 3, 0);
		secondCarsData.add(yearOfProdLabel, 4, 0);
		secondCarsData.add(priceLabel, 5, 0);

		// second row
		secondCarsData.add(storesComboBox, 0, 1);
		secondCarsData.add(manufacturerComboBox, 1, 1);
		secondCarsData.add(txtForModel, 2, 1);
		secondCarsData.add(txtForbodyNumber, 3, 1);
		secondCarsData.add(yearOfProdComboBox, 4, 1);
		secondCarsData.add(txtForPrice, 5, 1);

		manufacturerComboBox.setPrefWidth(100);
		txtForModel.setPrefWidth(100);
		txtForbodyNumber.setPrefWidth(100);
		yearOfProdComboBox.setPrefWidth(100);
		txtForPrice.setPrefWidth(100);

		// third row
		secondCarsData.add(seatsLabel, 0, 2);
		secondCarsData.add(doorsLabel, 1, 2);
		secondCarsData.add(roofLabel, 2, 2);
		secondCarsData.add(alarmLabel, 3, 2);
		secondCarsData.add(centralLabel, 4, 2);
		secondCarsData.add(airbagLabel, 5, 2);

		// fourth row
		secondCarsData.add(seatsComboBox, 0, 3);
		secondCarsData.add(doorsComboBox, 1, 3);
		secondCarsData.add(roofComboBox, 2, 3);
		secondCarsData.add(alarmComboBox, 3, 3);
		secondCarsData.add(centralComboBox, 4, 3);
		secondCarsData.add(airbagComboBox, 5, 3);

		seatsComboBox.setPrefWidth(100);
		doorsComboBox.setPrefWidth(100);
		roofComboBox.setPrefWidth(100);
		alarmComboBox.setPrefWidth(100);
		centralComboBox.setPrefWidth(100);
		airbagComboBox.setPrefWidth(100);

		// fifth row
		secondCarsData.add(autonomusLabel, 0, 4);
		secondCarsData.add(navigatorLabel, 1, 4);
		secondCarsData.add(climateLabel, 2, 4);
		secondCarsData.add(fuelTypeIdLabel, 3, 4);
		secondCarsData.add(fuelCapacityLabel, 4, 4);
		secondCarsData.add(fuelConsumptionLabel, 5, 4);

		// sixth row
		secondCarsData.add(autonomusComboBox, 0, 5);
		secondCarsData.add(navigatorComboBox, 1, 5);
		secondCarsData.add(climateComboBox, 2, 5);
		secondCarsData.add(fuelTypeIdComboBox, 3, 5);
		secondCarsData.add(fuelCapacity, 4, 5);
		secondCarsData.add(fuelConsumption, 5, 5);

		autonomusComboBox.setPrefWidth(100);
		navigatorComboBox.setPrefWidth(100);
		climateComboBox.setPrefWidth(100);
		fuelTypeIdComboBox.setPrefWidth(100);
		fuelCapacity.setPrefWidth(100);
		fuelConsumption.setPrefWidth(100);

		// seventh row
		secondCarsData.add(hidraulicLabel, 0, 6);
		secondCarsData.add(engineModelLabel, 1, 6);
		secondCarsData.add(enginePowerLabel, 2, 6);
		secondCarsData.add(hoursePowerLabel, 3, 6);
		secondCarsData.add(maxspeedLabel, 4, 6);
		secondCarsData.add(seconds0to100Label, 5, 6);

		// eighth row
		secondCarsData.add(hidraulicComboBox, 0, 7);
		secondCarsData.add(engineModel, 1, 7);
		secondCarsData.add(enginePower, 2, 7);
		secondCarsData.add(hoursePowerCapacity, 3, 7);
		secondCarsData.add(maxspeed, 4, 7);
		secondCarsData.add(seconds0to100, 5, 7);

		hidraulicComboBox.setPrefWidth(100);
		engineModel.setPrefWidth(100);
		enginePower.setPrefWidth(100);
		hoursePowerCapacity.setPrefWidth(100);
		maxspeed.setPrefWidth(100);
		seconds0to100.setPrefWidth(100);

		// nineth row
		secondCarsData.add(isAutomaticLabel, 0, 8);
		secondCarsData.add(gearsLabel, 1, 8);
		secondCarsData.add(tireModelLabel, 2, 8);
		secondCarsData.add(tireSizeLabel, 3, 8);
		secondCarsData.add(additionalDescLabel, 4, 8);
		secondCarsData.add(is4x4Label, 5, 8);

		// tenth row
		secondCarsData.add(isAutomaticComboBox, 0, 9);
		secondCarsData.add(gears, 1, 9);
		secondCarsData.add(tireModelComboBox, 2, 9);
		secondCarsData.add(tireSize, 3, 9);
		secondCarsData.add(additionalDesc, 4, 9);
		secondCarsData.add(is4x4ComboBox, 5, 9);

		isAutomaticComboBox.setPrefWidth(100);
		gears.setPrefWidth(100);
		tireModelComboBox.setPrefWidth(100);
		tireSize.setPrefWidth(100);
		additionalDesc.setPrefWidth(100);
		is4x4ComboBox.setPrefWidth(100);

		
		updateBtn.getStyleClass().add("photoToCenter");
		HBox btnHbox = new HBox();
		btnHbox.setPrefWidth(100);
		btnHbox.setPrefHeight(40);
		btnHbox.getChildren().add(updateBtn);
		btnHbox.setPadding(new Insets(50, 0, 0, 0));
		btnHbox.setAlignment(Pos.CENTER);
		carsData.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(0, 30, 0, 30));

		updateBtn.setOnAction(new controller.UpdateCarController());

		manufacturerComboBox.setOnAction(event -> {
			Manufacturer manufacturer = (Manufacturer) manufacturerComboBox.getSelectionModel().getSelectedItem();
			// FuelType fuelType = (FuelType)
			// fuelTypeIdComboBox.getSelectionModel().getSelectedItem();
			// Stores store = (Stores)
			// manufacturerComboBox.getSelectionModel().getSelectedItem();

		});

		showData();
		vbox.getChildren().addAll(photoHBox, carsData, secondCarsData, btnHbox);
		return vbox;

	}

	public static boolean emer(Object s) {

		return Boolean.valueOf(String.valueOf(s));

	}

	public static ObservableList<models.Manufacturer> showData() {

		try {
			ObservableList<models.Manufacturer> manufacturerList = models.Manufacturer.getData();
			return manufacturerList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static ObservableList<models.FuelType> fuelTypes() {

		try {
			ObservableList<models.FuelType> fuelTypeList = models.FuelType.getFuelTypes();
			return fuelTypeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static ObservableList<models.Store> stores() {

		try {
			ObservableList<models.Store> storeList = models.Store.getStore();
			return storeList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
//		public static boolean update(int manufacturerId ,String model,String bodyNumber,int yearOfProd ,int seats ,
//				int doors,boolean roof ,boolean alarm ,boolean central ,boolean airbag ,boolean autonomus,
//				boolean navigator,boolean climate,int fuelTypeId,int fuelCapacity,double fuelConsumption,
//				boolean hidraulic,String engineModel,double enginePower,int hoursePower,int maxspeed,
//				double seconds0to100,boolean isAutomatic,int gears,String tireModel,int tireSize,String additionalDesc,
//				boolean is4x4 ,int carId) throws SQLException{ 


		
	

}
