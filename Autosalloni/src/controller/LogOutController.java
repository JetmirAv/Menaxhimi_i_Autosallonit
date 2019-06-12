package controller;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class LogOutController implements EventHandler<MouseEvent>{
	
	@Override
	public void handle(MouseEvent e) {
		System.out.println("Ckemi");
		Platform.exit();
	}
	

}
