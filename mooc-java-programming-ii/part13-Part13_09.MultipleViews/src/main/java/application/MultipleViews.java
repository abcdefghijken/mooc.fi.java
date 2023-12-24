package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane firstLayout = new BorderPane();
        firstLayout.setTop(new Label("First view!"));
        Button buttonToSecond = new Button("To the second view!");
        firstLayout.setCenter(buttonToSecond);
        Scene first = new Scene(firstLayout);
        
        VBox secondLayout = new VBox();        
        Button buttonToThird = new Button("To the third view!");
        secondLayout.getChildren().add(buttonToThird);
        secondLayout.getChildren().add(new Label("Second view!"));
        Scene second = new Scene(secondLayout);

        GridPane thirdLayout = new GridPane();
        Label text = new Label("Third view!");
        Button buttonToFirst = new Button("To first view!");
        thirdLayout.add(text, 0, 0);
        thirdLayout.add(buttonToFirst, 1, 1);
        Scene third = new Scene(thirdLayout);
        
        buttonToSecond.setOnAction((e) -> stage.setScene(second));
        buttonToThird.setOnAction((e) -> stage.setScene(third));
        buttonToFirst.setOnAction((e) -> stage.setScene(first));
        
        stage.setTitle("Multiple Views Application");
        stage.setScene(first);
        stage.show();
    }
}