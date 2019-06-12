package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

import controller.DeleteCarController;
import controller.UpdateStoreController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class UpdateStore extends HBox {
	
	public static Label nameLbl = I18N.getLabel("name");
	public static TextField nameField = new TextField();
	public static Label cityLbl = I18N.getLabel("city");
	public static Label phonenumberLbl = I18N.getLabel("phoneNr");
	public static TextField phonenumberField = new TextField();
	public static Label postalLbl = I18N.getLabel("postal");
	public static TextField postalField = new TextField();
	public static TextField cityField = new TextField();
	public static Label addressLbl = I18N.getLabel("address");
	public static TextField addressField = new TextField();
	public static Label stateLbl = I18N.getLabel("state");
	public static TextField stateField = new TextField();
	public static VBox middleVbox = new VBox(30);
	public static HBox mainHbox = new HBox(25);
	public static VBox leftVbox = new VBox(30);
	public static VBox rightVbox = new VBox(30);
	public static Button deleteStoreBtn = I18N.getButton("delete");
	public static Button updateStoreBtn = I18N.getButton("update");
	public static ComboBox<String> languagesCbo = new ComboBox<>();

	public  UpdateStore() throws IOException
	{
		String current = new java.io.File(".").getCanonicalPath();
		
		languagesCbo.getItems().addAll(Main.allowedLanguages);
		languagesCbo.setValue(I18N.getDefaultLocale().getLanguage());
		languagesCbo.setOnAction(e -> switchLanguage());

		nameField.setPromptText("Store Name");

		cityField.setPromptText("Store City");
		cityField.setAlignment(Pos.CENTER_LEFT);

		leftVbox.setAlignment(Pos.CENTER_LEFT);
		leftVbox.getChildren().addAll(nameLbl, nameField, cityLbl, cityField);

		
		phonenumberField.setPromptText("Store Phone");
		postalField.setPromptText("Postal");
		
		updateStoreBtn.setOnMouseEntered(e -> {
			updateStoreBtn.setCursor(Cursor.HAND);
		});
		updateStoreBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		updateStoreBtn.setPrefWidth(220);
		updateStoreBtn.setMaxWidth(90);
		updateStoreBtn.setOnAction(new UpdateStoreController());
		
		deleteStoreBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		deleteStoreBtn.setPrefWidth(220);
		deleteStoreBtn.setMaxWidth(90);
		deleteStoreBtn.setOnAction(new DeleteCarController());
		
		middleVbox.getStyleClass().add("photoToCenter");
		middleVbox.setPadding(new Insets(170, 0, 0, 0));
		middleVbox.setAlignment(Pos.CENTER_LEFT);
		middleVbox.getChildren().addAll(phonenumberLbl, phonenumberField, postalLbl, postalField);

		
		addressField.setPromptText("Store Address");
		stateField.setPromptText("Store State");

		rightVbox.setAlignment(Pos.CENTER_LEFT);
		rightVbox.getChildren().addAll(addressLbl, addressField, stateLbl, stateField);

		mainHbox.setAlignment(Pos.CENTER);
//		mainHbox.setStyle("-fx-border-color: black;\n" + "-fx-border-insets: 5;\n" + "-fx-border-width: 2;\n"
//				+ "-fx-border-style: solid;\n");
		mainHbox.getChildren().addAll(leftVbox, middleVbox, rightVbox);
		mainHbox.setTranslateX(250);
		mainHbox.setTranslateY(80);
		getChildren().add(mainHbox);

	}
	public static void switchLanguage() {
		I18N.setLocale(new Locale(languagesCbo.getValue()));
	}

}
