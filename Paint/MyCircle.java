import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyCircle extends MyShape{
    Circle circle;
    private double transX;
    private double transY;
    private double x1;    
    private double y1;
    private double x2;
    private double y2;
    private String color = 	"#00FFFF";

        public MyCircle(ArrayList<Double> X, ArrayList<Double> Y){

            Pointer.resetPointer();

            x1 = X.get(0);
            y1 = Y.get(0);
            x2 = X.get(1);
            y2 = Y.get(1);

            circle = new Circle(x1,y1, Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));

            circle.setFill(Color.web(color));
            circle.setStroke(Color.BLACK);

            circle.setOnMousePressed(event -> {
                changeColor(event);
            });

            circle.setOnMouseDragged(event -> {
                moveShape(event);
            });

            circle.setOnScroll(event ->{
                scaleShape(event);
            });
            
        }

        public Circle getShape() {
            return circle;
        }

        public void moveShape(MouseEvent event){
            if (event.getButton() == MouseButton.PRIMARY){
                transX = circle.getTranslateX();
                transY = circle.getTranslateY();
                circle.setTranslateX(Pointer.getPaneX()-circle.getBoundsInLocal().getMinX());
                circle.setTranslateY(Pointer.getPaneY()-circle.getBoundsInLocal().getMinY());
            }
    
        }

        public void changeColor(MouseEvent event){
            if (event.getButton() == MouseButton.MIDDLE){
                GUIColorPicker dialog = new GUIColorPicker();
                String colorHex = dialog.showAndWait().orElse(null);
                if (colorHex != null){
                    color = colorHex;
                    circle.setFill(Color.web(colorHex));
                }
            }
        }
        public void scaleShape(ScrollEvent event){
            if (event.getDeltaY() > 0){
                circle.setRadius(circle.getRadius()*1.1);
            }
            else if (event.getDeltaY() < 0 && circle.getRadius() > 3)
                circle.setRadius(circle.getRadius()*0.9);
        }
        
        public void rotateShape(MouseEvent event){};

        public String getSaveString(){
            String s = "Circle * " + Double.toString(x1) + " " + Double.toString(x2) + " * " + Double.toString(y1) + " " + Double.toString(y2) + " * " + 
            Double.toString(transX) + " " + Double.toString(transY) + " * " + Double.toString(circle.getRadius()) + " * " + color + " * * ?@#$?@#?$@#?$?@#$\n";
            return s;
        }

        //name: Circle
        //Center pos
        //Trans x & y
        //angle - 0
        //colorfill
        //radius
}       
