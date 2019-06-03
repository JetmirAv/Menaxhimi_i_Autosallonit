package view;


import java.io.FileInputStream;
import java.io.IOException;


import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;



public class MainComponentStores {

	public static VBox display(String current )  throws IOException {
	
	
	
	HBox hbox = new HBox(50); 
	VBox vbox= new VBox(5);
	HBox tHeader= new HBox(10);
    vbox.getStylesheets().add(MainComponentStores.class.getResource("mainComponent.css").toExternalForm());
	FileInputStream userPath;
	userPath = new FileInputStream(current + "/src/img/user.png");
    
	Image img = new Image(userPath);
	
	hbox.getStyleClass().add("AdminSite");
	
	
	
	Label logoLabel = new Label("Logo");
	logoLabel.setMinWidth(60);
	logoLabel.getStyleClass().add("fonts");
	Label nameLabel = new Label("Name");
	nameLabel.setMinWidth(60);
	nameLabel.getStyleClass().add("fonts");
	Label addressLabel = new Label("Address");
	addressLabel.getStyleClass().add("fonts");
	addressLabel.setMinWidth(60);
   	Label cityLabel = new Label("City");
   	cityLabel.getStyleClass().add("fonts");
   	cityLabel.setMinWidth(60);
   	Label stateLabel = new Label("State");
   	stateLabel.getStyleClass().add("fonts");
   	stateLabel.setMinWidth(60);
   	Label postalLabel = new Label("Postal");
   	postalLabel.getStyleClass().add("fonts");
   	postalLabel.setMinWidth(60);
   	Label phoneNumberLabel = new Label("Phone Number");
   	phoneNumberLabel.getStyleClass().add("fonts");
   	phoneNumberLabel.setMinWidth(60);
   	Label createdAtLabel = new Label("Created At");
   	createdAtLabel.getStyleClass().add("fonts");
   	createdAtLabel.setMinWidth(60);
   	Label updatetimeAtLabel  = new Label("Up date time at");
   	updatetimeAtLabel.getStyleClass().add("fonts");
   	updatetimeAtLabel.setMinWidth(60);
   	
   	
	hbox.getChildren().addAll(logoLabel,nameLabel,addressLabel,cityLabel,stateLabel,postalLabel,phoneNumberLabel
			,createdAtLabel,updatetimeAtLabel);
    tHeader.getChildren().addAll(hbox);
    tHeader.setPadding(new Insets(0,0,5,15));
     
    //First store
    HBox storeHBox = new HBox(50);
    HBox storesNameHBox = new HBox(50);
    Circle store1Circle=new Circle();
    store1Circle.setRadius(15);
    store1Circle.setFill(new ImagePattern(img));
    
    Label storeNameLabel = new Label("Name");
	storeNameLabel.setMinWidth(60);
	storeNameLabel.getStyleClass().add("fonts");
	Label storeAddressLabel = new Label("Address");
	storeAddressLabel.getStyleClass().add("fonts");
	storeAddressLabel.setMinWidth(60);
   	Label storeCityLabel = new Label("City");
   	storeCityLabel.getStyleClass().add("fonts");
   	storeCityLabel.setMinWidth(60);
   	Label storeStateLabel = new Label("State");
   	storeStateLabel.getStyleClass().add("fonts");
   	storeStateLabel.setMinWidth(60);
   	Label storePostalLabel = new Label("Postal");
   	storePostalLabel.getStyleClass().add("fonts");
   	storePostalLabel.setMinWidth(60);
   	Label storePhoneNumberLabel = new Label("Phone Number");
   	storePhoneNumberLabel.getStyleClass().add("fonts");
   	storePhoneNumberLabel.setMinWidth(60);
   	Label storeCreatedAtLabel = new Label("Created At");
   	storeCreatedAtLabel.getStyleClass().add("fonts");
   	storeCreatedAtLabel.setMinWidth(60);
   	Label storeUpdatetimeAtLabel  = new Label("Up date time at");
   	storeUpdatetimeAtLabel.getStyleClass().add("fonts");
   	storeUpdatetimeAtLabel.setMinWidth(60);
   	
   	
   	storesNameHBox.getChildren().addAll(storeNameLabel,storeAddressLabel,storeCityLabel,storeStateLabel,storePostalLabel
			,storePhoneNumberLabel,storeCreatedAtLabel,storeUpdatetimeAtLabel);
   	storeHBox.getChildren().addAll(store1Circle,storesNameHBox);
   	storesNameHBox.setPadding(new Insets(3,0,0,30));
   	storeHBox.setPadding(new Insets(0,0,0,15));

    //Second store
    HBox store2HBox = new HBox(50);
    HBox stores2NameHBox = new HBox(50);
    Circle store2Circle=new Circle();
    store2Circle.setRadius(15);
    store2Circle.setFill(new ImagePattern(img));
    
    Label store2NameLabel = new Label("Name");
	store2NameLabel.setMinWidth(60);
	store2NameLabel.getStyleClass().add("fonts");
	Label store2AddressLabel = new Label("Address");
	store2AddressLabel.getStyleClass().add("fonts");
	store2AddressLabel.setMinWidth(60);
   	Label store2CityLabel = new Label("City");
   	store2CityLabel.getStyleClass().add("fonts");
   	store2CityLabel.setMinWidth(60);
   	Label store2StateLabel = new Label("State");
   	store2StateLabel.getStyleClass().add("fonts");
   	store2StateLabel.setMinWidth(60);
   	Label store2PostalLabel = new Label("Postal");
   	store2PostalLabel.getStyleClass().add("fonts");
   	store2PostalLabel.setMinWidth(60);
   	Label store2PhoneNumberLabel = new Label("Phone Number");
   	store2PhoneNumberLabel.getStyleClass().add("fonts");
   	store2PhoneNumberLabel.setMinWidth(60);
   	Label store2CreatedAtLabel = new Label("Created At");
   	store2CreatedAtLabel.getStyleClass().add("fonts");
   	store2CreatedAtLabel.setMinWidth(60);
   	Label store2UpdatetimeAtLabel  = new Label("Up date time at");
   	store2UpdatetimeAtLabel.getStyleClass().add("fonts");
   	store2UpdatetimeAtLabel.setMinWidth(60);
   	
   	
   	stores2NameHBox.getChildren().addAll(store2NameLabel,store2AddressLabel,store2CityLabel,
   			store2StateLabel,store2PostalLabel,store2PhoneNumberLabel,store2CreatedAtLabel,
			store2UpdatetimeAtLabel);
   	store2HBox.getChildren().addAll(store2Circle,stores2NameHBox);
   	stores2NameHBox.setPadding(new Insets(3,0,0,30));
   	store2HBox.setPadding(new Insets(0,0,0,15));

    //Third store
    HBox store3HBox = new HBox(50);
    HBox stores3NameHBox = new HBox(50);
    Circle store3Circle=new Circle();
    store3Circle.setRadius(15);
    store3Circle.setFill(new ImagePattern(img));
    
    Label store3NameLabel = new Label("Name");
	store3NameLabel.setMinWidth(60);
	store3NameLabel.getStyleClass().add("fonts");
	Label store3AddressLabel = new Label("Address");
	store3AddressLabel.getStyleClass().add("fonts");
	store3AddressLabel.setMinWidth(60);
   	Label store3CityLabel = new Label("City");
   	store3CityLabel.getStyleClass().add("fonts");
   	store3CityLabel.setMinWidth(60);
   	Label store3StateLabel = new Label("State");
   	store3StateLabel.getStyleClass().add("fonts");
   	store3StateLabel.setMinWidth(60);
   	Label store3PostalLabel = new Label("Postal");
   	store3PostalLabel.getStyleClass().add("fonts");
   	store3PostalLabel.setMinWidth(60);
   	Label store3PhoneNumberLabel = new Label("Phone Number");
   	store3PhoneNumberLabel.getStyleClass().add("fonts");
   	store3PhoneNumberLabel.setMinWidth(60);
   	Label store3CreatedAtLabel = new Label("Created At");
   	store3CreatedAtLabel.getStyleClass().add("fonts");
   	store3CreatedAtLabel.setMinWidth(60);
   	Label store3UpdatetimeAtLabel  = new Label("Up date time at");
   	store3UpdatetimeAtLabel.getStyleClass().add("fonts");
   	store3UpdatetimeAtLabel.setMinWidth(60);
   	
   	
   	stores3NameHBox.getChildren().addAll(store3NameLabel,store3AddressLabel,store3CityLabel,
   			store3StateLabel,store3PostalLabel,store3PhoneNumberLabel,store3CreatedAtLabel,
			store3UpdatetimeAtLabel);
   	store3HBox.getChildren().addAll(store3Circle,stores3NameHBox);
   	stores3NameHBox.setPadding(new Insets(3,0,0,30));
   	store3HBox.setPadding(new Insets(0,0,0,15));

   	store3HBox.getStyleClass().add("users");
   	store2HBox.getStyleClass().add("users");
   	storeHBox.getStyleClass().add("users");

   	vbox.getChildren().addAll(tHeader,storeHBox,store2HBox,store3HBox);
	vbox.setPadding(new Insets(20,20,20,20));
	vbox.getStyleClass().add("mainContent");
	return vbox; 
	
	}
	    	

}