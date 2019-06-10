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
import models.Car;
import models.Users;

public class MainComponent extends VBox {

	public static VBox usersList = new VBox();
	public static VBox vbox = new VBox(5);
	public static int count = 0;

	public MainComponent() throws SQLException, IOException {

		String current = new java.io.File(".").getCanonicalPath();

		HBox hbox = new HBox(60);

		vbox.getStylesheets().add(MainComponent.class.getResource("mainComponent.css").toExternalForm());
		FileInputStream userPath;
		userPath = new FileInputStream(current + "/src/img/user.png");
		Image img = new Image(userPath);

		HBox headerBox = new HBox();
		headerBox.setAlignment(Pos.CENTER);
		headerBox.setPrefHeight(20);
		Label lblImage = new Label("Image");
		Label lblName = new Label("First Name");
		Label lblSurname = new Label("Last Name");
		Label lblEmail = new Label("Email");
		Label lblPhone = new Label("Phone Number");
		Label lblCity = new Label("City");
		Label lblState = new Label("State");
		Label lblGender = new Label("Gender");
		Label lblBirthday = new Label("Birthday");

		lblImage.getStyleClass().add("userHeaderLabel");
		lblName.getStyleClass().add("userHeaderLabel");
		lblSurname.getStyleClass().add("userHeaderLabel");
		lblEmail.getStyleClass().add("userHeaderLabel");
		lblPhone.getStyleClass().add("userHeaderLabel");
		lblCity.getStyleClass().add("userHeaderLabel");
		lblState.getStyleClass().add("userHeaderLabel");
		lblGender.getStyleClass().add("userHeaderLabel");
		lblBirthday.getStyleClass().add("userHeaderLabel");

		lblImage.setPrefWidth(90);
		lblName.setPrefWidth(120);
		lblSurname.setPrefWidth(120);
		lblEmail.setPrefWidth(200);
		lblPhone.setPrefWidth(180);
		lblCity.setPrefWidth(120);
		lblState.setPrefWidth(120);
		lblGender.setPrefWidth(90);
		lblBirthday.setPrefWidth(140);

		headerBox.getChildren().addAll(lblImage, 
				lblName, lblSurname, 
				lblEmail, lblPhone, 
				lblGender, lblBirthday,
				lblCity, lblState);

		if(count == 0) {
			vbox.getChildren().add(headerBox);
			
			List<HBox> user = Users.getUsers();
			for (int i = 0; i < user.size(); i++) {
				vbox.getChildren().add(user.get(i));
			}
			Button createUser = new Button("Create User");
			createUser.setOnAction(new controller.ShowCreateUserController());
			
			vbox.getChildren().add(createUser);
			count++;
		}
		getChildren().add(vbox);

	}

	public void destroyObject(){
		getChildren().clear();
	}
}
