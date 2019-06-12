package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controller.ShowCreateCarController;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import models.Car;
import models.Users;




public class MainComponentCars extends VBox {
	public static VBox vbox = new VBox(5);
	public static int count = 0;
	public static Button showMore = I18N.getButton("showMore");
	public static int carOffset = 0;


	public MainComponentCars() throws IOException, SQLException {
		String current = new java.io.File(".").getCanonicalPath();
		HBox buttonPane = new HBox();
		HBox showMorePane = new HBox();
		HBox hbox = new HBox(60);
		Button createCar= I18N.getButton("create");
		
//		vbox.getChildren().add(createCar);
		VBox vboxWithSCroll = new VBox();


		VBox tHeader = new VBox(10);
		vbox.getStylesheets().add(MainComponentCars.class.getResource("mainComponent.css").toExternalForm());
		vbox.getStylesheets().add(MainComponentCars.class.getResource("mainComponentCars.css").toExternalForm());
		vbox.getStylesheets().add(MainComponentCars.class.getResource("header.css").toExternalForm());

		FileInputStream userPath;
		userPath = new FileInputStream(current + "/src/img/user.png");

		Image img = new Image(userPath);

		hbox.getStyleClass().add("AdminSite");

		Label logoLabel = I18N.getLabel("logo");
		logoLabel.setMinWidth(60);
		logoLabel.getStyleClass().add("fonts");
		Label seatsLabel = I18N.getLabel("seatsC");
		seatsLabel.getStyleClass().add("fonts");
		seatsLabel.setMinWidth(60);
		Label doorsLabel = I18N.getLabel("doorsC");
		doorsLabel.getStyleClass().add("fonts");
		doorsLabel.setMinWidth(60);
		Label alarmLabel = I18N.getLabel("alarmC");
		alarmLabel.setMinWidth(60);
		alarmLabel.getStyleClass().add("fonts");
		Label climateLabel = I18N.getLabel("climateC");
		climateLabel.setMinWidth(60);
		climateLabel.getStyleClass().add("fonts");
		Label hidraulicLabel = I18N.getLabel("hidraulicC");
		hidraulicLabel.getStyleClass().add("fonts");
		hidraulicLabel.setMinWidth(60);
		Label hoursePowerLabel = I18N.getLabel("hoursePowerC");
		hoursePowerLabel.setMinWidth(60);
		hoursePowerLabel.getStyleClass().add("fonts");
		Label maxspeedLabel = I18N.getLabel("maxSpeedC");
		maxspeedLabel.setMinWidth(60);
		maxspeedLabel.getStyleClass().add("fonts");
		Label isAutomaticLabel = I18N.getLabel("isAutomaticC");
		isAutomaticLabel.getStyleClass().add("fonts");
		isAutomaticLabel.setMinWidth(60);

		logoLabel.getStyleClass().add("storeData");
		seatsLabel.getStyleClass().add("storeData");
		doorsLabel.getStyleClass().add("storeData");
		alarmLabel.getStyleClass().add("storeData");
		climateLabel.getStyleClass().add("storeData");
		hoursePowerLabel.getStyleClass().add("storeData");
		maxspeedLabel.getStyleClass().add("storeData");
		isAutomaticLabel.getStyleClass().add("storeData");

		hbox.getChildren().addAll(logoLabel, seatsLabel, doorsLabel, alarmLabel, climateLabel, hidraulicLabel,
				hoursePowerLabel, maxspeedLabel, isAutomaticLabel);
		tHeader.getChildren().add(hbox);
		tHeader.setPadding(new Insets(0, 0, 5, 0));

	//	vbox.getChildren().add(tHeader);
		if(count == 0) {
			List<HBox> car = Car.getCars();
			for (int i = 0; i < car.size(); i++) {
				vbox.getChildren().add(car.get(i));
			}	
			count++;
		}
		buttonPane.getChildren().add(createCar);
		createCar.setTranslateY(5);
		vboxWithSCroll.getChildren().addAll(tHeader,vbox);
		createCar.getStyleClass().addAll("updateBtn");
		createCar.getStyleClass().addAll("btnFormat");
		showMore.getStyleClass().add("updateBtn");
		showMore.getStyleClass().add("btnFormat");
		showMore.setTranslateX(500);
		showMore.setPrefWidth(100);
		buttonPane.setPadding(new Insets(0,0,20,5));
		showMore.setOnAction(new controller.ShowMoreCarsController());
		buttonPane.setTranslateY(0);
		showMorePane.getChildren().add(showMore);
		showMorePane.setPadding(new Insets(15,0,0,0));
		createCar.setOnAction(new ShowCreateCarController());
		ScrollPane s = new ScrollPane(vbox);  
			

        s.setStyle(" -fx-background-color:transparent;");
        s.setBorder(null);
 		getChildren().addAll(buttonPane,tHeader,vbox,s,showMorePane);

	}

}
