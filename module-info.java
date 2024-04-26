module Denuncias {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens controller to javafx.fxml;
	opens application to javafx.graphics ;
}
