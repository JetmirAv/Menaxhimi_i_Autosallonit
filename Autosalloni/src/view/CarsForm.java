package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class CarsForm {
	public static VBox display(String current )  throws IOException, SQLException {
	    
		VBox vbox=new VBox();
		vbox.getStylesheets().add(MainComponent.class.getResource("CarsForm.css").toExternalForm());

		
		HBox  photoHBox= new HBox();
		
		FileInputStream userPath;
		userPath = new FileInputStream(current + "/src/img/user.png");
	    
		Image img = new Image(userPath);
		
	    Circle store1Circle=new Circle();
	    store1Circle.setRadius(50);
	    store1Circle.setFill(new ImagePattern(img));
	    
	    photoHBox.getChildren().add(store1Circle);
	    photoHBox.getStyleClass().add("photoToCenter");
        photoHBox.setPadding(new Insets(20,0,0,0));
	    
        //First Row        
	    Label manufacturerIdLabel = new Label("Manufacturer Id");
	    manufacturerIdLabel.setMinWidth(60);
        String manufacturers[] = { "Aston-Martin","Audi","Bugatti","Chevrolet","Ford","Geely","Infiniti","Jeep" };
        ComboBox manufacturerComboBox =  new ComboBox(FXCollections.observableArrayList(manufacturers));
        
        
	    Label storeNameLabel = new Label("Model");
		storeNameLabel.setMinWidth(60);
        TextField txtForModel= new TextField();
		

	    Label bodyNumberLabel = new Label("Body Number");
		storeNameLabel.setMinWidth(60);
        TextField txtForbodyNumber= new TextField();

	    Label yearOfProdLabel= new Label("Year of Production");
	    manufacturerIdLabel.setMinWidth(60);
        String years[] = { "2000","2001","2002","2003","2004","2005","2006","2007","2008","2009"
        		,"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019" };
        ComboBox yearOfProdComboBox =  new ComboBox(FXCollections.observableArrayList(years));

        //Second row 
        Label seatsLabel= new Label("Seats");
	    manufacturerIdLabel.setMinWidth(60);
        String seats[] = { "2","4","6"};
        ComboBox seatsComboBox =  new ComboBox(FXCollections.observableArrayList(seats));
        
	    Label doorsLabel= new Label("Seats");
	    manufacturerIdLabel.setMinWidth(60);
        String doors[] = { "2","4"};
        ComboBox doorsComboBox =  new ComboBox(FXCollections.observableArrayList(doors));
        
	    Label roofLabel= new Label("Roof");
	    manufacturerIdLabel.setMinWidth(60);
        String roof[] = { "true","false"};
        ComboBox roofComboBox =  new ComboBox(FXCollections.observableArrayList(roof));
        
	    Label alarmLabel= new Label("Alarm");
	    manufacturerIdLabel.setMinWidth(60);
        String alarm[] = { "true","false"};
        ComboBox alarmComboBox =  new ComboBox(FXCollections.observableArrayList(alarm));

	    Label centralLabel= new Label("Central");
	    manufacturerIdLabel.setMinWidth(60);
        String central[] = { "true","false"};
        ComboBox centralComboBox =  new ComboBox(FXCollections.observableArrayList(central));

	    Label airbagLabel= new Label("Airbag");
	    manufacturerIdLabel.setMinWidth(60);
        String airbag[] = { "true","false"};
        ComboBox airbagComboBox =  new ComboBox(FXCollections.observableArrayList(airbag));


        //Third Row
	    Label autonomusLabel= new Label("Autonomus");
	    autonomusLabel.setMinWidth(60);
        String autonomus[] = { "true","false"};
        ComboBox autonomusComboBox =  new ComboBox(FXCollections.observableArrayList(autonomus));

	    Label navigatorLabel= new Label("Navigator");
	    navigatorLabel.setMinWidth(60);
        String navigator[] = { "true","false"};
        ComboBox navigatorComboBox =  new ComboBox(FXCollections.observableArrayList(navigator));

	    Label climateLabel= new Label("Climate");
	    climateLabel.setMinWidth(60);
        String climate[] = { "true","false"};
        ComboBox climateComboBox =  new ComboBox(FXCollections.observableArrayList(climate));
        
	    Label fuelTypeIdLabel= new Label("Fuel TypeId");
	    fuelTypeIdLabel.setMinWidth(60);
        String fuelTypeId[] = { "Gasoline","Diesel","Natural gas","Hydrogen","Biodiesel"};
        ComboBox fuelTypeIdComboBox =  new ComboBox(FXCollections.observableArrayList(fuelTypeId));


        
        Label fuelCapacityLabel= new Label("Fuel capacity");
	    climateLabel.setMinWidth(60);        
        Spinner<Integer> fuelCapacity = new Spinner<>(0, 300, 0, 1);
        
        Label fuelConsumptionLabel= new Label("Fuel consumption");
        fuelConsumptionLabel.setMinWidth(60);        
        Spinner<Integer> fuelConsumption = new Spinner<>(0, 300, 0, 1);//min , max , start , increase
        
        //Fourth Row
	    Label hidraulicLabel= new Label("Hidraulic");
	    climateLabel.setMinWidth(60);
        String hidraulic[] = { "true","false"};
        ComboBox hidraulicComboBox =  new ComboBox(FXCollections.observableArrayList(hidraulic));
        
	    Label engineModelLabel = new Label("Engine Model");
	    engineModelLabel.setMinWidth(60);
        TextField engineModel= new TextField();

        Label enginePowerLabel= new Label("Engine Power");
        enginePowerLabel.setMinWidth(60);        
        Spinner<Integer> enginePower= new Spinner<>(0, 300, 0, 1);

        Label hoursePowerLabel= new Label("Fuel capacity");
        hoursePowerLabel.setMinWidth(60);        
        Spinner<Integer> hoursePowerCapacity = new Spinner<>(0, 300, 0, 1);

        Label maxspeedLabel= new Label("Max speed");
        maxspeedLabel.setMinWidth(60);        
        Spinner<Integer> maxspeed= new Spinner<>(0, 350, 0, 1);

        Label seconds0to100Label= new Label("Seconds 0 to 100");
        seconds0to100Label.setMinWidth(60);        
        Spinner<Integer> seconds0to100= new Spinner<>(0, 300, 0, 1);
        
        //fifth row
	    Label isAutomaticLabel= new Label("Is Automatic");
	    isAutomaticLabel.setMinWidth(60);
        String isAutomatic[] = { "true","false"};
        ComboBox isAutomaticComboBox =  new ComboBox(FXCollections.observableArrayList(isAutomatic));

        Label gearsLabel= new Label("Gears");
        gearsLabel.setMinWidth(60);        
        Spinner<Integer> gears= new Spinner<>(4, 7, 4, 1);

	    Label tireModelLabel= new Label("Tire model");
	    tireModelLabel.setMinWidth(60);
        String tireModel[] = { "summer","winter"};
        ComboBox tireModelComboBox =  new ComboBox(FXCollections.observableArrayList(tireModel));

	    Label tireSizeLabel = new Label("Tire size");
	    engineModelLabel.setMinWidth(60);
        TextField tireSize= new TextField();

	    Label additionalDescLabel = new Label("Additional description");
	    additionalDescLabel.setMinWidth(60);
        TextField additionalDesc= new TextField();

	    Label is4x4Label= new Label("Is 4x4");
	    is4x4Label.setMinWidth(60);
        String is4x4[] = { "true","false"};
        ComboBox is4x4ComboBox =  new ComboBox(FXCollections.observableArrayList(is4x4));

        
        GridPane carsData= new GridPane();
        carsData.setVgap(10);
        carsData.setHgap(70);
        carsData.setPadding(new Insets(20,0,0,20));

        GridPane secondCarsData= new GridPane();
        secondCarsData.setVgap(10);
        secondCarsData.setHgap(60);
        secondCarsData.setPadding(new Insets(20,0,0,20));

        //first row
        carsData.add(manufacturerIdLabel , 0,0);
        carsData.add(storeNameLabel , 1,0);
        carsData.add(bodyNumberLabel , 2,0);
        carsData.add(yearOfProdLabel , 3,0);

      //second row
        carsData.add(manufacturerComboBox, 0, 1);       
        carsData.add(txtForModel, 1, 1);       
        carsData.add(txtForbodyNumber, 2, 1);       
        carsData.add(yearOfProdComboBox, 3, 1);       

        manufacturerComboBox.setPrefWidth(124);
        txtForModel.setPrefWidth(124);
        txtForbodyNumber.setPrefWidth(124);
        yearOfProdComboBox.setPrefWidth(124);

        manufacturerComboBox.getSelectionModel().selectFirst();
        yearOfProdComboBox.getSelectionModel().selectFirst();

        
      //third row
        secondCarsData.add(seatsLabel , 0,2);
        secondCarsData.add(doorsLabel , 1,2);
        secondCarsData.add(roofLabel , 2,2);
        secondCarsData.add(alarmLabel , 3,2);
        secondCarsData.add(centralLabel , 4,2);
        secondCarsData.add(airbagLabel , 5,2);

      //fourth row
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

      //fifth row
        secondCarsData.add(autonomusLabel , 0,4);
        secondCarsData.add(navigatorLabel , 1,4);
        secondCarsData.add(climateLabel , 2,4);
        secondCarsData.add(fuelTypeIdLabel , 3,4);
        secondCarsData.add(fuelCapacityLabel , 4,4);
        secondCarsData.add(fuelConsumptionLabel , 5,4);

      //sixth row
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

        
        //seventh row
        secondCarsData.add(hidraulicLabel , 0,6);
        secondCarsData.add(engineModelLabel , 1,6);
        secondCarsData.add(enginePowerLabel , 2,6);
        secondCarsData.add(hoursePowerLabel , 3,6);
        secondCarsData.add(maxspeedLabel , 4,6);
        secondCarsData.add(seconds0to100Label , 5,6);

      //eighth row
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

        
        //nineth row
        secondCarsData.add(isAutomaticLabel , 0,8);
        secondCarsData.add(gearsLabel , 1,8);
        secondCarsData.add(tireModelLabel , 2,8);
        secondCarsData.add(tireSizeLabel , 3,8);
        secondCarsData.add(additionalDescLabel , 4,8);
        secondCarsData.add(is4x4Label , 5,8);

      //tenth row
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
		btnHbox.setPadding(new Insets(50,0,0,0));
		btnHbox.setAlignment(Pos.CENTER);
		carsData.setAlignment(Pos.CENTER);
		vbox.setPadding(new Insets(0,30,0,30));		
		
		
		
		vbox.getChildren().addAll(photoHBox,carsData,secondCarsData,btnHbox);
		return vbox;
		
	}
}
