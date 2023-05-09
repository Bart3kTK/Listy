import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainGUITest extends Application {
    public static void main(String[] args) {
        Application.launch(args);
      }
      @Override
      public void start(Stage primaryStage) throws IOException {
        new GUITest(primaryStage);
      }
    
}
