package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Modal {

	static int ret = -1;
	
	public static int display(int type, String title, String confirm, String cancel) {
		
		
		Stage modal = new Stage();
		modal.initModality(Modality.APPLICATION_MODAL);
		modal.setTitle(title);
		modal.setWidth(500);
		modal.setHeight(200);
//		Buttons
		VBox content = new VBox(10);
		Button bttnOk = new Button(confirm);
		bttnOk.setOnAction(e-> {
			modal.close();
			ret = 0;
			
		});
		Button bttnCancel = new Button(cancel);
		bttnCancel.setOnAction(e-> {
			modal.close();
			ret = -1;
			
		});
		
		HBox buttons = new HBox(10);
		buttons.getChildren().addAll(bttnCancel, bttnOk);
		buttons.setAlignment(Pos.CENTER);
		
		content.getChildren().add(buttons);
		
		content.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(content);
		modal.setScene(scene);
		modal.showAndWait();
		
		return ret;
	}
	
	
}
