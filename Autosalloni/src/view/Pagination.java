package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Pagination {

	public static HBox display(double records) {
		
		HBox pagination = new HBox(10);
		pagination.setPadding(new Insets(10));
		pagination.setAlignment(Pos.CENTER);
		int pages = (int) Math.ceil(records/8);
		
		for(int i =1; i<=pages; i++) {
			Button bttnPage = new Button(""+i);
			pagination.getChildren().add(bttnPage);
		}
		
		return pagination;
	}
}
