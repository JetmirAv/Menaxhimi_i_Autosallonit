package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.FileInputStream;
import java.io.IOException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Sidebar {
	
	public static VBox display(String current) throws IOException{
	
		FileInputStream dashboardPath = new FileInputStream(current + "/src/img/dashboard.png");
		FileInputStream storePath = new FileInputStream(current + "/src/img/stores.png");
		FileInputStream carPath = new FileInputStream(current + "/src/img/car.png");
		FileInputStream userPath = new FileInputStream(current + "/src/img/users.png");
		FileInputStream manufacturerPath = new FileInputStream(current + "/src/img/manufacturer.png");
		FileInputStream reportsPath = new FileInputStream(current + "/src/img/reports.png");
		FileInputStream settingsPath = new FileInputStream(current + "/src/img/settings.png");
		FileInputStream logoPath = new FileInputStream(current + "/src/img/logo.png");
		
		
		
		
		HBox hbox = new HBox();
		Image logoImg = new Image(logoPath);
		ImageView logoImgView = new ImageView(logoImg);
		logoImgView.setPreserveRatio(true);
		hbox.getChildren().add(logoImgView);
		hbox.setPrefWidth(200);
		hbox.setPrefHeight(80);
		hbox.getStyleClass().add("logoImg");
		
		Button dashboardBtn = new Button("Dashboard");
		Image dashboardImg = new Image(dashboardPath);
		ImageView dashboardView = new ImageView(dashboardImg);
		dashboardBtn.setGraphic(dashboardView);
		dashboardBtn.setPrefWidth(200);
		dashboardBtn.setPrefHeight(50);
		dashboardBtn.setAlignment(Pos.CENTER_LEFT);
		dashboardBtn.getStyleClass().add("sideBarBtn");
		
		
		
		Label librariesLbl = new Label("Libraries");
		librariesLbl.getStyleClass().add("sideBarLbl");
		
		Button storesBtn = new Button("Stores");
		Image storesImg = new Image(storePath);
		ImageView storesView = new ImageView(storesImg);
		storesBtn.setGraphic(storesView);
		storesBtn.setPrefWidth(200);
		storesBtn.setPrefHeight(50);
		storesBtn.setAlignment(Pos.CENTER_LEFT);
		storesBtn.getStyleClass().add("sideBarBtn");
		
		Button carsBtn = new Button("Cars");
		Image carImg = new Image(carPath);
		ImageView carView = new ImageView(carImg);
		carsBtn.setGraphic(carView);
		carsBtn.setPrefWidth(200);
		carsBtn.setPrefHeight(50);
		carsBtn.setAlignment(Pos.CENTER_LEFT);
		carsBtn.getStyleClass().add("sideBarBtn");
		
		
		Label clientsLbl = new Label("Clients");
		clientsLbl.getStyleClass().add("sideBarLbl");
		
		Button usersBtn = new Button("Users");
		Image usersImg = new Image(userPath);
		ImageView usersView = new ImageView(usersImg);
		usersBtn.setGraphic(usersView);
		usersBtn.setPrefWidth(200);
		usersBtn.setPrefHeight(50);
		usersBtn.setAlignment(Pos.CENTER_LEFT);
		usersBtn.getStyleClass().add("sideBarBtn");
		
		Button manufacturersBtn = new Button("Manufacturer");
		Image manufacturerImg = new Image(manufacturerPath);
		ImageView manufacturerView = new ImageView(manufacturerImg);
		manufacturersBtn.setGraphic(manufacturerView);
		manufacturersBtn.setPrefWidth(200);
		manufacturersBtn.setPrefHeight(50);
		//Per me bo align ne te majt
		manufacturersBtn.setAlignment(Pos.CENTER_LEFT);
		manufacturersBtn.getStyleClass().add("sideBarBtn");
		
		Button reportsBtn = new Button("Reports");
		Image reportsImg = new Image(reportsPath);
		ImageView reportsView = new ImageView(reportsImg);
		reportsBtn.setGraphic(reportsView);
		reportsBtn.setPrefWidth(200);
		reportsBtn.setPrefHeight(50);
		reportsBtn.setAlignment(Pos.CENTER_LEFT);
		reportsBtn.getStyleClass().add("sideBarBtn");
		
		Button settingsBtn = new Button("Settings");
		Image settingsImg = new Image(settingsPath);
		ImageView settingsView = new ImageView(settingsImg);
		settingsBtn.setGraphic(settingsView);
		settingsBtn.setPrefWidth(200);
		settingsBtn.setPrefHeight(50);
		settingsBtn.setAlignment(Pos.CENTER_LEFT);
		settingsBtn.getStyleClass().add("sideBarBtn");
		
		
		VBox menuBox = new VBox(10);
		menuBox.setStyle("-fx-background-color:#EFF0F3");
		menuBox.getChildren().addAll(dashboardBtn,librariesLbl,storesBtn,carsBtn,clientsLbl,usersBtn,manufacturersBtn,reportsBtn,settingsBtn);
		
		VBox sideBar = new VBox(30);
		sideBar.setAlignment(Pos.TOP_CENTER);
		
		//sideBar.getChildren().add(new ImageView(logoImg));
		sideBar.setPadding(new Insets(25, 5, 5, 15));
		sideBar.getChildren().addAll(logoImgView, menuBox);		
		sideBar.setStyle("-fx-background-color:#EFF0F3");
		sideBar.getStylesheets().add(Sidebar.class.getResource("sideBar.css").toExternalForm());

		
		//Responsive
		menuBox.prefWidthProperty().bind(sideBar.widthProperty().divide(20).multiply(19));
		hbox.prefWidthProperty().bind(menuBox.widthProperty());
		logoImgView.fitWidthProperty().bind(hbox.widthProperty().divide(4));
		carsBtn.prefWidthProperty().bind(menuBox.widthProperty().subtract(5));
		dashboardBtn.prefWidthProperty().bind(menuBox.widthProperty().subtract(5));
		storesBtn.prefWidthProperty().bind(menuBox.widthProperty().subtract(5));
		usersBtn.prefWidthProperty().bind(menuBox.widthProperty().subtract(5));
		manufacturersBtn.prefWidthProperty().bind(menuBox.widthProperty().subtract(5));
		settingsBtn.prefWidthProperty().bind(menuBox.widthProperty().subtract(5));
		reportsBtn.prefWidthProperty().bind(menuBox.widthProperty().subtract(5));
		
//		userHBox.prefWidthProperty().bind(header.widthProperty().divide(7));
//		userHBox.prefHeightProperty().bind(header.widthProperty());
//		userBox.prefWidthProperty().bind(userHBox.widthProperty().divide(5).multiply(4));
//		profileCir.radiusProperty().bind(userHBox.widthProperty().divide(6));
//		userFullName.scaleXProperty().bind(userBox.widthProperty().divide(100));
//		userRole.scaleXProperty().bind(userBox.widthProperty().divide(100));

		
		
		return sideBar;
	
	}

}
