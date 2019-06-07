package view;

import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.css.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Sidebar {
	public static Button dashboardBtn = new Button("_Dashboard");
	public static Button carsBtn = new Button("_Cars");
	public static Button usersBtn = new Button("_Users");
	public static Button manufacturersBtn = new Button("_Manufacturer");
	public static Button reportsBtn = new Button("_Reports");
	public static Button settingsBtn = new Button("_Settings");
	public static Button storesBtn = new Button("_Stores");
	
	public static VBox display() throws IOException{
		String current = new java.io.File( "." ).getCanonicalPath();
		
		FileInputStream dashboardPath = new FileInputStream(current + "/src/img/dashboard.png");
		FileInputStream storePath = new FileInputStream(current + "/src/img/stores.png");
		FileInputStream carPath = new FileInputStream(current + "/src/img/car.png");
		FileInputStream userPath = new FileInputStream(current + "/src/img/users.png");
		FileInputStream manufacturerPath = new FileInputStream(current + "/src/img/manufacturer.png");
		FileInputStream reportsPath = new FileInputStream(current + "/src/img/reports.png");
		FileInputStream settingsPath = new FileInputStream(current + "/src/img/settings.png");
		FileInputStream logoPath = new FileInputStream(current + "/src/img/logo.png");
		
		dashboardBtn.setOnAction(new controller.SideBarController());
		carsBtn.setOnAction(new controller.SideBarController());
		usersBtn.setOnAction(new controller.SideBarController());
		manufacturersBtn.setOnAction(new controller.SideBarController());
		settingsBtn.setOnAction(new controller.SideBarController());
		storesBtn.setOnAction(new controller.SideBarController());
		
		
		HBox hbox = new HBox();
		Image logoImg = new Image(logoPath);
		hbox.getChildren().add(new ImageView(logoImg));
		hbox.setPrefWidth(200);
		hbox.setPrefHeight(80);
		hbox.getStyleClass().add("logoImg");
		
		Image dashboardImg = new Image(dashboardPath);
		ImageView dashboardView = new ImageView(dashboardImg);
		dashboardBtn.setGraphic(dashboardView);
		dashboardBtn.setPrefWidth(200);
		dashboardBtn.setPrefHeight(50);
		dashboardBtn.setAlignment(Pos.CENTER_LEFT);
		dashboardBtn.getStyleClass().add("sideBarBtn");
		dashboardBtn.setOnMouseEntered(e -> {
			dashboardBtn.setCursor(Cursor.HAND);
			});
		
		
		
		Label librariesLbl = new Label("Libraries");
		librariesLbl.getStyleClass().add("sideBarLbl");
		
		Image storesImg = new Image(storePath);
		ImageView storesView = new ImageView(storesImg);
		storesBtn.setGraphic(storesView);
		storesBtn.setPrefWidth(200);
		storesBtn.setPrefHeight(50);
		storesBtn.setAlignment(Pos.CENTER_LEFT);
		storesBtn.getStyleClass().add("sideBarBtn");
		storesBtn.setOnMouseEntered(e -> {
			storesBtn.setCursor(Cursor.HAND);
			});
		
		Image carImg = new Image(carPath);
		ImageView carView = new ImageView(carImg);
		carsBtn.setGraphic(carView);
		carsBtn.setPrefWidth(200);
		carsBtn.setPrefHeight(50);
		carsBtn.setAlignment(Pos.CENTER_LEFT);
		carsBtn.getStyleClass().add("sideBarBtn");
		carsBtn.setOnMouseEntered(e -> {
			carsBtn.setCursor(Cursor.HAND);
			});
		
		
		Label clientsLbl = new Label("Clients");
		clientsLbl.getStyleClass().add("sideBarLbl");
		
		Image usersImg = new Image(userPath);
		ImageView usersView = new ImageView(usersImg);
		usersBtn.setGraphic(usersView);
		usersBtn.setPrefWidth(200);
		usersBtn.setPrefHeight(50);
		usersBtn.setAlignment(Pos.CENTER_LEFT);
		usersBtn.getStyleClass().add("sideBarBtn");
		usersBtn.setOnMouseEntered(e -> {
			usersBtn.setCursor(Cursor.HAND);
			});
		
		
		Image manufacturerImg = new Image(manufacturerPath);
		ImageView manufacturerView = new ImageView(manufacturerImg);
		manufacturersBtn.setGraphic(manufacturerView);
		manufacturersBtn.setPrefWidth(200);
		manufacturersBtn.setPrefHeight(50);
		//Per me bo align ne te majt
		manufacturersBtn.setAlignment(Pos.CENTER_LEFT);
		manufacturersBtn.getStyleClass().add("sideBarBtn");
		manufacturersBtn.setOnMouseEntered(e -> {
			manufacturersBtn.setCursor(Cursor.HAND);
			});
		
		
		Image reportsImg = new Image(reportsPath);
		ImageView reportsView = new ImageView(reportsImg);
		reportsBtn.setGraphic(reportsView);
		reportsBtn.setPrefWidth(200);
		reportsBtn.setPrefHeight(50);
		reportsBtn.setAlignment(Pos.CENTER_LEFT);
		reportsBtn.getStyleClass().add("sideBarBtn");
		reportsBtn.setOnMouseEntered(e -> {
			reportsBtn.setCursor(Cursor.HAND);
			});
		
		
		Image settingsImg = new Image(settingsPath);
		ImageView settingsView = new ImageView(settingsImg);
		settingsBtn.setGraphic(settingsView);
		settingsBtn.setPrefWidth(200);
		settingsBtn.setPrefHeight(50);
		settingsBtn.setAlignment(Pos.CENTER_LEFT);
		settingsBtn.getStyleClass().add("sideBarBtn");
		settingsBtn.setOnMouseEntered(e -> {
			settingsBtn.setCursor(Cursor.HAND);
			});
		
		
		
		VBox vbox = new VBox(7);
		//vbox.getChildren().add(new ImageView(logoImg));
		vbox.setPadding(new Insets(25, 5, 5, 15));
		vbox.getChildren().addAll(hbox,dashboardBtn,librariesLbl,storesBtn,carsBtn,clientsLbl,usersBtn,manufacturersBtn,reportsBtn,settingsBtn);		
		vbox.setStyle("-fx-background-color:#EFF0F3");
		vbox.getStylesheets().add(Sidebar.class.getResource("sideBar.css").toExternalForm());
		VBox sidebarVbox = new VBox();
		sidebarVbox.getChildren().addAll(vbox);
		sidebarVbox.setAlignment(Pos.CENTER_LEFT);
	
	
		return sidebarVbox;
	
	}

}
