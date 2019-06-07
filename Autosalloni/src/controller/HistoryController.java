package controller;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import view.Main;

public class HistoryController implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent e) {
		
		if(Main.history.size() -1 >=0) {
			String location = Main.history.get(Main.history.size() - 1);
			
		} else {
			
		}

	}

}
