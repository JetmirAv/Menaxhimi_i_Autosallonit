package view;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import models.Users;

public class MainComponent extends VBox {

	public static VBox vbox = new VBox(5);
	public static VBox vboxWithScroll = new VBox(5);
	public static ScrollPane s = null;
	
	public static int count = 0;
	public static int offset = 0;
	public static Button createUser = I18N.getButton("create");
	public static Button showMore = I18N.getButton("showMore");
	
	

	public MainComponent() throws SQLException, IOException {

		HBox headerBox = new HBox();
		headerBox.setAlignment(Pos.CENTER);
		headerBox.setPrefHeight(20);
		Label lblImage = I18N.getLabel("logo");
		Label lblName = I18N.getLabel("name");
		Label lblSurname = I18N.getLabel("lastNameU");
		Label lblEmail = I18N.getLabel("email");
		Label lblPhone = I18N.getLabel("phoneNr");
		Label lblCity = I18N.getLabel("city");
		Label lblState = I18N.getLabel("state"); 
		Label lblGender = I18N.getLabel("genderU");
		Label lblBirthday = I18N.getLabel("birthdayU");

		lblImage.getStyleClass().add("userHeaderLabel");
		lblName.getStyleClass().add("userHeaderLabel");
		lblSurname.getStyleClass().add("userHeaderLabel");
		lblEmail.getStyleClass().add("userHeaderLabel");
		lblPhone.getStyleClass().add("userHeaderLabel");
		lblCity.getStyleClass().add("userHeaderLabel");
		lblState.getStyleClass().add("userHeaderLabel");
		lblGender.getStyleClass().add("userHeaderLabel");
		lblBirthday.getStyleClass().add("userHeaderLabel");

	//	lblImage.setPrefWidth(50);
		lblName.setPrefWidth(110);
		lblSurname.setPrefWidth(110);
		lblEmail.setPrefWidth(225);
		lblPhone.setPrefWidth(175);
		lblCity.setPrefWidth(115);
		lblState.setPrefWidth(115);
		lblGender.setPrefWidth(85);
		lblBirthday.setPrefWidth(135);

		headerBox.getChildren().addAll(lblImage, 
				lblName, lblSurname, 
				lblEmail, lblPhone, 
				lblGender, lblBirthday,
				lblCity, lblState);
		headerBox.setTranslateX(-10);
		if(count == 0) {
	//		vbox.getChildren().add(headerBox);
			
			List<HBox> user = Users.getUsers();
			for (int i = 0; i < user.size(); i++) {
				vbox.getChildren().add(user.get(i));
			}

			createUser.setOnAction(new controller.ShowCreateUserController());
			createUser.getStyleClass().add("updateBtn");
			createUser.getStyleClass().add("btnFormat");
			createUser.setTranslateX(350);
			showMore.getStyleClass().add("updateBtn");
			showMore.getStyleClass().add("btnFormat");
			showMore.setTranslateX(550);
			showMore.setPrefWidth(100);
			
			showMore.setOnAction(new controller.ShowMoreController());
			
			vbox.getChildren().addAll();
			count++;
			s = new ScrollPane(vbox);
			
			
			
//      vbox.setLeft(new ScrollPane(vbox));
			s.setStyle(" -fx-background-color:transparent;");
			//     s.setBorder(null);
			vboxWithScroll.getChildren().addAll(vbox, s);
		}

		getChildren().addAll(headerBox,vboxWithScroll,createUser,showMore);
	}

	public void destroyObject(){
		getChildren().clear();
	}
}
