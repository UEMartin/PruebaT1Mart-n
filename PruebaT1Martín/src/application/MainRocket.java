package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
*@author: martin
*@version: 0.0.1
*@see: ControlRocket.java
*Esta clase ejecuta una ventana de registro ("de pega"),
* desde esa ventana se puede abrir otra,(cerrandose la anterior), que tiene unbotón de cerrar propio 
*/
public class MainRocket extends Application {
		
	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Mars.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Let me in");
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}