package view;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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



public class MainComponent {
private static TableView table = new TableView();
	
	public static VBox display(String current )  throws IOException, SQLException {
	
	
//	
    HBox hbox = new HBox(60); 
	VBox vbox= new VBox(5);
//	VBox tHeader= new VBox(10);
    vbox.getStylesheets().add(MainComponent.class.getResource("mainComponent.css").toExternalForm());
	FileInputStream userPath;
	userPath = new FileInputStream(current + "/src/img/user.png");
//    
	Image img = new Image(userPath);
//	
//	hbox.getStyleClass().add("AdminSite");
//	
//	
//	
//	Label logoLabel = new Label("Logo");
//	logoLabel.setMinWidth(60);
//	logoLabel.getStyleClass().add("fonts");
//	Label nameLabel = new Label("First name");
//	nameLabel.setMinWidth(60);
//	nameLabel.getStyleClass().add("fonts");
//	Label surnameLabel = new Label("Last name");
//	surnameLabel.getStyleClass().add("fonts");
//	surnameLabel.setMinWidth(60);
//   	Label emailLabel = new Label("Email");
//   	emailLabel.getStyleClass().add("fonts");
//   	emailLabel.setMinWidth(60);
//   	Label birthdayLabel = new Label("Birthday");
//   	birthdayLabel.getStyleClass().add("fonts");
//   	birthdayLabel.setMinWidth(60);
//   	Label genderLabel = new Label("Gender");
//   	genderLabel .getStyleClass().add("fonts");
//   	genderLabel .setMinWidth(60);
//   	Label stateLabel = new Label("State");
//   	stateLabel.getStyleClass().add("fonts");
//   	stateLabel.setMinWidth(60);
//   	Label addressLabel = new Label("Address");
//   	addressLabel.getStyleClass().add("fonts");
//   	addressLabel.setMinWidth(60);
//   	Label phoneNumberLabel = new Label("Phone Number");
//   	phoneNumberLabel.getStyleClass().add("fonts");
//   	phoneNumberLabel.setMinWidth(60);
//   	
//   	
//	hbox.getChildren().addAll(logoLabel,nameLabel,surnameLabel,emailLabel,birthdayLabel,genderLabel
//			,stateLabel,addressLabel,phoneNumberLabel);
//    tHeader.getChildren().addAll(hbox);
//    tHeader.setPadding(new Insets(0,0,5,15));
//     
//    //First user
//    
//	HBox userHBox = new HBox(60);
//	userHBox.setPadding(new Insets(3,0,3,30));
	Circle circle=new Circle();
    circle.setRadius(15);
	circle.setFill(new ImagePattern(img));
	hbox.setAlignment(Pos.TOP_LEFT);
//   
//	Label userNameLabel = new Label("First name");
//	userNameLabel.setMinWidth(60);
//	userNameLabel.getStyleClass().add("fonts");
//	Label userSurnameLabel = new Label("Last name");
//	userSurnameLabel.getStyleClass().add("fonts");
//	userSurnameLabel.setMinWidth(60);
//   	Label userEmailLabel = new Label("Email");
//   	userEmailLabel.getStyleClass().add("fonts");
//   	userEmailLabel.setMinWidth(60);
//   	Label userBirthdayLabel = new Label("Birthday");
//   	userBirthdayLabel.getStyleClass().add("fonts");
//   	userBirthdayLabel.setMinWidth(60);
//   	Label userGenderLabel = new Label("Gender");
//   	userGenderLabel.getStyleClass().add("fonts");
//   	userGenderLabel.setMinWidth(60);
//   	Label userStateLabel = new Label("State");
//   	userStateLabel.getStyleClass().add("fonts");
//   	userStateLabel.setMinWidth(60);
//   	Label userAddressLabel = new Label("Address");
//   	userAddressLabel.getStyleClass().add("fonts");
//   	userAddressLabel.setMinWidth(60);
//   	Label userPhoneNumberLabel = new Label("Phone Number");
//   	userPhoneNumberLabel.getStyleClass().add("fonts");
//   	userPhoneNumberLabel.setMinWidth(60);
//   	
//    HBox firstUserHBox = new HBox(60);
//   	userHBox.getChildren().addAll(userNameLabel,userSurnameLabel,userEmailLabel,userBirthdayLabel
//   			,userGenderLabel,userStateLabel,userAddressLabel,userPhoneNumberLabel);
//   	firstUserHBox.getChildren().addAll(circle,userHBox);
//   	firstUserHBox.setPadding(new Insets(0,0,0,15));
//    
//  //Second user
//    
//  	HBox user2HBox = new HBox(60);
//  	user2HBox.setPadding(new Insets(3,0,3,30));
//  	Circle user2Circle=new Circle();
//  	user2Circle.setRadius(15);
//  	user2Circle.setFill(new ImagePattern(img));
//  	 
//  	Label user2NameLabel = new Label("First name");
//  	user2NameLabel.setMinWidth(60);
//  	user2NameLabel.getStyleClass().add("fonts");
//  	Label user2SurnameLabel = new Label("Last name");
//  	user2SurnameLabel.getStyleClass().add("fonts");
//  	user2SurnameLabel.setMinWidth(60);
//    Label user2EmailLabel = new Label("Email");
//    user2EmailLabel.getStyleClass().add("fonts");
//    user2EmailLabel.setMinWidth(60);
//    Label user2BirthdayLabel = new Label("Birthday");
//    user2BirthdayLabel.getStyleClass().add("fonts");
//    user2BirthdayLabel.setMinWidth(60);
//    Label user2GenderLabel = new Label("Gender");
//    user2GenderLabel.getStyleClass().add("fonts");
//    user2GenderLabel.setMinWidth(60);
//    Label user2StateLabel = new Label("State");
//    user2StateLabel.getStyleClass().add("fonts");
//    user2StateLabel.setMinWidth(60);
//    Label user2AddressLabel = new Label("Address");
//    user2AddressLabel.getStyleClass().add("fonts");
//    user2AddressLabel.setMinWidth(60);
//    Label user2PhoneNumberLabel = new Label("Phone Number");
//    user2PhoneNumberLabel.getStyleClass().add("fonts");
//    user2PhoneNumberLabel.setMinWidth(60);
//     	
//      HBox secondUserHBox = new HBox(60);
//     	user2HBox.getChildren().addAll(user2NameLabel,user2SurnameLabel,user2EmailLabel,user2BirthdayLabel
//     			,user2GenderLabel,user2StateLabel,user2AddressLabel,user2PhoneNumberLabel);
//     	secondUserHBox.getChildren().addAll(user2Circle,user2HBox);
//     	secondUserHBox.setPadding(new Insets(0,0,0,15));
//   	
//    //Third user
//     	//Second user
//        
//      	HBox user3HBox = new HBox(60);
//      	user3HBox.setPadding(new Insets(3,0,3,30));
//      	Circle user3Circle=new Circle();
//      	user3Circle.setRadius(15);
//      	user3Circle.setFill(new ImagePattern(img));
//      	 
//      	Label user3NameLabel = new Label("First name");
//      	user3NameLabel.setMinWidth(60);
//      	user3NameLabel.getStyleClass().add("fonts");
//      	Label user3SurnameLabel = new Label("Last name");
//      	user3SurnameLabel.getStyleClass().add("fonts");
//      	user3SurnameLabel.setMinWidth(60);
//        Label user3EmailLabel = new Label("Email");
//        user3EmailLabel.getStyleClass().add("fonts");
//        user3EmailLabel.setMinWidth(60);
//        Label user3BirthdayLabel = new Label("Birthday");
//        user3BirthdayLabel.getStyleClass().add("fonts");
//        user3BirthdayLabel.setMinWidth(60);
//        Label user3GenderLabel = new Label("Gender");
//        user3GenderLabel.getStyleClass().add("fonts");
//        user3GenderLabel.setMinWidth(60);
//        Label user3StateLabel = new Label("State");
//        user3StateLabel.getStyleClass().add("fonts");
//        user3StateLabel.setMinWidth(60);
//        Label user3AddressLabel = new Label("Address");
//        user3AddressLabel.getStyleClass().add("fonts");
//        user3AddressLabel.setMinWidth(60);
//        Label user3PhoneNumberLabel = new Label("Phone Number");
//        user3PhoneNumberLabel.getStyleClass().add("fonts");
//        user3PhoneNumberLabel.setMinWidth(60);
//         	
//          HBox thirdUserHBox = new HBox(60);
//         	user3HBox.getChildren().addAll(user3NameLabel,user3SurnameLabel,user3EmailLabel,user3BirthdayLabel
//         			,user3GenderLabel,user3StateLabel,user3AddressLabel,user3PhoneNumberLabel);
//         	thirdUserHBox.getChildren().addAll(user3Circle,user3HBox);
//         	thirdUserHBox.setPadding(new Insets(0,0,0,15));
//
//	
//   	firstUserHBox.getStyleClass().add("fonts");
//   	firstUserHBox.getStyleClass().add("users");
//	
//   	secondUserHBox.getStyleClass().add("fonts");
//   	secondUserHBox.getStyleClass().add("users");
//
//   	thirdUserHBox.getStyleClass().add("fonts");
//   	thirdUserHBox.getStyleClass().add("users");
//	
//	vbox.getChildren().addAll(tHeader,firstUserHBox,secondUserHBox,thirdUserHBox);
//	vbox.setPadding(new Insets(20,20,20,20));
	
	 
		TableColumn<String, Users> photoCol = new TableColumn<>("Photo");
		photoCol.setCellValueFactory(new PropertyValueFactory("img"));
		photoCol.setPrefWidth(80);
		
		TableColumn<String, Users> firstNameCol = new TableColumn<>("First name");
		firstNameCol.setCellValueFactory(new PropertyValueFactory("name"));
		firstNameCol.setPrefWidth(90);
		
		TableColumn<String, Users> surnameCol = new TableColumn<>("Last name");
		surnameCol.setCellValueFactory(new PropertyValueFactory("surname"));
		surnameCol.setPrefWidth(90);
		
		TableColumn<String, Users> emailCol = new TableColumn<>("Email");
		emailCol.setCellValueFactory(new PropertyValueFactory("email"));
		emailCol.setPrefWidth(200);
		
		TableColumn<String, Users> birthdayCol = new TableColumn<>("Birthday");
		birthdayCol.setCellValueFactory(new PropertyValueFactory("birthday"));
		birthdayCol.setPrefWidth(100);
	  
		TableColumn<String, Users> genderCol = new TableColumn<>("Gender");
		genderCol.setCellValueFactory(new PropertyValueFactory("gendre"));
		genderCol.setPrefWidth(50);
		
		TableColumn<String, Users> stateCol = new TableColumn<>("State");
		stateCol.setCellValueFactory(new PropertyValueFactory("state"));
		stateCol.setPrefWidth(120);

		TableColumn<String, Users> addressCol = new TableColumn<>("Address");
		addressCol.setCellValueFactory(new PropertyValueFactory("address"));
		addressCol.setPrefWidth(200);
		
		TableColumn<String, Users> phoneNumberCol = new TableColumn<>("Phone Number");
		phoneNumberCol.setCellValueFactory(new PropertyValueFactory("phoneNumber"));
		phoneNumberCol.setPrefWidth(120);
	

      table.getColumns().addAll(photoCol, firstNameCol, surnameCol,emailCol, birthdayCol
	    		, genderCol,stateCol, addressCol,phoneNumberCol);

      photoCol.getStyleClass().add("textToCenter");
      firstNameCol.getStyleClass().add("textToCenter");
      surnameCol.getStyleClass().add("textToCenter");
      emailCol.getStyleClass().add("textToCenter");
      birthdayCol.getStyleClass().add("textToCenter");
      genderCol.getStyleClass().add("textToCenter");
      stateCol.getStyleClass().add("textToCenter");
      addressCol.getStyleClass().add("textToCenter");
      phoneNumberCol.getStyleClass().add("textToCenter");
      
      
      
      
      vbox.getChildren().addAll( table);
      showUsers();
      return vbox; 
	
	}
	    	
	public static void showUsers() throws SQLException {
		List<Users> user = Users.getUsers();
		
		ObservableList<Users> userList = FXCollections.observableArrayList();
		
		for(int i = 0; i < 10; i++) {
			userList.add(user.get(i));
		}
		table.setItems(userList);
		

	}
}
