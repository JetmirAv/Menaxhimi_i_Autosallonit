package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import models.Store;
import models.Users;

public class MainComponentStores extends VBox {
	private static TableView table = new TableView();
	private static int count = 0;

	public MainComponentStores() throws SQLException, IOException {
		String current = new java.io.File(".").getCanonicalPath();

		HBox hbox = new HBox(50);
		VBox vbox = new VBox(5);
		HBox tHeader = new HBox(10);
		vbox.getStylesheets().add(MainComponentStores.class.getResource("mainComponent.css").toExternalForm());
		FileInputStream userPath;
		userPath = new FileInputStream(current + "/src/img/user.png");

		Image img = new Image(userPath);

		hbox.getStyleClass().add("AdminSite");

		// Ktu ja nisi une

		HBox headerBox = new HBox();
		headerBox.setAlignment(Pos.CENTER);
		headerBox.setPrefHeight(20);
		Label lblImage = new Label("Image");
		Label lblName = new Label("Name");
		Label lblEmail = new Label("Address");
		Label lblCity = new Label("City");
		Label lblState = new Label("State");
		Label lblGender = new Label("Postal");
		Label lblPhone = new Label("Phone Number");
		Label lblBirthday = new Label("Birthday");

		lblImage.getStyleClass().add("userHeaderLabel");
		lblName.getStyleClass().add("userHeaderLabel");
		lblEmail.getStyleClass().add("userHeaderLabel");
		lblPhone.getStyleClass().add("userHeaderLabel");
		lblCity.getStyleClass().add("userHeaderLabel");
		lblState.getStyleClass().add("userHeaderLabel");
		lblGender.getStyleClass().add("userHeaderLabel");
		lblBirthday.getStyleClass().add("userHeaderLabel");

		lblImage.setPrefWidth(50);
		lblName.setPrefWidth(120);
		lblEmail.setPrefWidth(230);
		lblPhone.setPrefWidth(180);
		lblCity.setPrefWidth(120);
		lblState.setPrefWidth(120);
		lblGender.setPrefWidth(90);
		lblBirthday.setPrefWidth(140);

		headerBox.getChildren().addAll(lblImage, lblName, lblEmail, lblPhone, lblGender, lblBirthday,
				lblCity, lblState);

		if (count == 0) {
//			vbox.getChildren().add(headerBox);
//
//			List<HBox> user = Users.getUsers();
//			for (int i = 0; i < user.size(); i++) {
//				vbox.getChildren().add(user.get(i));
//			}
//			Button createUser = new Button("Create User");
//			createUser.setOnAction(new controller.ShowCreateUserController());
//
//			vbox.getChildren().add(createUser);
//			count++;
		}
//		getChildren().add(vbox);

		// Ktu e kryej

//	Label logoLabel = new Label("Logo");
//	logoLabel.setMinWidth(60);
//	logoLabel.getStyleClass().add("fonts");
//	Label nameLabel = new Label("Name");
//	nameLabel.setMinWidth(60);
//	nameLabel.getStyleClass().add("fonts");
//	Label addressLabel = new Label("Address");
//	addressLabel.getStyleClass().add("fonts");
//	addressLabel.setMinWidth(60);
//   	Label cityLabel = new Label("City");
//   	cityLabel.getStyleClass().add("fonts");
//   	cityLabel.setMinWidth(60);
//   	Label stateLabel = new Label("State");
//   	stateLabel.getStyleClass().add("fonts");
//   	stateLabel.setMinWidth(60);
//   	Label postalLabel = new Label("Postal");
//   	postalLabel.getStyleClass().add("fonts");
//   	postalLabel.setMinWidth(60);
//   	Label phoneNumberLabel = new Label("Phone Number");
//   	phoneNumberLabel.getStyleClass().add("fonts");
//   	phoneNumberLabel.setMinWidth(60);
//   	Label createdAtLabel = new Label("Created At");
//   	createdAtLabel.getStyleClass().add("fonts");
//   	createdAtLabel.setMinWidth(60);
//   	Label updatetimeAtLabel  = new Label("Up date time at");
//   	updatetimeAtLabel.getStyleClass().add("fonts");
//   	updatetimeAtLabel.setMinWidth(60);
//   	
//   	
//	hbox.getChildren().addAll(logoLabel,nameLabel,addressLabel,cityLabel,stateLabel,postalLabel,phoneNumberLabel
//			,createdAtLabel,updatetimeAtLabel);
//    tHeader.getChildren().addAll(hbox);
//    tHeader.setPadding(new Insets(0,0,5,15));
//     
//    //First store
//    HBox storeHBox = new HBox(50);
//    HBox storesNameHBox = new HBox(50);
//    Circle store1Circle=new Circle();
//    store1Circle.setRadius(15);
//    store1Circle.setFill(new ImagePattern(img));
//    
//    Label storeNameLabel = new Label("Name");
//	storeNameLabel.setMinWidth(60);
//	storeNameLabel.getStyleClass().add("fonts");
//	Label storeAddressLabel = new Label("Address");
//	storeAddressLabel.getStyleClass().add("fonts");
//	storeAddressLabel.setMinWidth(60);
//   	Label storeCityLabel = new Label("City");
//   	storeCityLabel.getStyleClass().add("fonts");
//   	storeCityLabel.setMinWidth(60);
//   	Label storeStateLabel = new Label("State");
//   	storeStateLabel.getStyleClass().add("fonts");
//   	storeStateLabel.setMinWidth(60);
//   	Label storePostalLabel = new Label("Postal");
//   	storePostalLabel.getStyleClass().add("fonts");
//   	storePostalLabel.setMinWidth(60);
//   	Label storePhoneNumberLabel = new Label("Phone Number");
//   	storePhoneNumberLabel.getStyleClass().add("fonts");
//   	storePhoneNumberLabel.setMinWidth(60);
//   	Label storeCreatedAtLabel = new Label("Created At");
//   	storeCreatedAtLabel.getStyleClass().add("fonts");
//   	storeCreatedAtLabel.setMinWidth(60);
//   	Label storeUpdatetimeAtLabel  = new Label("Up date time at");
//   	storeUpdatetimeAtLabel.getStyleClass().add("fonts");
//   	storeUpdatetimeAtLabel.setMinWidth(60);
//   	
//   	
//   	storesNameHBox.getChildren().addAll(storeNameLabel,storeAddressLabel,storeCityLabel,storeStateLabel,storePostalLabel
//			,storePhoneNumberLabel,storeCreatedAtLabel,storeUpdatetimeAtLabel);
//   	storeHBox.getChildren().addAll(store1Circle,storesNameHBox);
//   	storesNameHBox.setPadding(new Insets(3,0,0,30));
//   	storeHBox.setPadding(new Insets(0,0,0,15));
//
//    //Second store
//    HBox store2HBox = new HBox(50);
//    HBox stores2NameHBox = new HBox(50);
//    Circle store2Circle=new Circle();
//    store2Circle.setRadius(15);
//    store2Circle.setFill(new ImagePattern(img));
//    
//    Label store2NameLabel = new Label("Name");
//	store2NameLabel.setMinWidth(60);
//	store2NameLabel.getStyleClass().add("fonts");
//	Label store2AddressLabel = new Label("Address");
//	store2AddressLabel.getStyleClass().add("fonts");
//	store2AddressLabel.setMinWidth(60);
//   	Label store2CityLabel = new Label("City");
//   	store2CityLabel.getStyleClass().add("fonts");
//   	store2CityLabel.setMinWidth(60);
//   	Label store2StateLabel = new Label("State");
//   	store2StateLabel.getStyleClass().add("fonts");
//   	store2StateLabel.setMinWidth(60);
//   	Label store2PostalLabel = new Label("Postal");
//   	store2PostalLabel.getStyleClass().add("fonts");
//   	store2PostalLabel.setMinWidth(60);
//   	Label store2PhoneNumberLabel = new Label("Phone Number");
//   	store2PhoneNumberLabel.getStyleClass().add("fonts");
//   	store2PhoneNumberLabel.setMinWidth(60);
//   	Label store2CreatedAtLabel = new Label("Created At");
//   	store2CreatedAtLabel.getStyleClass().add("fonts");
//   	store2CreatedAtLabel.setMinWidth(60);
//   	Label store2UpdatetimeAtLabel  = new Label("Up date time at");
//   	store2UpdatetimeAtLabel.getStyleClass().add("fonts");
//   	store2UpdatetimeAtLabel.setMinWidth(60);
//   	
//   	
//   	stores2NameHBox.getChildren().addAll(store2NameLabel,store2AddressLabel,store2CityLabel,
//   			store2StateLabel,store2PostalLabel,store2PhoneNumberLabel,store2CreatedAtLabel,
//			store2UpdatetimeAtLabel);
//   	store2HBox.getChildren().addAll(store2Circle,stores2NameHBox);
//   	stores2NameHBox.setPadding(new Insets(3,0,0,30));
//   	store2HBox.setPadding(new Insets(0,0,0,15));
//
//    //Third store
//    HBox store3HBox = new HBox(50);
//    HBox stores3NameHBox = new HBox(50);
//    Circle store3Circle=new Circle();
//    store3Circle.setRadius(15);
//    store3Circle.setFill(new ImagePattern(img));
//    
//    Label store3NameLabel = new Label("Name");
//	store3NameLabel.setMinWidth(60);
//	store3NameLabel.getStyleClass().add("fonts");
//	Label store3AddressLabel = new Label("Address");
//	store3AddressLabel.getStyleClass().add("fonts");
//	store3AddressLabel.setMinWidth(60);
//   	Label store3CityLabel = new Label("City");
//   	store3CityLabel.getStyleClass().add("fonts");
//   	store3CityLabel.setMinWidth(60);
//   	Label store3StateLabel = new Label("State");
//   	store3StateLabel.getStyleClass().add("fonts");
//   	store3StateLabel.setMinWidth(60);
//   	Label store3PostalLabel = new Label("Postal");
//   	store3PostalLabel.getStyleClass().add("fonts");
//   	store3PostalLabel.setMinWidth(60);
//   	Label store3PhoneNumberLabel = new Label("Phone Number");
//   	store3PhoneNumberLabel.getStyleClass().add("fonts");
//   	store3PhoneNumberLabel.setMinWidth(60);
//   	Label store3CreatedAtLabel = new Label("Created At");
//   	store3CreatedAtLabel.getStyleClass().add("fonts");
//   	store3CreatedAtLabel.setMinWidth(60);
//   	Label store3UpdatetimeAtLabel  = new Label("Up date time at");
//   	store3UpdatetimeAtLabel.getStyleClass().add("fonts");
//   	store3UpdatetimeAtLabel.setMinWidth(60);
//   	
//   	
//   	stores3NameHBox.getChildren().addAll(store3NameLabel,store3AddressLabel,store3CityLabel,
//   			store3StateLabel,store3PostalLabel,store3PhoneNumberLabel,store3CreatedAtLabel,
//			store3UpdatetimeAtLabel);
//   	store3HBox.getChildren().addAll(store3Circle,stores3NameHBox);
//   	stores3NameHBox.setPadding(new Insets(3,0,0,30));
//   	store3HBox.setPadding(new Insets(0,0,0,15));
//
//   	store3HBox.getStyleClass().add("users");
//   	store2HBox.getStyleClass().add("users");
//   	storeHBox.getStyleClass().add("users");
//
//   	vbox.getChildren().addAll(tHeader,storeHBox,store2HBox,store3HBox);
//	vbox.setPadding(new Insets(20,20,20,20));
		TableColumn<String, Stores> photoCol = new TableColumn<>("Photo");
		photoCol.setCellValueFactory(new PropertyValueFactory("img"));
		photoCol.setPrefWidth(80);

		TableColumn<String, Stores> nameCol = new TableColumn<>("Name");
		nameCol.setCellValueFactory(new PropertyValueFactory("name"));
		nameCol.setPrefWidth(90);

		TableColumn<String, Stores> addressCol = new TableColumn<>("Address");
		addressCol.setCellValueFactory(new PropertyValueFactory("address"));
		addressCol.setPrefWidth(150);

		TableColumn<String, Stores> cityCol = new TableColumn<>("City");
		cityCol.setCellValueFactory(new PropertyValueFactory("city"));
		cityCol.setPrefWidth(100);

		TableColumn<String, Stores> stateCol = new TableColumn<>("State");
		stateCol.setCellValueFactory(new PropertyValueFactory("state"));
		stateCol.setPrefWidth(150);

		TableColumn<String, Stores> postalCol = new TableColumn<>("Postal");
		postalCol.setCellValueFactory(new PropertyValueFactory("postal"));
		postalCol.setPrefWidth(120);

		TableColumn<String, Stores> phoneNumberCol = new TableColumn<>("Phone Number");
		phoneNumberCol.setCellValueFactory(new PropertyValueFactory("phoneNumber"));
		phoneNumberCol.setPrefWidth(150);

		table.getColumns().addAll(photoCol, addressCol, nameCol, cityCol, stateCol, postalCol, phoneNumberCol);

		photoCol.getStyleClass().add("textToCenter");
		addressCol.getStyleClass().add("textToCenter");
		nameCol.getStyleClass().add("textToCenter");
		cityCol.getStyleClass().add("textToCenter");
		stateCol.getStyleClass().add("textToCenter");
		phoneNumberCol.getStyleClass().add("textToCenter");
		postalCol.getStyleClass().add("textToCenter");
//		vbox.setPadding(new Insets(62, 0, 0, 0));
		if (count == 0) {
			showStores();
			count++;
		}
		vbox.getChildren().add(table);
		getChildren().add(vbox);

	}

	public static void showStores() throws SQLException {
		List<Store> store = models.Store.getStores();

		ObservableList<Store> storeList = FXCollections.observableArrayList();

		for (int i = 0; i < store.size(); i++) {
			storeList.add(store.get(i));
		}
		table.setItems(storeList);

	}
}
