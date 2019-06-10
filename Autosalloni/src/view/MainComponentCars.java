package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class MainComponentCars {


	public static VBox display() throws IOException, SQLException {
		String current = new java.io.File(".").getCanonicalPath();

		models.Car.merriTeDhenat();
		ArrayList<models.Car> veturat = models.Car.kerret;

	       HBox hbox = new HBox(60); 
	       
	       VBox vbox= new VBox(5);
	       VBox tHeader= new VBox(10);
           vbox.getStylesheets().add(MainComponentCars.class.getResource("mainComponent.css").toExternalForm());
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
           

           
           for(int i=0 ; i<15 ; i++) {
               Circle car1Circle=new Circle();
               car1Circle.setRadius(15);
               car1Circle.setFill(new ImagePattern(img));

        	   HBox car1HBox = new HBox(60); 

        	   
           Label car1SeatsLabel = new Label(veturat.get(i).getSeats() + "");
   	       car1SeatsLabel.getStyleClass().add("fonts");
   	       car1SeatsLabel.setMinWidth(60);
   	       Label car1DoorsLabel = new Label(veturat.get(i).getDoors() + "");
   	       car1DoorsLabel.getStyleClass().add("fonts");
   	       car1DoorsLabel.setMinWidth(60);
	       Label car1AlarmLabel = new Label(veturat.get(i).isAlarm() + "");
	       car1AlarmLabel.setMinWidth(60);
	       car1AlarmLabel.getStyleClass().add("fonts");
   	       Label car1ClimateLabel = new Label(veturat.get(i).isClimate() + "");
   	       car1ClimateLabel.setMinWidth(60);
   	       car1ClimateLabel.getStyleClass().add("fonts");
   	       Label car1HidraulicLabel = new Label(veturat.get(i).isHidraulic() + "");
   	       car1HidraulicLabel.getStyleClass().add("fonts");
   	       car1HidraulicLabel.setMinWidth(80);
   	       Label car1HoursePowerLabel = new Label(veturat.get(i).getHoursePower() + "");
	       car1HoursePowerLabel.setMinWidth(90);
	       car1HoursePowerLabel.getStyleClass().add("fonts");
	       Label car1MaxspeedLabel = new Label(veturat.get(i).getMaxspeed() + "");
	       car1MaxspeedLabel.setMinWidth(60);
	       car1MaxspeedLabel.getStyleClass().add("fonts");
   	       Label car1IsAutomaticLabel = new Label(veturat.get(i).isAutomatic() + "");
   	       car1IsAutomaticLabel.getStyleClass().add("fonts");
   	       car1IsAutomaticLabel.setMinWidth(60);
   	       
	       HBox secondVBox = new HBox();
           
           car1HBox.getChildren().addAll(
        		   car1SeatsLabel,car1DoorsLabel,car1AlarmLabel
                    ,car1ClimateLabel,car1HidraulicLabel
                    ,car1HoursePowerLabel,car1MaxspeedLabel
                    ,car1IsAutomaticLabel);
	       car1HBox.getStyleClass().add("AdminSite");
	       secondVBox.getChildren().addAll(car1Circle,car1HBox);
           vbox.getChildren().addAll(secondVBox);
	       car1HBox.setPadding(new Insets(0, 0, 0, 90));
	       secondVBox.setPadding(new Insets(0, 0, 0, 20));
	       secondVBox.getStyleClass().add("backgroundColor");
           }
           

           vbox.setSpacing(5);
		vbox.setPadding(new Insets(10, 0, 0, 10));
		vbox.getStylesheets().add(MainComponentCars.class.getResource("mainComponentCars.css").toExternalForm());

		vbox.setPrefWidth(100);
		return vbox;

	}
}
