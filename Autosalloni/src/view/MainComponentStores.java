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
	public static int count = 0;
	public static VBox formatVbox = new VBox();
	
	public MainComponentStores() throws SQLException, IOException {
		String current = new java.io.File(".").getCanonicalPath();

		HBox hbox = new HBox(50);
		VBox vbox = new VBox(5);
		
		vbox.getStylesheets().add(MainComponentStores.class.getResource("mainComponent.css").toExternalForm());
		FileInputStream userPath;
		userPath = new FileInputStream(current + "/src/img/user.png");

		Image img = new Image(userPath);

		hbox.getStyleClass().add("AdminSite");

		// Ktu ja nisi une

		HBox headerBox = new HBox();
		headerBox.setAlignment(Pos.CENTER);
		headerBox.setPrefHeight(20);
		Label lblName = new Label("Name");
		Label lblAddress = new Label("Address");
		Label lblCity = new Label("City");
		Label lblState = new Label("State");
		Label lblPostal = new Label("Postal");
		Label lblPhone = new Label("Phone Number");

		lblName.getStyleClass().add("userHeaderLabel");
		lblAddress.getStyleClass().add("userHeaderLabel");
		lblPhone.getStyleClass().add("userHeaderLabel");
		lblCity.getStyleClass().add("userHeaderLabel");
		lblState.getStyleClass().add("userHeaderLabel");
		lblPostal.getStyleClass().add("userHeaderLabel");

		lblName.setPrefWidth(120);
		lblAddress.setPrefWidth(230);
		lblPhone.setPrefWidth(180);
		lblCity.setPrefWidth(120);
		lblState.setPrefWidth(120);
		lblPostal.setPrefWidth(90);

		if(count == 0) {
			headerBox.getChildren().addAll(lblName, lblAddress, lblPhone, lblPostal, lblCity, lblState);
			vbox.getChildren().add(headerBox);
			
			List<HBox> stores = Store.getStores();
			for (int i = 0; i < stores.size(); i++) {
				vbox.getChildren().add(stores.get(i));
			}
			
			Button createStore = new Button("Create Store");
			createStore.setOnAction(new controller.ShowStoreCreateController());
			createStore.getStyleClass().add("updateBtn");
			createStore.getStyleClass().add("btnFormat");
			createStore.setTranslateX(360);
			
			vbox.getChildren().add(createStore);
			formatVbox.getChildren().add(vbox);
			formatVbox.setPadding(new Insets(0, 120, 0, 120));
			count++;			
		}
		
		getChildren().add(formatVbox);

	}

}
