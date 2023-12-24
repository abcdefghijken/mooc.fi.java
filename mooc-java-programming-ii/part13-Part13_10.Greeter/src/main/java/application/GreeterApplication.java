package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        Application.launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        GridPane nameLayout = new GridPane();
        TextField nameTextField = new TextField();
        Button startButton = new Button("Start");
        nameLayout.add(new Label("Enter your name and start"), 0, 0);
        nameLayout.add(nameTextField, 0, 1);
        nameLayout.add(startButton, 0, 2);

        nameLayout.setPrefSize(300, 180);
        nameLayout.setAlignment(Pos.CENTER);
        nameLayout.setVgap(10);
        nameLayout.setHgap(10);
        nameLayout.setPadding(new Insets(20, 20, 20, 20));

        BorderPane mainLayout = new BorderPane();
        Label welcomeLabel = new Label("Welcome");
        mainLayout.setCenter(welcomeLabel);

        mainLayout.setPrefSize(300, 180);
        
        Scene passwordScene = new Scene(nameLayout);
        Scene mainScene = new Scene(mainLayout);

        startButton.setOnAction(event -> {
            welcomeLabel.setText("Welcome " + nameTextField.getText() + "!");
            window.setScene(mainScene);
        });

        window.setTitle("Greeter Application");
        window.setScene(passwordScene);
        window.show();
    }
}