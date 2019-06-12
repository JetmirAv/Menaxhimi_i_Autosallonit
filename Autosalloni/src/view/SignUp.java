package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import controller.UploadPhotoController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SignUp {

	public static TextField nameField = new TextField();
	public static TextField lastnameField = new TextField();
	public static TextField emailField = new TextField();
	public static PasswordField passField = new PasswordField();
	public static TextField birthdayField = new TextField();
	public static ChoiceBox<String> gendre = new ChoiceBox<>();
	public static TextField phoneField = new TextField();
	public static TextField addressField = new TextField();
	public static TextField cityField = new TextField();
	public static TextField stateField = new TextField();
	public static TextField postalField = new TextField();
	public static TextField cardField = new TextField();
	public static TextField cardCodeField = new TextField();
	public static TextField expMonthField = new TextField();
	public static TextField expYearField = new TextField();
	public static BufferedImage bImage = null;
	public static TextField imgField = new TextField();
	
	
	public static Image image1;
	public static ImageView imageView1 = new ImageView();
	public static Stage modal = new Stage();

	public static Stage stage = new Stage();
	
	public static void display() throws IOException {

		modal.initModality(Modality.APPLICATION_MODAL);
		modal.setTitle("Sign In");


		
		String current = new java.io.File(".").getCanonicalPath();
		FileInputStream UserImgPath = new FileInputStream(current + "/src/img/user.png");
		System.out.println(current + "/src/img/user.png");
		image1 = new Image(UserImgPath, 100, 150, true, true);
		imageView1.setImage(image1);

		imageView1.setOnMouseClicked(new UploadPhotoController());

		Text signUpTxt = new Text("Sign Up");
		signUpTxt.setFont(new Font("Times New Roman", 30));
		signUpTxt.setFill(Color.BLACK);

		VBox vbox = new VBox(15);
		vbox.setPadding(new Insets(40, 40, 40, 40));
		vbox.getChildren().addAll(signUpTxt, imageView1);
		vbox.setAlignment(Pos.CENTER);


		HBox hbox = new HBox();

		nameField.setPromptText("First Name");
		nameField.setPrefWidth(250);
		lastnameField.setPromptText("Last Name");
		lastnameField.setPrefWidth(250);

		hbox.getChildren().addAll(nameField, lastnameField);
		hbox.setSpacing(20);
		hbox.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox);

		// VBox vbox2 = new VBox();
		HBox hbox2 = new HBox();

		birthdayField.setPromptText("YYYY-MM-DD");
		birthdayField.setPrefWidth(220);
		
		gendre.getItems().add("M");
		gendre.getItems().add("F");
		gendre.setPrefWidth(30);
		gendre.setValue("M");
		// emailField.setMaxWidth(500);
		
		phoneField.setPromptText("Phone Number");
		phoneField.setPrefWidth(220);
		// phoneField.setMaxWidth(500);
		hbox2.getChildren().addAll(birthdayField, gendre, phoneField);
		hbox2.setSpacing(15);
		hbox2.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox2);

		HBox hbox3 = new HBox();
		emailField.setPromptText("Email");
		emailField.setPrefWidth(250);
		// emailField.setMaxWidth(500);
		passField.setPromptText("Password");
		passField.setPrefWidth(250);
		// passField.setMaxWidth(500);
		hbox3.getChildren().addAll(emailField, passField);
		hbox3.setSpacing(20);
		hbox3.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox3);

		HBox hbox4 = new HBox();
		
		addressField.setPromptText("Address");
		addressField.setPrefWidth(250);
		// emailField.setMaxWidth(500);
		
		cityField.setPromptText("City");
		cityField.setPrefWidth(250);
		
		stateField.setPromptText("State");
		stateField.setPrefWidth(250);
		hbox4.getChildren().addAll(addressField, cityField);
		hbox4.setSpacing(20);
		hbox4.setAlignment(Pos.CENTER_LEFT);
		vbox.getChildren().add(hbox4);

		HBox hbox5 = new HBox();
		
		postalField.setPromptText("Postal Number");
		postalField.setPrefWidth(250);
		// emailField.setMaxWidth(500);
		
		
		hbox5.getChildren().addAll(stateField, postalField);
		hbox5.setSpacing(20);
		hbox5.setAlignment(Pos.CENTER_LEFT);
		vbox.getChildren().add(hbox5);
		cardField.setPromptText("Card Number");
		cardField.setPrefWidth(250);
		cardCodeField.setPromptText("Card Code");
		cardCodeField.setPrefWidth(250);
		HBox hbox7 = new HBox();
		hbox7.setSpacing(20);
		hbox7.setAlignment(Pos.CENTER);
		hbox7.getChildren().addAll(cardField, cardCodeField);
		vbox.getChildren().add(hbox7);
		HBox hbox6 = new HBox();
		
		expMonthField.setPromptText("expMonth");
		expMonthField.setPrefWidth(250);
		// emailField.setMaxWidth(500);
		
		expYearField.setPromptText("expYear");
		expYearField.setPrefWidth(250);
		hbox6.getChildren().addAll(expMonthField, expYearField);
		hbox6.setSpacing(20);
		hbox6.setAlignment(Pos.CENTER);
		vbox.getChildren().add(hbox6);

		Button signUpBtn = new Button("Sign Up");
		signUpBtn.setOnMouseEntered(e -> {
			signUpBtn.setCursor(Cursor.HAND);
		});
		signUpBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		signUpBtn.setPrefWidth(520);
		signUpBtn.setMaxWidth(520);
		vbox.getChildren().add(signUpBtn);

		Text memberTxt = new Text("Already a member?");
		vbox.getChildren().add(memberTxt);
		memberTxt.setFill(Color.WHITE);

		Button signInBtn = new Button("Sign In");
		signInBtn.setOnMouseEntered(e -> {
			signInBtn.setCursor(Cursor.HAND);
		});

		signUpBtn.setOnAction(new controller.SignUpController());

		signInBtn.setStyle("    -fx-background-color: transparent;\r\n" + "    -fx-border: none;\r\n"
				+ "	-fx-padding:0 5px 5px 10px;\r\n" + "	-fx-text-fill:#5DA4C7;");
		vbox.getChildren().addAll(signInBtn);

		vbox.setStyle(" -fx-background-image: url(autoPath);\r\n" + "    -fx-background-repeat: stretch;   \r\n"
				+ "    -fx-background-size: 900 506;\r\n" + "    -fx-background-position: center center;\r\n"
				+ "    -fx-effect: dropshadow(three-pass-box, black, 30, 0.5, 0, 0); \r\n" + "");

		Scene scene = new Scene(vbox);
		modal.setScene(scene);
		modal.showAndWait();
	}

	public static void configureFileChooser(final FileChooser fileChooser) {
		fileChooser.setTitle("View Pictures");
		fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Images", "*.*"),
				new FileChooser.ExtensionFilter("JPG", "*.jpg"), new FileChooser.ExtensionFilter("PNG", "*.png"));
	}
//	
//	

//    
//    public static void printLog(TextArea textArea, List<File> files) {
//        if (files == null || files.isEmpty()) {
//            return;
//        }
//        for (File file : files) {
//            textArea.appendText(file.getAbsolutePath() + "\n");
//        }
//    }

//    public static void openFile(final File file) {
//        try {
//            desktop.open(file);
//        } catch (IOException ex) {
//            Logger.getLogger(FileChooser.class.getName()).log(
//                Level.SEVERE, null, ex
//            );
//        }
//    }

//    private static void openFile(final File file) {
//    	
//    	//fileA = file ;
//    	
//        try {
//        	
//            desktop.open(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
