package view;

import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

import javafx.css.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Sidebar extends VBox {
	public static Button dashboardBtn = I18N.getButton("dashboardSB");
	public static Button carsBtn = I18N.getButton("carsSB");
	public static Button usersBtn = I18N.getButton("usersSB");
	public static Button reportsBtn = I18N.getButton("reportsSB");
	public static Button profileBtn = I18N.getButton("profileSB");
	public static Button storesBtn = I18N.getButton("storeSB");
	public static ComboBox<String> languagesCbo = new ComboBox<>();
	
	
	public Sidebar() throws IOException {
		String current = new java.io.File( "." ).getCanonicalPath();
		
		
		languagesCbo.getItems().addAll(Main.allowedLanguages);
		languagesCbo.setValue(I18N.getDefaultLocale().getLanguage());
		languagesCbo.setOnAction(e -> switchLanguage());
		
		FileInputStream dashboardPath = new FileInputStream(current + "/src/img/dashboard.png");
		FileInputStream storePath = new FileInputStream(current + "/src/img/stores.png");
		FileInputStream carPath = new FileInputStream(current + "/src/img/car.png");
		FileInputStream userPath = new FileInputStream(current + "/src/img/users.png");
		FileInputStream manufacturerPath = new FileInputStream(current + "/src/img/manufacturer.png");
		FileInputStream reportsPath = new FileInputStream(current + "/src/img/reports.png");
		FileInputStream settingsPath = new FileInputStream(current + "/src/img/settings.png");
		
		
		dashboardBtn.setOnAction(new controller.SideBarController());
		carsBtn.setOnAction(new controller.SideBarController());
		usersBtn.setOnAction(new controller.SideBarController());
		profileBtn.setOnAction(new controller.SideBarController());
		storesBtn.setOnAction(new controller.SideBarController());
		
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
		profileBtn.setGraphic(settingsView);
		profileBtn.setPrefWidth(200);
		profileBtn.setPrefHeight(50);
		profileBtn.setAlignment(Pos.CENTER_LEFT);
		profileBtn.getStyleClass().add("sideBarBtn");
		profileBtn.setOnMouseEntered(e -> {
			profileBtn.setCursor(Cursor.HAND);
			});
		
		
		
		VBox vbox = new VBox(7);
		vbox.setPadding(new Insets(25, 5, 5, 15));
		vbox.getChildren().addAll(dashboardBtn,librariesLbl,storesBtn,carsBtn,clientsLbl,usersBtn,reportsBtn,profileBtn,languagesCbo);		
		
		
		VBox sidebarVbox = new VBox();
		sidebarVbox.getStylesheets().add(Sidebar.class.getResource("sideBar.css").toExternalForm());
		sidebarVbox.getStyleClass().add("sidebar");
		sidebarVbox.getChildren().addAll(vbox);
	
	
		getChildren().add(sidebarVbox);
	}
	public static void switchLanguage() {
		I18N.setLocale(new Locale(languagesCbo.getValue()));
	}
	
}
