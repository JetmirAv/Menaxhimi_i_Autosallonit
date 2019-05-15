package view;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class User extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
	 primaryStage.setTitle("Hello World!");
     
     // First Photo And Pane
     VBox pane = new VBox(15);
     pane.setPadding(new Insets(15,20,0,10));
     Label label1 = new Label("Total numbers of cars : 78 CARS");
     // CSS style
     label1.setStyle("-fx-text-fill:	blue");
     

     TextField textField = new TextField ();
     textField.setPromptText("Search...");
     textField.setMaxWidth(100);
     textField.setTranslateY(-10);
     
     ImageView image = new ImageView(new Image(getClass().getResourceAsStream("/photos/car1.png")));  
     Label label2 = new Label("Workout Exercise");
     label2.setStyle("-fx-font-size:15px");
     pane.getChildren().addAll(label1,textField,image,label2);
     
     
     // Second Photo and Pane
     VBox pane2 = new VBox(15);
     pane2.setPadding(new Insets(87,30,10,10));
     
     ImageView image2 = new ImageView(new Image(getClass().getResourceAsStream("/photos/car1.png")));  
     Label label3 = new Label("Workout Exercise");
     label3.setStyle("-fx-font-size:15px");
     pane2.getChildren().addAll(image2,label3);
     
     
     // Third Photo and Pane
     VBox pane3 = new VBox(15);
     pane3.setPadding(new Insets(48,10,0,0));
     
     // Drop Down List with ComboBox
     
     ComboBox<String> comboBoxLocation = new ComboBox<>();
     comboBoxLocation.getItems().addAll("Prishtina","Ferizaj","Prizren","Gjakove","Podujeve");
     comboBoxLocation.setPromptText("Location");
     // StyleComboBox
     comboBoxLocation.setStyle("-fx-font-size:15px, -fx-font-color:grey");
     comboBoxLocation.setTranslateY(-12.5);
     ImageView image3 = new ImageView(new Image(getClass().getResourceAsStream("/photos/car1.png")));  
     Label label4 = new Label("Workout Exercise");
     label4.setStyle("-fx-font-size:15px");
     pane3.getChildren().addAll(comboBoxLocation,image3,label4);
     
     
     
     // Fourth Photo and Pane
    
     HBox hbox = new HBox();
     ComboBox<String> comboBoxGlobal = new ComboBox<>();
     comboBoxGlobal.getItems().addAll("Global1", "Global2");
     comboBoxGlobal.setPromptText("Global");
     comboBoxGlobal.setStyle("-fx-font-size:15px, -fx-font-color:grey");
     comboBoxGlobal.setTranslateX(-27);
     comboBoxGlobal.setTranslateY(6);
    
     ComboBox<String> comboBoxCalendar = new ComboBox<>();
     comboBoxCalendar.getItems().addAll("Calendari");
     comboBoxCalendar.setPromptText("dd / mm / yyyy");
     comboBoxCalendar.setStyle("-fx-font-size:15px, -fx-font-color:grey");
     comboBoxCalendar.setTranslateY(-12);
     comboBoxCalendar.setTranslateX(-24);
     
     // Set Icon
     
     Label iconLabel = new Label("Try Car",new ImageView(new Image("/photos/icon.png")));
     iconLabel.setStyle("-fx-font-color:red");
     iconLabel.setTranslateY(-20);
     VBox vb = new VBox();

     vb.getChildren().addAll(iconLabel,comboBoxCalendar);
     vb.setAlignment(Pos.TOP_RIGHT);

     
     
     hbox.getChildren().addAll(comboBoxGlobal,vb);
     hbox.setSpacing(60);

     ImageView image4 = new ImageView(new Image(getClass().getResourceAsStream("/photos/car1.png")));  
     Label label5 = new Label("Workout Exercise");
     label5.setStyle("-fx-font-size:15px");
     VBox pane4 = new VBox(15);
     pane4.setPadding(new Insets(30,0,0,10));
     pane4.getChildren().addAll(hbox,image4,label5);
      
     
     
     HBox paneFirstRow = new HBox(10);
     paneFirstRow.getChildren().addAll(pane,pane2,pane3,pane4);
     
     primaryStage.setScene(new Scene(paneFirstRow, 1000, 500));
     primaryStage.show();
     
     
     
     
     
     
     
     
     
     
     
 }
}
