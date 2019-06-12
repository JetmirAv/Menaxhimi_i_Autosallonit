package view;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

import controller.CarsInfoController;
import controller.UploadPhotoController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Car;
import models.Manufacturer;
import models.Photos;
import helpers.helpers;
import models.FuelType;
import models.Store;
import helpers.Validations;

public class CarsInfo extends VBox{
	public static ComboBox manufacturerComboBox = new ComboBox(showData());
	public static ComboBox storesComboBox = new ComboBox(stores());
	public static TextField txtForModel = new TextField();
	public static TextField txtForbodyNumber = new TextField();
	public static ComboBox yearOfProdComboBox;
	public static TextField  txtForPrice= new TextField();
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
	public static Spinner<Integer> fuelCapacity = new Spinner<>(0, 150, 45, 1);
	public static Spinner<Double> fuelConsumption = new Spinner<>(0, 20, 4, 1);// min , max , start , increase
	public static ComboBox hidraulicComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static TextField engineModel = new TextField();
	public static Spinner<Double> enginePower = new Spinner<>(0, 60000, 80, 1);
	public static Spinner<Integer> hoursePowerCapacity = new Spinner<>(0, 7000, 200, 1);
	public static Spinner<Integer> maxspeed = new Spinner<>(0, 500, 80, 1);
	public static Spinner<Double> seconds0to100 = new Spinner<>(0, 50, 0, 1);
	public static ComboBox isAutomaticComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static Spinner<Integer> gears = new Spinner<>(4, 7, 4, 1);
	public static String tireModel[] = { "summer", "winter" };
	public static ComboBox tireModelComboBox = new ComboBox(FXCollections.observableArrayList(tireModel));
	public static Spinner<Integer> tireSize = new Spinner<>(0, 350, 0, 1);
	public static TextField additionalDesc = new TextField();
	public static ComboBox is4x4ComboBox = new ComboBox(FXCollections.observableArrayList(trueFalse));
	public static TextField imgField = new TextField();
	
	
	
	public static Image image1;
	public static ImageView imageView1 = new ImageView();
	public static Stage modal = new Stage();

	public static Stage stage = new Stage();
	

	

	public CarsInfo () throws IOException {
		
		String current = new java.io.File(".").getCanonicalPath();	
		
		final Stage stage = new Stage();
		//String current = new java.io.File(".").getCanonicalPath();
		//final Stage stage = new Stage();
		
		FileInputStream UserImgPath = new FileInputStream(current + "/src/img/car.png");
		image1 = new Image(UserImgPath, 100, 150, true, true);
		imageView1.setImage(image1);
		imageView1.setId("carsinfo");
		imageView1.setOnMouseClicked(new UploadPhotoController());

		
		
		
		
        TextArea textArea = new TextArea();
        textArea.setMinHeight(30);
        textArea.setMinWidth(600);
        textArea.setMaxWidth(600);
        textArea.setMaxHeight(40);
		modal.initModality(Modality.APPLICATION_MODAL);
		modal.setTitle("Sign In");


		

       
		
		
        
		System.out.println(showData());
		
		
		ArrayList<Integer> years = new ArrayList<Integer>();

		for (int i = Calendar.getInstance().get(Calendar.YEAR); i >= 1940; i--) {
			years.add(i);
		}
		yearOfProdComboBox = new ComboBox<>(FXCollections.observableArrayList(years));

		VBox vbox = new VBox();
		vbox.getStylesheets().add(MainComponent.class.getResource("CarsForm.css").toExternalForm());
		vbox.getStylesheets().add(MainComponent.class.getResource("header.css").toExternalForm());

		HBox photoHBox = new HBox();

		FileInputStream userPath;
		userPath = new FileInputStream(current + "/src/img/user.png");

		Image img = new Image(userPath);


		photoHBox.getChildren().add(imageView1);
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

		Label hoursePowerLabel = new Label("Hourse Power");
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

		
		storesComboBox.getSelectionModel().selectFirst();
		manufacturerComboBox.setPrefWidth(100);
		txtForModel.setPrefWidth(100);
		txtForbodyNumber.setPrefWidth(100);
		yearOfProdComboBox.setPrefWidth(100);
		txtForPrice.setPrefWidth(100);
		
		
		
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
		insertBtn.getStyleClass().add("updateBtn");

		
//		manufacturerComboBox.setOnAction(event -> {
//				Manufacturer manufacturer = (Manufacturer) manufacturerComboBox.getSelectionModel().getSelectedItem();			
//				FuelType fuelType = (FuelType) manufacturerComboBox.getSelectionModel().getSelectedItem();			
//				Stores store = (Stores) manufacturerComboBox.getSelectionModel().getSelectedItem();			
//
//		});


		insertBtn.setOnAction(new CarsInfoController());
		showData();
		vbox.getChildren().addAll(photoHBox, carsData, secondCarsData, btnHbox);
		getChildren().add(vbox);

	}


	public static boolean insertCar() throws NumberFormatException, SQLException, IOException {

		Manufacturer manufacturer = (Manufacturer) manufacturerComboBox.getSelectionModel().getSelectedItem();
		FuelType fuelType = (FuelType) fuelTypeIdComboBox.getSelectionModel().getSelectedItem();			
		Store store = (Store) storesComboBox.getSelectionModel().getSelectedItem();			
		if (!Validations.validateBodyNumber(txtForbodyNumber.getText()) || Validations.textFieldValidations(imgField.getText())) {
			Modal.display(2, "Error!", "Only numbers and uppercase letters are allowed", "Ok", "");		
		}

		
		int carId = Car.addCar(store.getId(), 
				manufacturer.getId(),
				txtForModel.getText(), txtForbodyNumber.getText(),
				Integer.parseInt(yearOfProdComboBox.getValue().toString()),
				Integer.parseInt(seatsComboBox.getValue().toString()),
				Integer.parseInt(doorsComboBox.getValue().toString()),
				helpers.convertToBoolean(roofComboBox.getValue()),
				helpers.convertToBoolean(alarmComboBox.getValue()),
				helpers.convertToBoolean(centralComboBox.getValue()),
				helpers.convertToBoolean(airbagComboBox.getValue()),
				helpers.convertToBoolean(autonomusComboBox.getValue()),
				helpers.convertToBoolean(navigatorComboBox.getValue()),
				helpers.convertToBoolean(climateComboBox.getValue()),fuelType.getId(),
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
			
			return Photos.insertPhoto(carId, imgField.getText());
//			return true;
	
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
			return storeList ;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
    public static void configureFileChooser(
            final FileChooser fileChooser) {      
                fileChooser.setTitle("View Pictures");
                fileChooser.setInitialDirectory(
                    new File(System.getProperty("user.home"))
                );                 
                fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("All Images", "*.*"),
                    new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                    new FileChooser.ExtensionFilter("PNG", "*.png")
                );
        }
		


}
