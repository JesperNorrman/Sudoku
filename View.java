package sudoku;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class View extends Application {
	
	private Button solveButton;
	private Button clearButton;
	
	
	@Override
	public void start(Stage stage) {
		TilePane root = new TilePane();
		
		solveButton = new Button("Solve");
		clearButton = new Button("Clear");
		
		
		
		HBox bottomBox = new HBox();
		bottomBox.setPadding(new Insets(10, 10, 10, 10));
		bottomBox.setSpacing(20);  
		bottomBox.setAlignment(Pos.BOTTOM_LEFT); 
		bottomBox.getChildren().addAll(solveButton, clearButton);
		
		root.getChildren().add(bottomBox);
		root.setPrefSize(250, 250);
		
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Sudoku");
	    stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}