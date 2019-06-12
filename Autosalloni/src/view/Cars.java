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
import javafx.scene.control.ScrollPane;
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

public class Cars extends VBox {
	public static HBox mainPane1 = new HBox(10);
	public static HBox mainPane2 = new HBox(10);
	public static VBox main= new VBox(10);
	public static HBox button = new HBox(10);

	
	public static FlowPane secondmainPane = new FlowPane(10,10);

	public static Button showMore = I18N.getButton("showMore");
	public static int detailsOffset = 0;
	public static int count = 0;
	public  Cars() throws IOException, SQLException {
		// Declare Photos
		mainPane1.setPrefWidth(150);
		mainPane1.setMaxWidth(151);
		mainPane2.setPrefWidth(150);
		mainPane2.setMaxWidth(151);
		
		
//		mainPane.setOrientation(Orientation.HORIZONTAL);
//		mainPane.setPadding(new Insets(30));

		if(count == 0) {
			List<VBox> carInfo = Car.merriTeDhenat(10, 0);
			int k=0;
			for (int i = 0; i < carInfo.size(); i++) {
				
				if(k<5) {
					mainPane1.getChildren().addAll(carInfo.get(i));
				}
				else
				{
					mainPane2.getChildren().addAll(carInfo.get(i));
									
				}
				k++;
				}
			
			
			count++;
		}
		main.getChildren().addAll(mainPane1,mainPane2);
		showMore.setOnAction(new controller.ShowMoreCarDetails());
//		mainPane.getChildren().addAll(showMore);
		ScrollPane s = new ScrollPane(main);  
        s.setStyle(" -fx-background-color:transparent;");
        s.setBorder(null);
        main.setPrefWidth(600);
        main.setPadding(new Insets(20,0,50,50));
		button.getChildren().add(showMore);
//		button.setAlignment(Pos.CENTER);
		button.setPadding(new Insets(0,0,50,500));
//		main.getChildren().add(button);
		getChildren().addAll(main,s,button );
	}

}