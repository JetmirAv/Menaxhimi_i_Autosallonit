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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import javafx.util.StringConverter;
import models.Car;
import models.Manufacturer;
import models.Users;
import helpers.helpers;

public class CarsInfo {

//	ArrayList<String> names = Manufacturer.getNames();

//	ArrayList<String> name = models.Car.modelA;
//	ArrayList<String> bodyNr = models.Car.bodyNumberA;
//	ArrayList<String> engineMd = models.Car.engineModelA;

//	public static    String manufacturers[] = {
//			for(int i=0 ; i<names.size();i++)
//				
//			{names.get(i);}
//			
//			};  
	public static ComboBox manufacturerComboBox = new ComboBox(showData());

	public static String stores[] = { "Luke", "Keith", "Tanner", "Hall", "Aquila", "Davis", "Dexter" };
	public static ComboBox storesComboBox = new ComboBox(FXCollections.observableArrayList(stores));

	public static TextField txtForModel = new TextField();
	public static TextField txtForbodyNumber = new TextField();

	public static ComboBox yearOfProdComboBox;
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
	public static String fuelTypeId[] = { "Gasoline", "Diesel", "Natural gas", "Hydrogen", "Biodiesel" };
	public static ComboBox fuelTypeIdComboBox = new ComboBox(FXCollections.observableArrayList(fuelTypeId));
	private static Spinner<Integer> fuelCapacity = new Spinner<>(0, 300, 0, 1);
	public static Spinner<Double> fuelConsumption = new Spinner<>(0, 300, 0, 1);// min , max , start , increase
	public static ComboBox hidraulicComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static TextField engineModel = new TextField();
	public static Spinner<Double> enginePower = new Spinner<>(0, 300, 0, 1);
	public static Spinner<Integer> hoursePowerCapacity = new Spinner<>(0, 300, 0, 1);
	public static Spinner<Integer> maxspeed = new Spinner<>(0, 350, 0, 1);
	public static Spinner<Double> seconds0to100 = new Spinner<>(0, 300, 0, 1);
	public static ComboBox isAutomaticComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static Spinner<Integer> gears = new Spinner<>(4, 7, 4, 1);
	public static String tireModel[] = { "summer", "winter" };
	public static ComboBox tireModelComboBox = new ComboBox(FXCollections.observableArrayList(tireModel));
//	public static    TextField tireSize= new TextField();
	public static Spinner<Integer> tireSize = new Spinner<>(0, 350, 0, 1);
	public static TextField additionalDesc = new TextField();
	public static ComboBox is4x4ComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));

	public static VBox display(String current) throws IOException, SQLException {

//		manufacturerComboBox.setConverter(new StringConverter<Manufacturer>() {
//
//		    @Override
//		    public String toString(Manufacturer object) {
//		        return object.getName();
//		    }
//
//		    @Override
//		    public Manufacturer fromString(String string) {
//		        return manufacturerComboBox.getItems().stream().filter(ap -> 
//		            ap.getName().equals(string)).findFirst().orElse(null);
//		    }
//		});

		
		ArrayList<Integer> years = new ArrayList<Integer>();

		for (int i = Calendar.getInstance().get(Calendar.YEAR); i >= 1940; i--) {
			years.add(i);
		}
		yearOfProdComboBox = new ComboBox<>(FXCollections.observableArrayList(years));

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
		Label storeLabel = new Label("Manufacturer Id");
		storeLabel.setMinWidth(60);

		Label manufacturerIdLabel = new Label("Manufacturer Id");
		manufacturerIdLabel.setMinWidth(60);

		Label storeNameLabel = new Label("Model");
		storeNameLabel.setMinWidth(60);

		Label bodyNumberLabel = new Label("Body Number");
		storeNameLabel.setMinWidth(60);

		Label yearOfProdLabel = new Label("Year of Production");
		manufacturerIdLabel.setMinWidth(60);

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
		carsData.setPadding(new Insets(20, 0, 0, 0));

		GridPane secondCarsData = new GridPane();
		secondCarsData.setVgap(10);
		secondCarsData.setHgap(60);
		secondCarsData.setPadding(new Insets(20, 0, 0, 20));

		// first row
		carsData.add(storeLabel, 0, 0);
		carsData.add(manufacturerIdLabel, 1, 0);
		carsData.add(storeNameLabel, 2, 0);
		carsData.add(bodyNumberLabel, 3, 0);
		carsData.add(yearOfProdLabel, 4, 0);

		// second row
		carsData.add(storesComboBox, 0, 1);
		carsData.add(manufacturerComboBox, 1, 1);
		carsData.add(txtForModel, 2, 1);
		carsData.add(txtForbodyNumber, 3, 1);
		carsData.add(yearOfProdComboBox, 4, 1);

		storesComboBox.getSelectionModel().selectFirst();
		manufacturerComboBox.setPrefWidth(124);
		txtForModel.setPrefWidth(124);
		txtForbodyNumber.setPrefWidth(124);
		yearOfProdComboBox.setPrefWidth(124);

		manufacturerComboBox.getSelectionModel().selectFirst();
		yearOfProdComboBox.getSelectionModel().selectFirst();

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

		seatsComboBox.getSelectionModel().selectFirst();
		doorsComboBox.getSelectionModel().selectFirst();
		roofComboBox.getSelectionModel().selectFirst();
		alarmComboBox.getSelectionModel().selectFirst();
		centralComboBox.getSelectionModel().selectFirst();
		airbagComboBox.getSelectionModel().selectFirst();

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

		autonomusComboBox.getSelectionModel().selectFirst();
		navigatorComboBox.getSelectionModel().selectFirst();
		climateComboBox.getSelectionModel().selectFirst();
		fuelTypeIdComboBox.getSelectionModel().selectFirst();

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

		hidraulicComboBox.getSelectionModel().selectFirst();

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

		isAutomaticComboBox.getSelectionModel().selectFirst();
		tireModelComboBox.getSelectionModel().selectFirst();
		is4x4ComboBox.getSelectionModel().selectFirst();

		isAutomaticComboBox.setPrefWidth(100);
		gears.setPrefWidth(100);
		tireModelComboBox.setPrefWidth(100);
		tireSize.setPrefWidth(100);
		additionalDesc.setPrefWidth(100);
		is4x4ComboBox.setPrefWidth(100);

		Button insertBtn = new Button("Insert");
		insertBtn.getStyleClass().add("photoToCenter");
		HBox btnHbox = new HBox();
		btnHbox.setPrefWidth(100);
		btnHbox.setPrefHeight(40);
		btnHbox.getChildren().add(insertBtn);
		btnHbox.setPadding(new Insets(50, 0, 0, 0));
		btnHbox.setAlignment(Pos.CENTER);
		carsData.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(0, 30, 0, 30));
		
		
		manufacturerComboBox.setOnAction(event -> {
			
				Manufacturer manufacturer = (Manufacturer) manufacturerComboBox.getSelectionModel().getSelectedItem();
				System.out.println(manufacturer.getId());
			
		});


		insertBtn.setOnAction(new CarsInfoController());
