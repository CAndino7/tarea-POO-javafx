package controller;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import controller.homeController;

public class homeController {
	
	@FXML
	Label tText;
	
	
	public void newD(ActionEvent event) {
		tText.setText("HOLA MUNDO");
	}


	public void setStage(Stage primaryStage) {
		// TODO Auto-generated method stub
		
	}
	
	

}
