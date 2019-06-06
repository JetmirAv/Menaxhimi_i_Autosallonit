package view;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Modal {

	static int ret = -1;
	
	public static int display(int type, String title, String message, String confirm, String cancel) {
		
		int length = 40;
		Stage modal = new Stage();
		modal.initModality(Modality.APPLICATION_MODAL);
		modal.setTitle(title);
		modal.setWidth(400);
		modal.setHeight(150);
		VBox content = new VBox(10);
		String mes = helpers.helpers.formatSentence(message, length);
		
		
		Label text = new Label(mes);
		text.setPadding(new Insets(20));
		Button bttnOk = new Button(confirm);
		bttnOk.setOnAction(e-> {
			modal.close();
			ret = 0;
			
		});

		HBox buttons = new HBox(10);
		buttons.setAlignment(Pos.CENTER);
		if(type == 1) {
			
			Button bttnCancel = new Button(cancel);
			bttnCancel.setOnAction(e-> {
				modal.close();
				ret = -1;
				
			});
			
			buttons.getChildren().addAll(bttnCancel, bttnOk);
			content.getChildren().addAll(text, buttons);
			
		} else {
			content.getChildren().addAll(text, bttnOk);
		}
		
		
//		Buttons
		content.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(content);
		modal.setScene(scene);
		modal.showAndWait();
		
		return ret;
	}
	
	
}
