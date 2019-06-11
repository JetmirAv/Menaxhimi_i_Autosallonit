package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controller.ShowCreateCarController;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import models.Car;
import models.Users;

public class MainComponentCars  extends VBox {
	public static VBox vbox = new VBox(5);
	public static int count = 0;


	public MainComponentCars()  throws IOException, SQLException {
		String current = new java.io.File(".").getCanonicalPath();

	       HBox hbox = new HBox(60); 
	       
	       VBox vbox= new VBox(5);
	       VBox tHeader= new VBox(10);
           vbox.getStylesheets().add(MainComponentCars.class.getResource("mainComponent.css").toExternalForm());
           vbox.getStylesheets().add(MainComponentCars.class.getResource("mainComponentCars.css").toExternalForm());

           FileInputStream userPath;
	       userPath = new FileInputStream(current + "/src/img/user.png");
           
	       Image img = new Image(userPath);
	       
	       hbox.getStyleClass().add("AdminSite");
	       
	       
	       Label logoLabel = new Label("Logo");
	       logoLabel.setMinWidth(60);
	       logoLabel.getStyleClass().add("fonts");
	       Label seatsLabel = new Label("Seats");
   	       seatsLabel.getStyleClass().add("fonts");
   	       seatsLabel.setMinWidth(60);
   	       Label doorsLabel = new Label("Doors");
   	       doorsLabel.getStyleClass().add("fonts");
   	       doorsLabel.setMinWidth(60);
	       Label alarmLabel = new Label("Alarm");
	       alarmLabel.setMinWidth(60);
	       alarmLabel.getStyleClass().add("fonts");
	       Label climateLabel = new Label("Climate");
   	       climateLabel.setMinWidth(60);
   	       climateLabel.getStyleClass().add("fonts");
	       Label hidraulicLabel = new Label("Hidraulic");
   	       hidraulicLabel.getStyleClass().add("fonts");
   	       hidraulicLabel.setMinWidth(60);
   	       Label hoursePowerLabel = new Label("Hourse Power");
	       hoursePowerLabel.setMinWidth(60);
	       hoursePowerLabel.getStyleClass().add("fonts");
	       Label maxspeedLabel = new Label("Max speed");
	       maxspeedLabel.setMinWidth(60);
	       maxspeedLabel.getStyleClass().add("fonts");
	       Label isAutomaticLabel = new Label("Is automatic");
   	       isAutomaticLabel.getStyleClass().add("fonts");
   	       isAutomaticLabel.setMinWidth(60);
   	       
   	       
	       hbox.getChildren().addAll(logoLabel,seatsLabel,doorsLabel,alarmLabel
	       		,climateLabel,hidraulicLabel,
	       		hoursePowerLabel,maxspeedLabel,isAutomaticLabel);
           tHeader.getChildren().add(hbox);
           tHeader.setPadding(new Insets(0,0,5,15));
           

    				vbox.getChildren().add(tHeader);
    				
    				List<HBox> car = Car.getCars();
    				for (int i = 0; i < car.size(); i++) {
    					vbox.getChildren().add(car.get(i));
    				}
    				Button createCar = new Button("Insert Car");
    				
    				vbox.getChildren().add(createCar);
    				createCar.setOnAction(new ShowCreateCarController());
    			
    			getChildren().add(vbox);
    			

    		}

    	}

           
