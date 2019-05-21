package view;
import java.io.FileInputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
public class User {
	
	public static HBox display(String current) throws IOException {
	
	     
		 FileInputStream carPhoto,iconFuels,gearsPhoto,wheelPhoto;
	 	 carPhoto = new FileInputStream(current + "/src/img/car1.png");
	 	 iconFuels = new FileInputStream(current + "/src/img/iconFuels.png");
	 	 gearsPhoto = new FileInputStream(current + "/src/img/gears.png");
	 	 wheelPhoto = new FileInputStream(current + "/src/img/wheel.png");
     	 iconFuels = new FileInputStream(current + "/src/img/iconFuels.png");
		
	
     // First Photo
     VBox pane = new VBox(15);
     pane.setPadding(new Insets(20,20,0,10));
     Label label1 = new Label("Total numbers of cars : 78 CARS");
     label1.setStyle("-fx-text-fill:black ; -fx-font-size:12px;");
     TextField textField = new TextField ();
     textField.setPromptText("Search...");
     textField.setMaxWidth(150);
     textField.setTranslateX(-20);
     textField.setTranslateY(-10);
     textField.setId("textField");
     StackPane sp = new StackPane();
     sp.getChildren().add(textField);
 	 carPhoto = new FileInputStream(current + "/src/img/car1.png");
 	 iconFuels = new FileInputStream(current + "/src/img/iconFuels.png");
 	 gearsPhoto = new FileInputStream(current + "/src/img/gears.png");
 	 wheelPhoto = new FileInputStream(current + "/src/img/wheel.png");
 	 iconFuels = new FileInputStream(current + "/src/img/iconFuels.png");
     
     ImageView image = new ImageView(new Image(iconFuels));  
     
     VBox vbPane = new VBox();
	     GridPane gridFirstContent = new GridPane();
	     gridFirstContent.setPadding(new Insets(10,10,10,10));
	     gridFirstContent.setVgap(25);
	     gridFirstContent.setHgap(17);
   
      Label label2 = new Label("CAR VIEW");
      label2.setFont(Font.font("Arial", FontWeight.BOLD,15));
      gridFirstContent.getStyleClass().add("firstContent");
      gridFirstContent.setConstraints(label2,0,0);
     
     
     HBox iconAtLabel1 = new HBox(7);
     ImageView iconLabel = new ImageView(new Image(iconFuels));  
     VBox vbx = new VBox();
     Label Diesel = new Label("Diesel");
     Diesel.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label fuelType = new Label("Fuel Type");
     vbx.getChildren().addAll(fuelType,Diesel);
     iconAtLabel1.getChildren().addAll(iconLabel,vbx);
     gridFirstContent.setConstraints(iconAtLabel1,0,1);

     HBox iconAtLabel2 = new HBox(7);
     ImageView gearsIcon = new ImageView(new Image(gearsPhoto));  

     VBox vbx2 = new VBox();
     Label typeOfGear = new Label("Spur");
     typeOfGear.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label gears = new Label("Gears");
     vbx2.getChildren().addAll(gears,typeOfGear);
     iconAtLabel2.getChildren().addAll(gearsIcon,vbx2);

     gridFirstContent.setConstraints(iconAtLabel2,1,1);
     
     HBox iconAtLabel3 = new HBox(7);
     ImageView wheelIcon = new ImageView(new Image(wheelPhoto));  
     VBox vbx3 = new VBox();
     Label oem = new Label("OEM");
     oem.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label wheelType = new Label("Wheels Type");
     vbx3.getChildren().addAll(wheelType,oem);
     iconAtLabel3.getChildren().addAll(wheelIcon,vbx3);
     gridFirstContent.setConstraints(iconAtLabel3,0,2);
     
     Label details = new Label("View details");
     gridFirstContent.setConstraints(details, 1,2);
     gridFirstContent.getChildren().addAll(label2,iconAtLabel1,iconAtLabel2,iconAtLabel3,details);
     vbPane.getChildren().addAll(image,gridFirstContent);
     pane.getChildren().addAll(label1,sp,vbPane);

     
     
     
     //Second Photo and Pane
     VBox pane2 = new VBox(15);
     VBox vbPane2 = new VBox();
     
     // CarPhoto
     ImageView image2 = new ImageView(new Image(carPhoto));  
     
     pane2.setPadding(new Insets(98,30,10,10));
     
     // GridPane for CARVIEW
     
     GridPane gridSecondContent = new GridPane();
     gridSecondContent.setPadding(new Insets(10,10,10,10));
     gridSecondContent.setVgap(25);
     gridSecondContent.setHgap(17);
     
     //Label CARVIEW
     
     Label label3 = new Label("CAR VIEW");
     label3.setFont(Font.font("Arial", FontWeight.BOLD,15));
     gridSecondContent.getStyleClass().add("firstContent");
     gridSecondContent.setConstraints(label3,0,0);
     
     // HBox first icon and Label.
     
     HBox iconAtLabel4 = new HBox(7);
     ImageView iconLabelphoto2 = new ImageView(new Image(iconFuels));  
     VBox vbx4 = new VBox();
     Label DieselPhoto2 = new Label("Diesel");
     DieselPhoto2.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label fuelTypePhoto2 = new Label("Fuel Type");
     vbx4.getChildren().addAll(fuelTypePhoto2,DieselPhoto2);
     iconAtLabel4.getChildren().addAll(iconLabelphoto2,vbx4);
     gridSecondContent.setConstraints(iconAtLabel4,0,1);
     
     // HBox second icon and Label.
     
     HBox iconAtLabel5 = new HBox(7);
     ImageView gearsIconphoto2 = new ImageView(new Image(gearsPhoto));
     VBox vbx5 = new VBox();
     Label typeOfGearPhoto2 = new Label("Spur");
     typeOfGearPhoto2.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label gearsPhoto2 = new Label("Gears");
     vbx5.getChildren().addAll(gearsPhoto2,typeOfGearPhoto2);
     iconAtLabel5.getChildren().addAll(gearsIconphoto2,vbx5);
     gridSecondContent.setConstraints(iconAtLabel5,1,1);
     
     //HBox third icon and Label
     
     HBox iconAtLabel6 = new HBox(7);
     ImageView wheelIconphoto2 = new ImageView(new Image(wheelPhoto));  
     VBox vbx6 = new VBox();
     Label oemPhoto2 = new Label("OEM");
     oemPhoto2.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label wheelTypePhoto2 = new Label("Wheels Type");
     vbx6.getChildren().addAll(wheelTypePhoto2,oemPhoto2);
     iconAtLabel6.getChildren().addAll(wheelIconphoto2,vbx6);
     gridSecondContent.setConstraints(iconAtLabel6,0,2);
     
     // Details
     
     Label detailsSecond = new Label("View details");
     gridSecondContent.setConstraints(detailsSecond, 1,2);
     
     gridSecondContent.getChildren().addAll(label3,iconAtLabel4,iconAtLabel5,iconAtLabel6,detailsSecond);
     vbPane2.getChildren().addAll(image2,gridSecondContent);
     pane2.getChildren().addAll(vbPane2);
     
     
     // Third Photo and Pane
     VBox pane3 = new VBox(15);
     VBox vbPane3 = new VBox();
     
     pane3.setPadding(new Insets(98,10,0,0));
     ImageView image3 = new ImageView(new Image(carPhoto));  
     
     GridPane gridThirdContent = new GridPane();
     gridThirdContent.setPadding(new Insets(10,10,10,10));
     gridThirdContent.setVgap(25);
     gridThirdContent.setHgap(17);
     
     Label label4 = new Label("CAR VIEW");
     label4.setFont(Font.font("Arial", FontWeight.BOLD,15));
     gridThirdContent.getStyleClass().add("firstContent");
     gridThirdContent.setConstraints(label4,0,0);
     
     HBox iconAtLabel7 = new HBox(7);
     ImageView iconLabelphoto3 = new ImageView(new Image(iconFuels));  
     VBox vbx7 = new VBox();
     Label DieselPhoto3 = new Label("Diesel");
     DieselPhoto3.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label fuelTypePhoto3 = new Label("Fuel Type");
     vbx7.getChildren().addAll(fuelTypePhoto3,DieselPhoto3);
     iconAtLabel7.getChildren().addAll(iconLabelphoto3,vbx7);
     gridThirdContent.setConstraints(iconAtLabel7,0,1);
     
     
     HBox iconAtLabel8 = new HBox(7);
     ImageView gearsIconphoto3 = new ImageView(new Image(gearsPhoto));
     VBox vbx8 = new VBox();
     Label typeOfGearPhoto3 = new Label("Spur");
     typeOfGearPhoto3.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label gearsPhoto3 = new Label("Gears");
     vbx8.getChildren().addAll(gearsPhoto3,typeOfGearPhoto3);
     iconAtLabel8.getChildren().addAll(gearsIconphoto3,vbx8);
     gridThirdContent.setConstraints(iconAtLabel8,1,1);
     
     HBox iconAtLabel9 = new HBox(7);
     ImageView wheelIconphoto3 = new ImageView(new Image(wheelPhoto));  
     VBox vbx9 = new VBox();
     Label oemPhoto3 = new Label("OEM");
     oemPhoto3.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label wheelTypePhoto3 = new Label("Wheels Type");
     vbx9.getChildren().addAll(wheelTypePhoto3,oemPhoto3);
     iconAtLabel9.getChildren().addAll(wheelIconphoto3,vbx9);
     gridThirdContent.setConstraints(iconAtLabel9,0,2);
     
     Label detailsThird = new Label("View details");
     gridThirdContent.setConstraints(detailsThird, 1,2);
     gridThirdContent.getChildren().addAll(label4,iconAtLabel7,iconAtLabel8,iconAtLabel9,detailsThird);
     vbPane3.getChildren().addAll(image3,gridThirdContent);
     pane3.getChildren().add(vbPane3);

     
     // Fourth Photo and Pane
     VBox pane4 = new VBox(15);
     VBox vbPane4 = new VBox();
     pane4.setPadding(new Insets(98,0,0,10));
     ImageView image4 = new ImageView(new Image(carPhoto));  
     
     GridPane gridFourthContent = new GridPane();
     gridFourthContent.setPadding(new Insets(10,10,10,10));
     gridFourthContent.setVgap(25);
     gridFourthContent.setHgap(17);
     
     
     Label label5 = new Label("CAR VIEW");
     label5.setFont(Font.font("Arial", FontWeight.BOLD,15));
     gridFourthContent.getStyleClass().add("firstContent");
     gridFourthContent.setConstraints(label5,0,0);
     
     HBox iconAtLabel10 = new HBox(7);
     ImageView iconLabelphoto4 = new ImageView(new Image(iconFuels));  
     VBox vbx10 = new VBox();
     Label DieselPhoto4 = new Label("Diesel");
     DieselPhoto4.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label fuelTypePhoto4 = new Label("Fuel Type");
     vbx10.getChildren().addAll(fuelTypePhoto4,DieselPhoto4);
     iconAtLabel10.getChildren().addAll(iconLabelphoto4,vbx10);
     gridFourthContent.setConstraints(iconAtLabel10,0,1);
     
     HBox iconAtLabel11 = new HBox(7);
     ImageView gearsIconphoto4 = new ImageView(new Image(gearsPhoto));
     VBox vbx11 = new VBox();
     Label typeOfGearPhoto4 = new Label("Spur");
     typeOfGearPhoto4.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label gearsPhoto4 = new Label("Gears");
     vbx11.getChildren().addAll(gearsPhoto4,typeOfGearPhoto4);
     iconAtLabel11.getChildren().addAll(gearsIconphoto4,vbx11);
     gridFourthContent.setConstraints(iconAtLabel11,1,1);
     
     HBox iconAtLabel12 = new HBox(7);
     ImageView wheelIconphoto4 = new ImageView(new Image(wheelPhoto));  
     VBox vbx12 = new VBox();
     Label oemPhoto4 = new Label("OEM");
     oemPhoto4.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label wheelTypePhoto4 = new Label("Wheels Type");
     vbx12.getChildren().addAll(wheelTypePhoto4,oemPhoto4);
     iconAtLabel12.getChildren().addAll(wheelIconphoto4,vbx12);
     gridFourthContent.setConstraints(iconAtLabel12,0,2);
     
     
     
     Label detailsFourth = new Label("View details");
     gridFourthContent.setConstraints(detailsFourth, 1,2);
     gridFourthContent.getChildren().addAll(label5,iconAtLabel10,iconAtLabel11,iconAtLabel12,detailsFourth);
     vbPane4.getChildren().addAll(image4,gridFourthContent);
     pane4.getChildren().add(vbPane4);
     
     // Fifth photo
     
     ComboBox<String> comboBoxLocation = new ComboBox<>();
     comboBoxLocation.getItems().addAll("Prishtina","Ferizaj","Prizren","Gjakove","Podujeve");
     comboBoxLocation.setPromptText("Location");
    
     // StyleComboBox
     
     comboBoxLocation.setStyle("-fx-font-size:15px; -fx-font-color:grey");
     comboBoxLocation.setTranslateY(-17.5);
     VBox pane5 = new VBox(15); 
     VBox vbPane5 = new VBox();
     pane5.setPadding(new Insets(68,0,50,10));
     ImageView image5 = new ImageView(new Image(carPhoto));  
     
     GridPane gridFifthContent = new GridPane();
     gridFifthContent.setPadding(new Insets(10,10,10,10));
     gridFifthContent.setVgap(25);
     gridFifthContent.setHgap(17);
     Label label6 = new Label("CAR VIEW");
     label6.setFont(Font.font("Arial", FontWeight.BOLD,15));
     gridFifthContent.getStyleClass().add("firstContent");
     gridFifthContent.setConstraints(label5,0,0);
     
     HBox iconAtLabel13 = new HBox(7);
     ImageView iconLabelphoto5 = new ImageView(new Image(iconFuels));  
     VBox vbx13 = new VBox();
     Label DieselPhoto5 = new Label("Diesel");
     DieselPhoto5.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label fuelTypePhoto5 = new Label("Fuel Type");
     vbx13.getChildren().addAll(fuelTypePhoto5,DieselPhoto5);
     iconAtLabel13.getChildren().addAll(iconLabelphoto5,vbx13);
     gridFifthContent.setConstraints(iconAtLabel13,0,1);
     
     
     
     HBox iconAtLabel14 = new HBox(7);
     ImageView gearsIconphoto5 = new ImageView(new Image(gearsPhoto));
     VBox vbx14 = new VBox();
     Label typeOfGearPhoto5 = new Label("Spur");
     typeOfGearPhoto5.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label gearsPhoto5 = new Label("Gears");
     vbx14.getChildren().addAll(gearsPhoto5,typeOfGearPhoto5);
     iconAtLabel14.getChildren().addAll(gearsIconphoto5,vbx14);
     gridFifthContent.setConstraints(iconAtLabel14,1,1);
     
     
     HBox iconAtLabel15 = new HBox(7);
     ImageView wheelIconphoto5 = new ImageView(new Image(wheelPhoto));  
     VBox vbx15 = new VBox();
     Label oemPhoto5 = new Label("OEM");
     oemPhoto5.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label wheelTypePhoto5 = new Label("Wheels Type");
     vbx15.getChildren().addAll(wheelTypePhoto5,oemPhoto5);
     iconAtLabel15.getChildren().addAll(wheelIconphoto5,vbx15);
     gridFifthContent.setConstraints(iconAtLabel15,0,2);
     
     Label detailsFifth = new Label("View details");
     gridFifthContent.setConstraints(detailsFifth, 1,2);
     gridFifthContent.getChildren().addAll(label6,iconAtLabel13,iconAtLabel14,iconAtLabel15,detailsFifth);
     vbPane5.getChildren().addAll(comboBoxLocation,image5,gridFifthContent);
     pane5.getChildren().add(vbPane5);
     
     
     
     // Sixth photo
     
     VBox pane6 = new VBox(15);
     VBox vbPane6 = new VBox();
     HBox hb = new HBox();
     ComboBox<String> comboBoxGlobal = new ComboBox<>();
     comboBoxGlobal.setPromptText("Global");
     comboBoxGlobal.getItems().addAll("Global1", "Global2");
     comboBoxGlobal.setStyle("-fx-font-size:15px");
     comboBoxGlobal.setTranslateX(-55);
     comboBoxGlobal.setTranslateY(-16);
    
     ComboBox<String> comboBoxCalendar = new ComboBox<>();
     comboBoxCalendar.getItems().addAll("Calendari");
     comboBoxCalendar.setPromptText("dd / mm / yyyy");
     comboBoxCalendar.setStyle("-fx-font-size:15px; -fx-font-color:grey");
     comboBoxCalendar.setTranslateY(-16);
     comboBoxCalendar.setTranslateX(-16);

     
     

     hb.getChildren().addAll(comboBoxGlobal,comboBoxCalendar);
     hb.setAlignment(Pos.TOP_RIGHT);
     pane6.setPadding(new Insets(68,0,50,10));
     ImageView image6 = new ImageView(new Image(carPhoto));  
   
     GridPane gridSixthContent = new GridPane();
     gridSixthContent.setPadding(new Insets(10,10,10,10));
     gridSixthContent.setVgap(25);
     gridSixthContent.setHgap(17);
     
     
     Label label7 = new Label("CAR VIEW");
     label7.setFont(Font.font("Arial", FontWeight.BOLD,15));
     gridSixthContent.getStyleClass().add("firstContent");
     gridSixthContent.setConstraints(label7,0,0);
     
     HBox iconAtLabel16 = new HBox(7);
     ImageView iconLabelphoto6 = new ImageView(new Image(iconFuels));  
     VBox vbx16 = new VBox();
     Label DieselPhoto6 = new Label("Diesel");
     DieselPhoto6.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label fuelTypePhoto6 = new Label("Fuel Type");
     vbx16.getChildren().addAll(fuelTypePhoto6,DieselPhoto6);
     iconAtLabel16.getChildren().addAll(iconLabelphoto6,vbx16);
     gridSixthContent.setConstraints(iconAtLabel16,0,1);
     
     
     HBox iconAtLabel17 = new HBox(7);
     ImageView gearsIconphoto6 = new ImageView(new Image(gearsPhoto));
     VBox vbx17 = new VBox();
     Label typeOfGearPhoto6 = new Label("Spur");
     typeOfGearPhoto6.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label gearsPhoto6 = new Label("Gears");
     vbx17.getChildren().addAll(gearsPhoto6,typeOfGearPhoto6);
     iconAtLabel17.getChildren().addAll(gearsIconphoto6,vbx17);
     gridSixthContent.setConstraints(iconAtLabel17,1,1);
     
     HBox iconAtLabel18 = new HBox(7);
     ImageView wheelIconphoto6 = new ImageView(new Image(wheelPhoto));  
     VBox vbx18 = new VBox();
     Label oemPhoto6 = new Label("OEM");
     oemPhoto6.setFont(Font.font("Verdana", FontWeight.BOLD, 8));
     Label wheelTypePhoto6 = new Label("Wheels Type");
     vbx18.getChildren().addAll(wheelTypePhoto6,oemPhoto6);
     iconAtLabel18.getChildren().addAll(wheelIconphoto6,vbx18);
     gridSixthContent.setConstraints(iconAtLabel18,0,2);
     
     Label detailsSixth = new Label("View details");
     gridSixthContent.setConstraints(detailsSixth, 1,2);
     gridSixthContent.getChildren().addAll(label7,iconAtLabel16,iconAtLabel17,iconAtLabel18,detailsSixth);
     vbPane6.getChildren().addAll(hb,image6,gridSixthContent);
     pane6.getChildren().add(vbPane6);
     
     
      HBox paneFirstRow = new HBox(10);
     paneFirstRow.getChildren().addAll(pane,pane2,pane3,pane4,pane5,pane6);
     paneFirstRow.getStylesheets().add(Header.class.getResource("user.css").toExternalForm());
     return paneFirstRow;  
     
 }
}


