package application;
	
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.geometry.Pos;

public class Main extends Application {

	//Stage stage;
	Scene scene1, scene2;
	ArrayList<String> word = new ArrayList<String>();
	ArrayList<Integer> count = new ArrayList<Integer>();

	@Override
	public void start(Stage stage) {
		
		stage.setTitle("Edgar Allen Poe Poem");
		
		//Label 1
		Label label1 = new Label("Welcome to the 'Raven' word counter");
		label1.setFont(Font.font("Lucida Console", FontWeight.BOLD, FontPosture.REGULAR, 13));
		
		//Label 2
		Label label2 = new Label("Below is the number of times a word occurs in the poem.");
		label2.setFont(Font.font("Lucida Console", FontWeight.BOLD, FontPosture.REGULAR, 13));
		
		//Button 1
		Button button1 = new Button("Start");
		button1.setOnAction(e -> stage.setScene(scene2));
				
		//Layout 1
		VBox vb = new VBox(100);
		vb.getChildren().addAll(label1, button1);
		vb.setAlignment(Pos.CENTER);
		scene1 = new Scene(vb, 600, 600);
		
		//Layout 2
		VBox vb2 = new VBox(100);
		vb2.getChildren().addAll(label2);
		vb2.setAlignment(Pos.TOP_CENTER);
		scene2 = new Scene(vb2, 600, 600);
		stage.setScene(scene1);
		stage.show();
			}
	
	public static void main(String [] args) {
		launch(args);		
		}

public static void main1(String[] args) throws IOException {

//program reads/scans text file 'PoePoem'
FileReader PoeFile = new FileReader("PoePoem.txt");
Scanner file = new Scanner(PoeFile);

//creating an array list to collect both string and integer values 
ArrayList<String> word = new ArrayList<String>();
ArrayList<Integer> count = new ArrayList<Integer>();

//Executes loop to gather info until all words counted
while(file.hasNext()) {
	String nextChar = file.next();

	if(word.contains(nextChar)) {
		int index = word.indexOf(nextChar);
		count.set(index, count.get(index) +1);
								}
	else {
		word.add(nextChar);
		count.add(1);
	}
}
//closes file reader and scanner
file.close();
PoeFile.close();
	
//for every same word, count +1
for(int i = 0; i < word.size(); i++) {

//Counts the number of times a word is used in the poem
System.out.println("The word " + word.get(i) + " occurs " + count.get(i) + " time(s) in this poem");
		}
	}
}



