package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class ControlRocket {
	
	
	@FXML
	private AnchorPane win1, win2;
	@FXML
	private ImageView loginPic;

	public void initialize() {

		transiccionFoto();

	}

	@FXML
	public void closeApp() {
		Stage thisStage = (Stage) win2.getScene().getWindow();
		thisStage.close();
	}
	
	@FXML	
	public void openStage() {
		Stage thisStage = (Stage) win1.getScene().getWindow();
		thisStage.close();
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Urano.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 500);
			Stage stage = new Stage();
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(scene);
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	
	private void transiccionFoto() {
		FadeTransition ft = new FadeTransition(Duration.seconds(5), loginPic);
		ft.setFromValue(0);
		ft.setToValue(1);
		ft.play();
	}
}
