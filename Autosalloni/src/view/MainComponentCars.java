package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import models.Car;
import models.DatabaseConfig;

public class MainComponentCars {

	private static TableView table = new TableView();

	private static TextField logoTxt = new TextField();
	private static TextField seatsTxt = new TextField();
	private static TextField doorsTxt = new TextField();
	private static TextField alarmTxt = new TextField();
	private static TextField climateTxt = new TextField();
	private static TextField hidraulicTxt = new TextField();
	private static TextField horsePowerTxt = new TextField();
	private static TextField maxspeedTxt = new TextField();
	private static TextField isAutomaticTxt = new TextField();

	public static VBox display() throws IOException, SQLException {
		String current = new java.io.File(".").getCanonicalPath();

//	 
//	       HBox hbox = new HBox(60); 
//	       HBox car1HBox = new HBox(60); 
//	       
//	       VBox vbox= new VBox(5);
//	       VBox tHeader= new VBox(10);
//           vbox.getStylesheets().add(MainComponentCars.class.getResource("mainComponent.css").toExternalForm());
//	       FileInputStream userPath;
//	       userPath = new FileInputStream(current + "/src/img/user.png");
//           
//	       Image img = new Image(userPath);
//	       
//	       hbox.getStyleClass().add("AdminSite");
//	       car1HBox.getStyleClass().add("AdminSite");
//	       
//	       
//	       Label logoLabel = new Label("Logo");
//	       logoLabel.setMinWidth(60);
//	       logoLabel.getStyleClass().add("fonts");
//	       Label seatsLabel = new Label("Seats");
//   	       seatsLabel.getStyleClass().add("fonts");
//   	       seatsLabel.setMinWidth(60);
//   	       Label doorsLabel = new Label("Doors");
//   	       doorsLabel.getStyleClass().add("fonts");
//   	       doorsLabel.setMinWidth(60);
//	       Label alarmLabel = new Label("Alarm");
//	       alarmLabel.setMinWidth(60);
//	       alarmLabel.getStyleClass().add("fonts");
//	       Label climateLabel = new Label("Climate");
//   	       climateLabel.setMinWidth(60);
//   	       climateLabel.getStyleClass().add("fonts");
//	       Label hidraulicLabel = new Label("Hidraulic");
//   	       hidraulicLabel.getStyleClass().add("fonts");
//   	       hidraulicLabel.setMinWidth(60);
//   	       Label hoursePowerLabel = new Label("Hourse Power");
//	       hoursePowerLabel.setMinWidth(60);
//	       hoursePowerLabel.getStyleClass().add("fonts");
//	       Label maxspeedLabel = new Label("Max speed");
//	       maxspeedLabel.setMinWidth(60);
//	       maxspeedLabel.getStyleClass().add("fonts");
//	       Label isAutomaticLabel = new Label("Is automatic");
//   	       isAutomaticLabel.getStyleClass().add("fonts");
//   	       isAutomaticLabel.setMinWidth(60);
//   	       
//   	       
//	       hbox.getChildren().addAll(logoLabel,seatsLabel,doorsLabel,alarmLabel
//	       		,climateLabel,hidraulicLabel,
//	       		hoursePowerLabel,maxspeedLabel,isAutomaticLabel);
//           tHeader.getChildren().add(hbox);
//           tHeader.setPadding(new Insets(0,0,5,15));
//           
//                     
//           
//            //First car
//           Circle car1Circle=new Circle();
//           car1Circle.setRadius(15);
//           car1Circle.setFill(new ImagePattern(img));
//           
//           Label car1SeatsLabel = new Label("Seats");
//   	       car1SeatsLabel.getStyleClass().add("fonts");
//   	       car1SeatsLabel.setMinWidth(60);
//   	       Label car1DoorsLabel = new Label("Doors");
//   	       car1DoorsLabel.getStyleClass().add("fonts");
//   	       car1DoorsLabel.setMinWidth(60);
//	       Label car1AlarmLabel = new Label("Alarm");
//	       car1AlarmLabel.setMinWidth(60);
//	       car1AlarmLabel.getStyleClass().add("fonts");
//   	       Label car1ClimateLabel = new Label("Climate");
//   	       car1ClimateLabel.setMinWidth(60);
//   	       car1ClimateLabel.getStyleClass().add("fonts");
//   	       Label car1HidraulicLabel = new Label("Hidraulic");
//   	       car1HidraulicLabel.getStyleClass().add("fonts");
//   	       car1HidraulicLabel.setMinWidth(60);
//   	       Label car1HoursePowerLabel = new Label("Hourse Power");
//	       car1HoursePowerLabel.setMinWidth(60);
//	       car1HoursePowerLabel.getStyleClass().add("fonts");
//	       Label car1MaxspeedLabel = new Label("Max speed");
//	       car1MaxspeedLabel.setMinWidth(60);
//	       car1MaxspeedLabel.getStyleClass().add("fonts");
//   	       Label car1IsAutomaticLabel = new Label("Is automatic");
//   	       car1IsAutomaticLabel.getStyleClass().add("fonts");
//   	       car1IsAutomaticLabel.setMinWidth(60);
//   	       
//           
//           car1HBox.getChildren().addAll(
//                    car1SeatsLabel,car1DoorsLabel,car1AlarmLabel
//	                ,car1ClimateLabel,car1HidraulicLabel
//	                ,car1HoursePowerLabel,car1MaxspeedLabel
//	                ,car1IsAutomaticLabel);
//              
//           car3HBox.getChildren().addAll(
//                   car3SeatsLabel,car3DoorsLabel,car3AlarmLabel
//                   ,car3ClimateLabel,car3HidraulicLabel,car3HoursePowerLabel,car3MaxspeedLabel
//           		,car3IsAutomaticLabel);
// 
//                               
//           car3HBox.setPadding(new Insets(4,0,0,43));
//                      HBox fourthHBox=new HBox(50);
//                      fourthHBox.getChildren().addAll(car3Circle,car3HBox);
//                      fourthHBox.setPadding(new Insets(0,0,0,12));
//             
//           fourthHBox.getStyleClass().add("users");    
//           secondHBox.getStyleClass().add("users");
//           thirdHBox.getStyleClass().add("users");
//              
//    vbox.getChildren().addAll(tHeader,secondHBox,thirdHBox,fourthHBox);
//	vbox.setPadding(new Insets(20,20,20,20));
//	vbox.getStyleClass().add("mainContent");

		TableColumn<String, Car> logoCol = new TableColumn<>("Logo");
		logoCol.setCellValueFactory(new PropertyValueFactory("logo"));
		logoCol.setPrefWidth(60);

		TableColumn<String, Car> seatsCol = new TableColumn<>("Seats");
		seatsCol.setCellValueFactory(new PropertyValueFactory("seats"));
		seatsCol.setPrefWidth(50);

		TableColumn<String, Car> doorsCol = new TableColumn<>("Doors");
		doorsCol.setCellValueFactory(new PropertyValueFactory("doors"));
		doorsCol.setPrefWidth(50);

		TableColumn<String, Car> alarmCol = new TableColumn<>("Alarm");
		alarmCol.setCellValueFactory(new PropertyValueFactory("alarm"));
		alarmCol.setPrefWidth(70);

		TableColumn<String, Car> climateCol = new TableColumn<>("Climate");
		climateCol.setCellValueFactory(new PropertyValueFactory("climate"));
		climateCol.setPrefWidth(120);

		TableColumn<String, Car> hidraulicCol = new TableColumn<>("Hidraulic");
		hidraulicCol.setCellValueFactory(new PropertyValueFactory("hidraulic"));
		hidraulicCol.setPrefWidth(120);

		TableColumn<String, Car> horsePowerCol = new TableColumn<>("Hourse Power");
		horsePowerCol.setCellValueFactory(new PropertyValueFactory("hoursePower"));
		horsePowerCol.setPrefWidth(120);

		TableColumn<String, Car> maxSpeedCol = new TableColumn<>("Max speed");
		maxSpeedCol.setCellValueFactory(new PropertyValueFactory("maxspeed"));
		maxSpeedCol.setPrefWidth(120);

		TableColumn<String, Car> isAutomaticCol = new TableColumn<>("Is automatic");
		isAutomaticCol.setCellValueFactory(new PropertyValueFactory("isAutomatic"));
		isAutomaticCol.setPrefWidth(120);

		table.getColumns().addAll(logoCol, seatsCol, doorsCol, alarmCol, climateCol, hidraulicCol, horsePowerCol,
				maxSpeedCol, isAutomaticCol);

		logoCol.getStyleClass().add("textToCenter");
		seatsCol.getStyleClass().add("textToCenter");
		doorsCol.getStyleClass().add("textToCenter");
		alarmCol.getStyleClass().add("textToCenter");
		climateCol.getStyleClass().add("textToCenter");
		hidraulicCol.getStyleClass().add("textToCenter");
		horsePowerCol.getStyleClass().add("textToCenter");
		maxSpeedCol.getStyleClass().add("textToCenter");
		isAutomaticCol.getStyleClass().add("textToCenter");

		
		
		VBox vbox = new VBox();
		vbox.setSpacing(5);
//		vbox.setPadding(new Insets(10, 0, 0, 10));
		vbox.getChildren().addAll(table);
		table.setPrefSize(200, 400);
		table.setPrefWidth(200);
		vbox.getStylesheets().add(MainComponentCars.class.getResource("mainComponentCars.css").toExternalForm());

		vbox.setPrefWidth(100);
		showBooks();
		return vbox;

	}

	public static void showBooks() throws SQLException {
		List<Car> cars = Car.getBooks();

		ObservableList<Car> carList = FXCollections.observableArrayList();

		for (int i = 0; i < 10; i++) {
			carList.add(cars.get(i));
		}
		table.setItems(carList);
		System.out.println(carList);

	}
}
