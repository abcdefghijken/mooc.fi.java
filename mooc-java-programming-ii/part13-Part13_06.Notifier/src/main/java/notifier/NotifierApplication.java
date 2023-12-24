package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    private VBox createComponents() {
        VBox layout = new VBox();
        TextField textInputTextField = new TextField();
        Button updateButton = new Button("Update");
        Label textOutputLabel = new Label();
        updateButton.setOnAction(e -> {textOutputLabel.setText(textInputTextField.getText());});
        layout.getChildren().addAll(textInputTextField, updateButton, textOutputLabel);
        return layout;
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Notifier Application");
        stage.setScene(new Scene(createComponents()));
        stage.show();
    }
}