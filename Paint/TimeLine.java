import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class TimeLine {

    public TimeLine(Pane pane){


      HashMap<String, FigureBuilder> figureBuildersMap = new HashMap<String, FigureBuilder>()
      {{
        put("Circle", new CircleBuilder());
        put("Rectangle", new RectangleBuilder());
        put("Polygon", new PolygonBuilder());
      }};

      pane.setOnMouseDragged(e ->{
        Pointer.setMousePaneCoords(e.getX(), e.getY());
      });
      pane.setOnMouseMoved(e ->{
        Pointer.setMousePaneCoords(e.getX(), e.getY());
      });

      pane.setOnMousePressed(event -> {
        if (event.isControlDown() == true)
          Pointer.addPoint(event.getX(), event.getY());
        
        if (Pointer.getNbOfPoints() == ShapeStatus.getPointsNb()){
          MyShape shape = figureBuildersMap.get(ShapeStatus.getStatus()).buildFigure(Pointer.getX(),Pointer.getY());
          ShapeStatus.addShape(shape);
          pane.getChildren().add(shape.getShape());
        }
      });

      pane.setOnKeyPressed(event ->{
        if (event.getCode() == KeyCode.ENTER){
          ShapeStatus.setNbOfPolygon();
        }
        if (event.getCode() == KeyCode.L){
          Pointer.resetPointer();
          System.out.println(ShapeStatus.getLoadShapes());
          pane.getChildren().clear();
          for (MyShape s : ShapeStatus.getLoadShapes()){
            pane.getChildren().add(s.getShape());
          }
          }
      });
      
    }
    
}
