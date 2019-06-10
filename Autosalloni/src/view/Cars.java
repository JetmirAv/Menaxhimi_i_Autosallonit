package view;

import models.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Cars {

	public static FlowPane display() throws IOException, SQLException {
 
		
		String current = new java.io.File(".").getCanonicalPath();
		models.Car.merriTeDhenat();
		ArrayList<models.Car> veturat = models.Car.kerret;
		
	


		// Declare Photos

		FlowPane mainPane = new FlowPane(10, 10);
		mainPane.setOrientation(Orientation.HORIZONTAL);
		mainPane.setPadding(new Insets(30));
		
		FileInputStream carPhoto, iconFuels, gearsPhoto, wheelPhoto, searchIcon;
		carPhoto = new FileInputStream(current + "/src/img/car1.png");
		iconFuels = new FileInputStream(current + "/src/img/iconFuels.png");
		gearsPhoto = new FileInputStream(current + "/src/img/gears.png");
		wheelPhoto = new FileInputStream(current + "/src/img/wheel.png");
		searchIcon = new FileInputStream(current + "/src/img/search.png");

		// Object of icons
		Image carObj = new Image(carPhoto);
		Image iconFuelsObj = new Image(iconFuels);
		Image gearsPhotoObj = new Image(gearsPhoto);
		Image wheelPhotoObj = new Image(wheelPhoto);
		Image iconForSearch = new Image(searchIcon);

		


		
		HBox paneFirstRow = new HBox(23);
		paneFirstRow.setPadding(new Insets(0, 0, 0, 23));
		paneFirstRow.setAlignment(Pos.CENTER);

		      for (int i = 54; i < 60; i++) {
			  
		    	  // Photo
			    ImageView image = new ImageView(carObj);
			     
			
			
			    VBox contanier = new VBox(15);
			    contanier.setStyle("-fx-background-color: grey");
			
			
			   // Inside the First Photo
			
			
		     	VBox VboxComplete = new VBox();
			    VboxComplete.setId(veturat.get(i).getId() + "");
			    
			    VboxComplete.setOnMouseClicked(e -> {
			    	
//			    ArrayList<Car> car = new ArrayList<>();	
			 	String str = e.getSource().toString();
				int id = helpers.helpers.returnId(str);
				
					Car car = null;
					try {
						car = models.Car.getAllDetailsOfCar(id);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						Main.mainWindow.setCenter(CarsDetails.display(car));
					} catch (IOException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			});
			
			GridPane detailsCar = new GridPane();
			detailsCar.setPadding(new Insets(10, 10, 10, 10));
			detailsCar.setVgap(25);
			detailsCar.setHgap(17);

			
			// Model Of the Car 
			Label modelOfCar = new Label("Car Model");
			modelOfCar.setFont(Font.font("Arial", FontWeight.BOLD, 15));
			detailsCar.getStyleClass().add("firstContent");
			detailsCar.setConstraints(modelOfCar, 0, 0); 
  
			
			HBox hboxForFirstDetail  = new HBox(7);
			Image iconFuelImg = new Image(iconFuels);
			ImageView iconLabel = new ImageView(iconFuelsObj);
			VBox vbForFirstDetail = new VBox();
			Label modelFromDatabase =  new Label(veturat.get(i).getModel());
			modelFromDatabase.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
			Label Model = new Label("Model");
			vbForFirstDetail.getChildren().addAll(Model, modelFromDatabase);
			hboxForFirstDetail.getChildren().addAll(iconLabel, vbForFirstDetail);
			detailsCar.setConstraints(hboxForFirstDetail, 0, 1);

			
			HBox hboxForSecondDetail = new HBox(7);
			ImageView gearsIcon = new ImageView(gearsPhotoObj);
			VBox vbForSecondDetail = new VBox();
			Label bodyNumberFromDatabase = new Label(veturat.get(i).getBodyNumber());
			bodyNumberFromDatabase.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
			Label bodyNumber = new Label("body");
			vbForSecondDetail.getChildren().addAll(bodyNumber, bodyNumberFromDatabase);
			hboxForSecondDetail.getChildren().addAll(gearsIcon, vbForSecondDetail);
			detailsCar.setConstraints(hboxForSecondDetail, 1, 1);

			
			HBox hboxForThirdDetail = new HBox(7);
			ImageView wheelIcon = new ImageView(wheelPhotoObj);
			VBox vbForThirdDetail = new VBox();
			Label endineModelFromDatabase = new Label(veturat.get(i).getEngineModel());
			endineModelFromDatabase.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
			Label engine = new Label("Engine");
			vbForThirdDetail.getChildren().addAll(engine, endineModelFromDatabase);
			hboxForThirdDetail.getChildren().addAll(wheelIcon, vbForThirdDetail);
			detailsCar.setConstraints(hboxForThirdDetail, 0, 2);

			// Details
			
			Label details = new Label("View details");
			detailsCar.setConstraints(details, 1, 2);
			detailsCar.getChildren().addAll(modelOfCar, hboxForFirstDetail, hboxForSecondDetail, hboxForThirdDetail, details);
			VboxComplete.getChildren().addAll(image, detailsCar);
			contanier.getChildren().addAll(VboxComplete);
			mainPane.getChildren().addAll(contanier);

		}

		
		paneFirstRow.getStylesheets().add(Header.class.getResource("cars.css").toExternalForm());

		return mainPane;
	}
}
