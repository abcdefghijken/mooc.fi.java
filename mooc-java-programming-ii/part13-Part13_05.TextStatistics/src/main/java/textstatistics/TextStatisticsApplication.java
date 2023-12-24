package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    private HBox bottomLayout() {
        Label text1 = new Label("Letters: 0");
        Label text2 = new Label("Words: 0");
        Label text3 = new Label("The longest word is:");
        HBox boxLayout = new HBox();
        boxLayout.getChildren().add(text1);
        boxLayout.getChildren().add(text2);
        boxLayout.getChildren().add(text3);
        boxLayout.setSpacing(4);
        
        return boxLayout;
    }
            
    private BorderPane createComponents() {
        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea());
        layout.setBottom(bottomLayout());
        return layout;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Text statistics application");
        stage.setScene(new Scene(createComponents()));
        stage.show();
    }
}