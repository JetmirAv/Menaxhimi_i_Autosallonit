package view;


import java.io.FileInputStream;
import java.io.IOException;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;



public class MainComponent {

	public static VBox display(String name, String trainers, String email,String website,String address,String current )  throws IOException {
	
	
	
	HBox hbox = new HBox(60); 
	VBox vbox= new VBox(5);
	VBox tHeader= new VBox(10);
    vbox.getStylesheets().add(MainComponent.class.getResource("mainComponent.css").toExternalForm());
	FileInputStream userPath;
	userPath = new FileInputStream(current + "/src/img/user.png");
    
	Image img = new Image(userPath);
	
	hbox.getStyleClass().add("AdminSite");
	
	HBox nrOfUsers = new HBox(60);
	Label lb0 =new Label("Number of users:");
	lb0.getStyleClass().add("fonts");
	
	nrOfUsers.getChildren().add(lb0);
	Label lbl1 = new Label("Logo");
	lbl1.setMinWidth(60);
   	lbl1.getStyleClass().add("fonts");
	Label lbl2 = new Label("Name");
	lbl2.setMinWidth(60);
	lbl2.getStyleClass().add("fonts");
	Label lbl3 = new Label("Trainers");
   	lbl3.getStyleClass().add("fonts");
   	lbl3.setMinWidth(60);
   	Label lbl4 = new Label("Email");
   	lbl4.getStyleClass().add("fonts");
   	lbl4.setMinWidth(60);
   	Label lbl5 = new Label("Website");
   	lbl5.getStyleClass().add("fonts");
   	lbl5.setMinWidth(60);
   	Label lbl6 = new Label("Address");
   	lbl6.getStyleClass().add("fonts");
   	lbl6.setMinWidth(60);
   	
	hbox.getChildren().addAll(lbl1,lbl2,lbl3,lbl4,lbl5,lbl6);
    tHeader.getChildren().addAll(nrOfUsers,hbox);
    tHeader.setPadding(new Insets(0,0,0,15));
     
    //First user
    
	HBox userHBox = new HBox(60);
	userHBox.setPadding(new Insets(3,0,3,15));
	Circle circle=new Circle();
    circle.setRadius(15);
	circle.setFill(new ImagePattern(img));
	hbox.setAlignment(Pos.TOP_LEFT);
   
	Label uLbl1 = new Label("Name");
	uLbl1.setPadding(new Insets(4,20,0,30));
	uLbl1.setMinWidth(60);
	uLbl1.getStyleClass().add("fonts");
	Label uLbl2 = new Label("Trainers");
	uLbl2.setPadding(new Insets(4,0,0,0));
	uLbl2.setMinWidth(60);
	uLbl2.setAlignment(Pos.CENTER);
   	Label uLbl3 = new Label("Email");
	uLbl3.setPadding(new Insets(4,0,0,0));
    uLbl3.getStyleClass().add("fonts");
   	uLbl3.setMinWidth(60);
   	Label uLbl4 = new Label("Website");
	uLbl4.setPadding(new Insets(4,0,0,0));
    uLbl4.getStyleClass().add("fonts");
   	uLbl4.setMinWidth(60);
   	Label uLbl5 = new Label("Address");
	uLbl5.setPadding(new Insets(4,0,0,0));
    uLbl5.getStyleClass().add("fonts");
   	uLbl5.setMinWidth(60);
   	
    //Second user
   	
   	HBox suserHBox = new HBox(60);
	suserHBox.setPadding(new Insets(3,0,3,15));
	suserHBox.getStyleClass().add("users");
	Circle u2Circle=new Circle();
	u2Circle.setRadius(15);
	u2Circle.setFill(new ImagePattern(img));
    
   	Label u2Lbl1 = new Label("Name");
	u2Lbl1.setPadding(new Insets(4,20,0,30));
	u2Lbl1.setMinWidth(60);
	Label u2Lbl2 = new Label("Trainers");
	u2Lbl2.setPadding(new Insets(4,0,0,0));
	u2Lbl2.setMinWidth(60);
	Label u2Lbl3 = new Label("Email");
	u2Lbl3.setPadding(new Insets(4,0,0,0));
    u2Lbl3.setMinWidth(60);
   	Label u2Lbl4 = new Label("Website");
	u2Lbl4.setPadding(new Insets(4,0,0,0));
    u2Lbl4.setMinWidth(60);
   	Label u2Lbl5 = new Label("Address");
	u2Lbl5.setPadding(new Insets(4,0,0,0));
    u2Lbl5.setMinWidth(60);
   	
    //Third user
   	
   	HBox thUserHBox = new HBox(60);
	thUserHBox.setPadding(new Insets(3,0,3,15));
	thUserHBox.getStyleClass().add("users");
	Circle u3Circle=new Circle();
	u3Circle.setRadius(15);
	u3Circle.setFill(new ImagePattern(img));
    
   	Label u3Lbl1 = new Label("Name");
	u3Lbl1.setPadding(new Insets(4,22,0,30));
	Label u3Lbl2 = new Label("Trainers");
	u3Lbl2.setPadding(new Insets(4,4,0,0));
	u3Lbl2.setAlignment(Pos.CENTER);
   	Label u3Lbl3 = new Label("Email");
	u3Lbl3.setPadding(new Insets(4,0,0,0));
   	u3Lbl3.setMinWidth(60);
   	Label u3Lbl4 = new Label("Website");
	u3Lbl4.setPadding(new Insets(4,0,0,0));
	u3Lbl4.setMinWidth(60);
   	Label u3Lbl5 = new Label("Address");
	u3Lbl5.setPadding(new Insets(4,0,0,0));
    u3Lbl5.setMinWidth(60);
   	
   	userHBox.getChildren().addAll(circle,uLbl1,uLbl2,uLbl3,uLbl4,uLbl5);
   	suserHBox.getChildren().addAll(u2Circle,u2Lbl1,u2Lbl2,u2Lbl3,u2Lbl4,u2Lbl5);
   	thUserHBox.getChildren().addAll(u3Circle,u3Lbl1,u3Lbl2,u3Lbl3,u3Lbl4,u3Lbl5);

	
	userHBox.getStyleClass().add("fonts");
	userHBox.getStyleClass().add("users");
	
	suserHBox.getStyleClass().add("fonts");
	suserHBox.getStyleClass().add("users");

	thUserHBox.getStyleClass().add("fonts");
	thUserHBox.getStyleClass().add("users");
	
	vbox.getChildren().addAll(tHeader,userHBox,suserHBox,thUserHBox);
	vbox.setPadding(new Insets(20,20,20,20));
	vbox.getStyleClass().add("mainContent");
	return vbox; 
	
	}
	    	

}
