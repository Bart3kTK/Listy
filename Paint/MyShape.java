import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Transform;

public abstract class MyShape implements MyShapeIF{


        public MyShape(){}



        public abstract void rotateShape(MouseEvent event);
        public abstract void moveShape(MouseEvent event);
        public abstract void scaleShape(ScrollEvent event);

        public abstract void changeColor(MouseEvent event);
        public abstract String getSaveString();




        
}
