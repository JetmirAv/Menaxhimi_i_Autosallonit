package view;

import javafx.geometry.Insets;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class Filter {

	public static HBox display(String className) {
		HBox filters = new HBox(150);
		filters.setPadding(new Insets(15, 10, 15, 30));
		HBox searchBox = new HBox(10);
		HBox manufacturerBox = new HBox(10);
		HBox fuelBox = new HBox();
		 
		Label lblSearch = new Label("Search: ");
		Label lblManufacturer = new Label("Manufacturer: ");
		Label lblFuel = new Label("Fuel: ");
		
		lblSearch.getStyleClass().add("filterText");
		lblManufacturer.getStyleClass().add("filterText");
		lblFuel.getStyleClass().add("filterText");
		
		TextField txtSearch = new TextField();
		
		ComboBox<String> selectManufacturer = new ComboBox();
		ComboBox<String> selectFuel = new ComboBox();
		selectManufacturer.setPrefWidth(180);
		selectFuel.setPrefWidth(180);
		
		selectManufacturer.getItems().addAll("BMW", "Mercedes", "Audi", "Porche");
		selectFuel.getItems().addAll("Diesel", "Benzin", "Electric", "Plin");
		
		searchBox.getChildren().addAll(lblSearch, txtSearch);
		manufacturerBox.getChildren().addAll(lblManufacturer, selectManufacturer);
		fuelBox.getChildren().addAll(lblFuel, selectFuel);
		filters.getChildren().addAll(searchBox);
		if(className == "Car") {
			filters.getChildren().addAll(manufacturerBox, fuelBox);
		}
		
		return filters;
	}
}
