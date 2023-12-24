package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class BorderPaneApplication extends Application {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        BorderPane bp = new BorderPane();
        
        bp.setTop(new Label("NORTH"));
        bp.setRight(new Label("EAST"));
        bp.setBottom(new Label("SOUTH"));
        
        Scene view = new Scene(bp);
        window.setScene(view);
        window.show();
    }

}
