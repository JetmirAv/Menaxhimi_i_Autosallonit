package view;

import models.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		// Declare Photos

		FlowPane mainPane = new FlowPane(10, 10);
		mainPane.setOrientation(Orientation.HORIZONTAL);
		mainPane.setPadding(new Insets(30));

		List<VBox> carInfo = Car.merriTeDhenat();

		for (int i = 0; i < carInfo.size(); i++) {

			mainPane.getChildren().addAll(carInfo.get(i));
		}

		return mainPane;
	}

}