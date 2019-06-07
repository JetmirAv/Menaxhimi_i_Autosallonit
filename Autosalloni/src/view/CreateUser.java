package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CreateUser 
{
	public static VBox display() throws IOException
	{
		String current = new java.io.File(".").getCanonicalPath();
		
		FileInputStream namePath = new FileInputStream(current + "/src/img/createUser.png");
		FileInputStream lastnamePath = new FileInputStream(current + "/src/img/lastname.png");
		FileInputStream emailPath = new FileInputStream(current + "/src/img/email.png");
		FileInputStream passPath = new FileInputStream(current + "/src/img/password.png");
		FileInputStream addressPath = new FileInputStream(current + "/src/img/address.png");
		FileInputStream birthdayPath = new FileInputStream(current + "/src/img/birthday.png");
		FileInputStream phonenumberPath = new FileInputStream(current + "/src/img/phonenumber.png");
		FileInputStream cityPath = new FileInputStream(current + "/src/img/city.png");
		FileInputStream statePath = new FileInputStream(current + "/src/img/state.png");
		FileInputStream genderPath = new FileInputStream(current + "/src/img/gender.png");
		FileInputStream codePath = new FileInputStream(current + "/src/img/code.png");
		FileInputStream postalnumberPath = new FileInputStream(current + "/src/img/postalnumber.png");
		FileInputStream expiredPath = new FileInputStream(current + "/src/img/expired.png");
		FileInputStream cardPath = new FileInputStream(current + "/src/img/card.png");
		
		
		VBox createUserHbox = new VBox();
		Text signUpTxt = new Text("Create User");
		signUpTxt.setFont(new Font("Times New Roman",30));
		signUpTxt.setFill(Color.BLACK);
		
		
		HBox photoHbox = new HBox();
		Circle photoCircle = new Circle(250,200,80); 
		photoCircle.setStroke(Color.SEAGREEN); 
		photoCircle.setFill(Color.SNOW); 
		photoCircle.setEffect(new DropShadow(+25d, 0d, +2d, Color.DARKSEAGREEN));
		Image im = new Image(codePath);
		photoCircle.setFill(new ImagePattern(im));
		photoHbox.setAlignment(Pos.CENTER);
		photoHbox.getChildren().addAll(photoCircle);
		
		HBox mainHbox = new HBox(200);
		mainHbox.setPadding(new Insets(40,40,40,40));
		//mainHbox.getStyleClass().addAll("textfield");
		mainHbox.setAlignment(Pos.CENTER);
//		mainHbox.getChildren().add(signUpTxt); 
//		firstVbox.setAlignment(Pos.CENTER);

		VBox leftVbox = new VBox(8);
		
		Label firstNameLbl = new Label("First Name");
		TextField firstNameField = new TextField();
		Image nameImg = new Image(namePath);
		firstNameLbl.setGraphic(new ImageView(nameImg));
		firstNameField.setPromptText("Test");
		firstNameField.getStyleClass().addAll("textfield");
		
		//Image logoImg = new Image(autoPath);
		//ImageView logoView = new ImageView(logoImg);
	    Label label1 = new Label("Search");
	    //label1.setGraphic(new ImageView(autoPath));
		
		Label lastNameLbl = new Label("Last Name");
		Image lastnameImg = new Image(lastnamePath);
		lastNameLbl.setGraphic(new ImageView(lastnameImg));
		TextField lastNameField = new TextField();
		lastNameField.setPromptText("Test");
		lastNameField.getStyleClass().addAll("textfield");
		
	
		
		Label emailLbl = new Label("Email");
		Image emailImg = new Image(emailPath);
		emailLbl.setGraphic(new ImageView(emailImg));
		TextField emailField = new TextField();
		emailField.setPromptText("Test");
		emailField.getStyleClass().addAll("textfield");
		
		Label passLbl = new Label("Password");
		Image passImg = new Image(passPath);
		passLbl.setGraphic(new ImageView(passImg));
		TextField passField = new TextField();
		passField.setPromptText("********");
		passField.getStyleClass().addAll("textfield");
		

		HBox bottomHbox = new HBox(20);
		VBox vbox1 = new VBox(3);
		Label birthdayLbl = new Label("Birthday");
		Image birthdayImg = new Image(birthdayPath);
		birthdayLbl.setGraphic(new ImageView(birthdayImg));
		TextField birthdayField = new TextField();
		birthdayField.setPrefWidth(280);
		birthdayField.getStyleClass().addAll("textfield");
		vbox1.getChildren().addAll(birthdayLbl,birthdayField);
		VBox vbox2 = new VBox();
		Label gendreLbl = new Label("Gender");
		//Image genderImg = new Image(genderPath);
		//gendreLbl.setGraphic(new ImageView(genderImg));
		ChoiceBox<String> gendre = new ChoiceBox<>();
		gendre.getItems().add("M");
		gendre.getItems().add("F");
		gendre.setPrefWidth(30);
		gendre.setValue("M");
		gendre.getStyleClass().addAll("textfield");
		vbox2.getChildren().addAll(gendreLbl,gendre);
		vbox2.setPadding(new Insets(2,0,0,0));
		bottomHbox.getChildren().addAll(vbox1,vbox2);
		 
		
		Label numberLbl = new Label("Phone Number");
		Image phonenumberImg = new Image(phonenumberPath);
		numberLbl.setGraphic(new ImageView(phonenumberImg));
		TextField numberField = new TextField();
		numberField.setPromptText("123456789");
		numberField.getStyleClass().addAll("textfield");
		
		
		leftVbox.getChildren().addAll(firstNameLbl,firstNameField,lastNameLbl,lastNameField,
									  emailLbl,emailField,passLbl,passField,numberLbl,numberField,bottomHbox);
		leftVbox.setPrefWidth(300);
		
		VBox rightVbox = new VBox(8);
		
		HBox topHbox = new HBox(5);
		VBox vbox3 = new VBox(3);
		Label cityLbl = new Label("City");
		Image cityImg = new Image(cityPath);
		cityLbl.setGraphic(new ImageView(cityImg));
		TextField cityField = new TextField();
		cityField.setPromptText("Test");
		cityField.getStyleClass().addAll("textfield");
		vbox3.getChildren().addAll(cityLbl,cityField);
		VBox vbox4 = new VBox();
		Label stateLbl = new Label("State");
		Image stateImg = new Image(statePath);
		stateLbl.setGraphic(new ImageView(stateImg));
		TextField stateField = new TextField();
		stateField.setPromptText("Test");
		stateLbl.setPadding(new Insets(0,0,3,0));
		stateField.getStyleClass().addAll("textfield");
		
		
		vbox4.getChildren().addAll(stateLbl,stateField);
		topHbox.getChildren().addAll(vbox3,vbox4);

		
		
		Label addresslLbl = new Label("Address");
		Image addressImg = new Image(addressPath);
		addresslLbl.setGraphic(new ImageView(addressImg));
		TextField addressField = new TextField();
		addressField.setPromptText("Address");
		addressField.getStyleClass().addAll("textfield");
		
		Label postalLbl = new Label("Postal");
		Image postalnumberImg = new Image(postalnumberPath);
		postalLbl.setGraphic(new ImageView(postalnumberImg));
		TextField postalField = new TextField();
		postalField.setPromptText("10000");
		postalField.getStyleClass().addAll("textfield");
		
		
		Label cardLbl = new Label("Card Number");
		Image cardImg = new Image(cardPath);
		cardLbl.setGraphic(new ImageView(cardImg));
		TextField cardField = new TextField();
		cardField.setPromptText("123456678");
		cardField.getStyleClass().addAll("textfield");
		
		Label expireLbl = new Label("Expired Date");
		Image expiredImg = new Image(expiredPath);
		expireLbl.setGraphic(new ImageView(expiredImg));
		TextField expireField = new TextField();
		expireField.setPromptText("__ / ____");
		expireField.getStyleClass().addAll("textfield");
		
		Label codeLbl = new Label("Code");
		Image codeImg = new Image(codePath);
		codeLbl.setGraphic(new ImageView(codeImg));
		TextField codeField = new TextField();
		codeField.setPromptText("1234");
		codeField.getStyleClass().addAll("textfield");
		
		//HBox btnHbox = new HBox();
		Button signUpBtn = new Button("Create");
		signUpBtn.setOnMouseEntered(e -> {
		signUpBtn.setCursor(Cursor.HAND);
		});
		signUpBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		signUpBtn.setPrefWidth(520);
		signUpBtn.setMaxWidth(520);
//		btnHbox.getChildren().addAll(signUpBtn);
//		btnHbox.setAlignment(Pos.CENTER);
		
		rightVbox.getChildren().addAll(topHbox,addresslLbl,addressField,postalLbl,postalField,cardLbl,cardField,expireLbl,expireField,
				codeLbl, codeField,signUpBtn);
		
		rightVbox.setPrefWidth(300);
	
		mainHbox.getChildren().addAll(leftVbox,rightVbox);
		createUserHbox.getChildren().addAll(signUpTxt,photoHbox,mainHbox);
		createUserHbox.getStylesheets().add(SignIn.class.getResource("createUser.css").toExternalForm());
		
		return createUserHbox;
	}

}


//HBox hbox1 = new HBox();
//Label firstnameLbl = new Label("First Name");
//TextField nameField = new TextField();
//nameField.setPromptText("John");
//hbox1.getChildren().addAll(nameField);
//firstVbox.getChildren().addAll(firstnameLbl,hbox1);
//
//HBox hbox2 = new HBox();
//Label lastnameLbl = new Label("Last Name");
//TextField lastnameField = new TextField();
//lastnameField.setPromptText("Doe");
//hbox2.getChildren().addAll(lastnameField);
//firstVbox.getChildren().addAll(lastnameLbl,hbox2);
//
//HBox hbox3 = new HBox();
//Label emailLbl = new Label("Email");
//TextField emailField = new TextField();
//emailField.setPromptText("example@example.example");
//hbox3.getChildren().addAll(emailField);
//firstVbox.getChildren().addAll(emailLbl,hbox3);
//
//HBox hbox4 = new HBox();
//Label passLbl = new Label("Last Name");
//TextField passField = new TextField();
//passField.setPromptText("********00");
//hbox4.getChildren().addAll(passField);
//firstVbox.getChildren().addAll(passLbl,hbox4);





