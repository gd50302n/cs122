package com.cs122.classlabs;

import javafx.application.Application;


import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Guiprogramming extends Application {
	
	void start(Stage primaryStage)
	
	text text1= new text(200,400), "I am learning new gui");
	text1.setfill(color.White);

	
	circle circle = new Circle(250,250,250);
	Circle.setfill(Color.BLACK);
	
	rectangle rectangle = new rectangle (100,100,100);
	rectangle.setfill(Color.Blue);
	
	Group root = new Group(circle,rectangle,text1);
	scene.scene = new scene(root, 500, 500)
	primarystage.set("Gui programming");
	primarystage.set(set);
	
	static void main(String[]args)
	
	launch(args);
	//not sure why some of the words are not colorful.
	

}
