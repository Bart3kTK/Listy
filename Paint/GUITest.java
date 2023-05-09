import java.beans.EventHandler;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GUITest{


    public GUITest(Stage stage) throws IOException {
      Parent parent = FXMLLoader.load(getClass().getResource("paint.fxml"));

      Scene scene = new Scene(parent);


      Pane pane = (Pane) scene.lookup("#MyPane");
      pane.setClip(new Rectangle(0,0, 1920, 1080));

      new TimeLine(pane);

      stage.setTitle("Paint beta 0.0.6");
      stage.setScene(scene);
      stage.show();
      ShapeStatus.setStage(stage);

    
    }
}
