package view;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import jdk.internal.dynalink.DynamicLinker;



public class MainComponent {

	public static GridPane display(String name, String trainers, String email,String website,String address,String component )  throws IOException {
	
	
	
	GridPane pane = new GridPane();
	pane.setHgap(35);
	pane.setVgap(20);
	//pane.getStylesheets().add("mainComponent.css");
	FileInputStream userPath;
	try {
		userPath = new FileInputStream(component + "/src/img/user.png");

	Image img = new Image(userPath);
    pane.setStyle("-fx-font-size:20px");
	pane.getStyleClass().add("fonts");
	pane.setPadding(new Insets(20,5, 5, 30));
	pane.getStyleClass().add("AdminSite");
  
	Label lb0 =new Label("Number of users:");
	lb0.getStyleClass().add("fonts");
	pane.add(lb0,0,2);
	pane.add(new Label("John Doe"),4,2);
	Circle circle0=new Circle();
	circle0.setRadius(23);
	circle0.setFill(new ImagePattern(img));
	pane.add(circle0,5,2);
	Label lb1 = new Label("Logo");
   	lb1.getStyleClass().add("fonts");
	pane.add(lb1,0,4);
	Label lb2 = new Label("Name");
   	lb2.getStyleClass().add("fonts");
	pane.add(lb2,1,4);
	Label lb3 = new Label("Trainers");
   	lb3.getStyleClass().add("fonts");
	pane.add(lb3,2,4);
	Label lb4 = new Label("Email");
   	lb4.getStyleClass().add("fonts");
	pane.add(lb4,3,4);
	Label lb5 = new Label("Website");
   	lb5.getStyleClass().add("fonts");
	pane.add(lb5,4,4);
	Label lb6 = new Label("Address");
   	lb6.getStyleClass().add("fonts");
	pane.add(lb6,5,4);

	pane.getStyleClass().add("AdminSite1");
    Circle circle=new Circle();
    circle.setRadius(23);
	circle.setFill(new ImagePattern(img));
	pane.setAlignment(Pos.TOP_CENTER);
	pane.add(circle,0,7);
	pane.add(new Label("name"),1,7);
	pane.add(new Label("trainers"),2,7);
	pane.add(new Label("email"),3,7);
	pane.add(new Label("website"),4,7);
	pane.add(new Label("address"),5,7);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	return pane; 
	
	}
	    	

}
