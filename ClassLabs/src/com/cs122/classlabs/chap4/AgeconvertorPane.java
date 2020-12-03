package com.cs122.classlabs.chap4;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AgeconvertorPane extends GridPane {
	private Label age,errorPlaceHolder;
	private TextField yearOfbirth;
	
  
    public void AgeConvertorPane() {
    
        Font font = new Font(18);
        
        Label inputLabel = new Label("YearofBirth");
        inputLabel.setFont(font);
        GridPane.setHalignment(inputLabel, HPos.RIGHT);
        
        Label outputLabel = new Label("age");
        outputLabel.setFont(font);
        GridPane.setHalignment(outputLabel, HPos.RIGHT);
        
        age = new Label("---");
        //age.setFont(font);
        GridPane.setHalignment(age,HPos.CENTER);
        GridPane.setHalignment(age, HPos.CENTER);
        
        yearOfbirth = new TextField();
        yearOfbirth.setFont(font);
        yearOfbirth.setPrefWidth(50);
        yearOfbirth.setAlignment(Pos.CENTER);
        yearOfbirth.setOnAction(this::processReturn);
        errorPlaceHolder = new Label(" ");
        GridPane.setHalignment(errorPlaceHolder, HPos.CENTER);
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: yellow");
        
        add(inputLabel, 0, 0);
        add(yearOfbirth, 1, 0);
        add(outputLabel, 0, 1);
        add(age, 1, 1);
        add(errorPlaceHolder,0,2,1,2);
    }

	public void processReturn(ActionEvent event) {
		int yOB; ageCalculated;
		try {
			yOB = Integer.parseInt(yearOfbirth.getText());
			ageCalculated = 2020-yOB;
			if (ageCalculated>100) {
				errorPlaceHolder.setTextFill(Color.GREEN);
				errorPlaceHolder.setText("Congratulations you have lived for more than 100 years");	
			}
			age.setText((2020-yOB)  +"");
			
		} catch (NumberFormatException n) {
			errorPlaceHolder.setTextFill(Color.RED);
			errorPlaceHolder.setText("Please enter a valid number");
			yearOfbirth.clear();
		}
    	
  
       
	



    