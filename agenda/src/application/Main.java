package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/co.uniquindio.pr2.agenda.controllers/View.FXML"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
