package view;


import java.io.IOException;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Reports 
{
	public static VBox display() throws IOException
	{
		String current = new java.io.File(".").getCanonicalPath();
		
		VBox reportsVbox = new VBox(20);
		reportsVbox.setPrefWidth(400);
		reportsVbox.setPrefHeight(400);
		reportsVbox.setAlignment(Pos.CENTER);
		reportsVbox.setPadding(new Insets(25,35,25,35));
		reportsVbox.setStyle("-fx-border-color: black;\n" +
                   "-fx-border-insets: 5;\n" +
                   "-fx-border-width: 2;\n" +
                   "-fx-border-style: solid;\n");
		
		Label firstLbl = new Label("Label 1 spdoifhpoi doigfo[digj[dfoijg[oij aiogjsfo[dgj[oifdgvji j[diofgjo[idfjgi[s"
				+ "zdflgkjnfdlgjndfljgnksjbdfgkj z;foigh;fhgz zodigjodfihg z z[dfoigjiozdfjg ozdifgjdfiogj ozidfj gfdiogj");
		firstLbl.setStyle("-fx-border-style: none none solid none; -fx-border-width: 1;"
				+ "-fx-font: 17 arial; -fx-border-color: transparent transparent grey transparent;");
		
		Label secondLbl = new Label("Label 2 spdoifhpoi doigfo[digj[dfoijg[oij aiogjsfo[dgj[oifdgvji j[diofgjo[idfjgi[s"
				+ "zdflgkjnfdlgjndfljgnksjbdfgkj z;foigh;fhgz zodigjodfihg z z[dfoigjiozdfjg ozdifgjdfiogj ozidfj gfdiogj");
		secondLbl.setStyle("-fx-border-style: none none solid none; -fx-border-width: 1;"
				+ "-fx-font: 17 arial; -fx-border-color: transparent transparent grey transparent;");
		
		Label thirdLbl = new Label("Label 3 spdoifhpoi doigfo[digj[dfoijg[oij aiogjsfo[dgj[oifdgvji j[diofgjo[idfjgi[s"
				+ "zdflgkjnfdlgjndfljgnksjbdfgkj z;foigh;fhgz zodigjodfihg z z[dfoigjiozdfjg ozdifgjdfiogj ozidfj gfdiogj");
		thirdLbl.setStyle("-fx-border-style: none none solid none; -fx-border-width: 1;"
				+ "-fx-font: 17 arial; -fx-border-color: transparent transparent grey transparent;");
		
		Label fourthLbl = new Label("Label 4 spdoifhpoi doigfo[digj[dfoijg[oij aiogjsfo[dgj[oifdgvji j[diofgjo[idfjgi[s"
				+ "zdflgkjnfdlgjndfljgnksjbdfgkj z;foigh;fhgz zodigjodfihg z z[dfoigjiozdfjg ozdifgjdfiogj ozidfj gfdiogj");
		fourthLbl.setStyle("-fx-border-style: none none solid none; -fx-border-width: 1;"
				+ "-fx-font: 17 arial; -fx-border-color: transparent transparent grey transparent;");
		Label fifthLbl = new Label("Label 5 spdoifhpoi doigfo[digj[dfoijg[oij aiogjsfo[dgj[oifdgvji j[diofgjo[idfjgi[s"
				+ "zdflgkjnfdlgjndfljgnksjbdfgkj z;foigh;fhgz zodigjodfihg z z[dfoigjiozdfjg ozdifgjdfiogj ozidfj gfdiogj");
		fifthLbl.setStyle("-fx-border-style: none none solid none; -fx-border-width: 1;"
				+ "-fx-font: 17 arial; -fx-border-color: transparent transparent grey transparent;");
		
		Button showMoreBtn = new Button("Show More");
		showMoreBtn.setOnMouseEntered(e -> {
		showMoreBtn.setCursor(Cursor.HAND);
			});
		showMoreBtn.setStyle("-fx-text-fill:white ;  -fx-background-color:#5DA4C7;");
		showMoreBtn.setPrefWidth(320);
		showMoreBtn.setMaxWidth(320);
		reportsVbox.getChildren().addAll(firstLbl,secondLbl,thirdLbl,fourthLbl,fifthLbl,showMoreBtn);
		return reportsVbox;
		
	}
}
