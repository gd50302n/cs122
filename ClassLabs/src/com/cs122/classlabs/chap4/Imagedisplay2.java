package com.cs122.classlabs.chap4;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Imagedisplay2 extends Application{

	public void start(Stage primaryStage)
    {
        Image img = new Image("https://nordichouse.is/wp-content/uploads/2016/02/pianopic.jpg");
        ImageView imgView = new ImageView(img);

        StackPane pane = new StackPane(imgView);
        pane.setStyle("-fx-background-color: cornsilk");
        imgView.setViewport(new Rectangle2D(200, 90, 70, 60));
        
        Scene scene = new Scene(pane, 500, 350);

        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}



