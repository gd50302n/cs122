package com.cs122.classlabs.chap4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AgeConvertor extends Application{
	
	public void start(Stage primaryStage) {
		Scene ageC = new Scene(new AgeConverterPane(),300,300);
		
		primaryStage.setTitle("Age COnvertor");
		primaryStage.setScene(ageC);
		primaryStage.show();
		
	}
	
	public static void main (String[] args) {
		launch(args);
	}

}
