package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Stores {

	public static FlowPane display() throws IOException, SQLException {
		String current = new java.io.File(".").getCanonicalPath();

		models.Store.getDetailsOfStores();
		ArrayList<String> nameOfStorage = models.Store.nameA;
		ArrayList<String> cityOfStorage = models.Store.cityA;
		ArrayList<String> stateOfStorage = models.Store.stateA;

		// Declare Photos

		FlowPane mainPane = new FlowPane(10, 10);
		mainPane.setOrientation(Orientation.HORIZONTAL);
		mainPane.setPadding(new Insets(30));

		FileInputStream storePhoto, cityPhoto, postalPhoto, routePhoto;
		storePhoto = new FileInputStream(current + "/src/img/warehouse.png");
		cityPhoto = new FileInputStream(current + "/src/img/city.png");
		postalPhoto = new FileInputStream(current + "/src/img/postal.png");
		routePhoto = new FileInputStream(current + "/src/img/route.png");

		// Object of icons
		Image storeObj = new Image(storePhoto);
		Image cityObj = new Image(cityPhoto);
		Image postalObj = new Image(postalPhoto);
		Image routeObj = new Image(routePhoto);

		HBox paneFirstRow = new HBox(23);
		paneFirstRow.setPadding(new Insets(0, 0, 0, 23));
		paneFirstRow.setAlignment(Pos.CENTER);

		for (int i = 0; i < nameOfStorage.size(); i++) {

			// Photo
			ImageView image = new ImageView(storeObj);

			VBox contanier = new VBox(15);
			contanier.setStyle("-fx-background-color: grey");

			// Inside the First Photo

			VBox VboxComplete = new VBox();
			GridPane detailsCar = new GridPane();
			detailsCar.setPadding(new Insets(10, 10, 10, 10));
			detailsCar.setVgap(25);
			detailsCar.setHgap(17);

			Label modelOfCar = new Label("Store Details");
			modelOfCar.setFont(Font.font("Arial", FontWeight.BOLD, 15));
			detailsCar.getStyleClass().add("firstContent");
			detailsCar.setConstraints(modelOfCar, 0, 0);

			HBox hboxForFirstDetail = new HBox(7);
			Image storePhotoImg = new Image(storePhoto);
			ImageView iconLabel = new ImageView(cityObj);
			VBox vbForFirstDetail = new VBox();
			Label nameFromDatabase = new Label(nameOfStorage.get(i));
			nameFromDatabase.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
			Label name = new Label("Name");
			vbForFirstDetail.getChildren().addAll(name, nameFromDatabase);
			hboxForFirstDetail.getChildren().addAll(iconLabel, vbForFirstDetail);
			detailsCar.setConstraints(hboxForFirstDetail, 0, 1);

			HBox hboxForSecondDetail = new HBox(7);
			ImageView gearsIcon = new ImageView(cityObj);
			VBox vbForSecondDetail = new VBox();
			Label cityOfStorageFromDatabase = new Label(cityOfStorage.get(i));
			cityOfStorageFromDatabase.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
			Label city = new Label("City");
			vbForSecondDetail.getChildren().addAll(city, cityOfStorageFromDatabase);
			hboxForSecondDetail.getChildren().addAll(gearsIcon, vbForSecondDetail);
			detailsCar.setConstraints(hboxForSecondDetail, 1, 1);

			HBox hboxForThirdDetail = new HBox(7);
			ImageView wheelIcon = new ImageView(postalObj);
			VBox vbForThirdDetail = new VBox();
			Label stateOfStorageFromDatabase = new Label(stateOfStorage.get(i));
			stateOfStorageFromDatabase.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
			Label engine = new Label("State");
			vbForThirdDetail.getChildren().addAll(engine, stateOfStorageFromDatabase);
			hboxForThirdDetail.getChildren().addAll(wheelIcon, vbForThirdDetail);
			detailsCar.setConstraints(hboxForThirdDetail, 0, 2);

			// Details

			Label details = new Label("View details");
			detailsCar.setConstraints(details, 1, 2);
			detailsCar.getChildren().addAll(modelOfCar, hboxForFirstDetail, hboxForSecondDetail, hboxForThirdDetail,
					details);
			VboxComplete.getChildren().addAll(image, detailsCar);
			contanier.getChildren().addAll(VboxComplete);
			mainPane.getChildren().addAll(contanier);

		}

		paneFirstRow.getStylesheets().add(Header.class.getResource("cars.css").toExternalForm());

		return mainPane;
	}

}