//		setEventOnAirport();
		showData();
		vbox.getChildren().addAll(photoHBox, carsData, secondCarsData, btnHbox);
		return vbox;

	}

	private ArrayList<String> getNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean insertCar() throws NumberFormatException, SQLException {

		Manufacturer manufacturer = (Manufacturer) manufacturerComboBox.getSelectionModel().getSelectedItem();
		
		return Car.addCar(String.valueOf(storesComboBox.getValue()), 
				manufacturer.getId(),
				txtForModel.getText(), txtForbodyNumber.getText(),
				Integer.parseInt(yearOfProdComboBox.getValue().toString()),
				Integer.parseInt(seatsComboBox.getValue().toString()),
				Integer.parseInt(doorsComboBox.getValue().toString()),
				helpers.convertToBoolean(roofComboBox.getValue()), helpers.convertToBoolean(alarmComboBox.getValue()),
				helpers.convertToBoolean(centralComboBox.getValue()),
				helpers.convertToBoolean(airbagComboBox.getValue()),
				helpers.convertToBoolean(autonomusComboBox.getValue()),
				helpers.convertToBoolean(navigatorComboBox.getValue()),
				helpers.convertToBoolean(climateComboBox.getValue()), String.valueOf(fuelTypeIdComboBox.getValue()),
				Integer.parseInt(fuelCapacity.getValue().toString()),
				Double.valueOf(String.valueOf(fuelConsumption.getValue())),
				helpers.convertToBoolean(hidraulicComboBox.getValue()), engineModel.getText(),
				Double.valueOf(String.valueOf(enginePower.getValue())),
				Integer.parseInt(hoursePowerCapacity.getValue().toString()),
				Integer.parseInt(maxspeed.getValue().toString()),
				Double.valueOf(String.valueOf(seconds0to100.getValue())),
				helpers.convertToBoolean(isAutomaticComboBox.getValue()), Integer.parseInt(gears.getValue().toString()),
				String.valueOf(tireModelComboBox.getValue()), Integer.parseInt(tireSize.getValue().toString()),
				additionalDesc.getText(), helpers.convertToBoolean(is4x4ComboBox.getValue()));

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

		


}
