import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class MyPolygon extends MyShape{
    private Polygon pol = new Polygon();
    private ArrayList<Double> points;
    private ArrayList<Double> pointsX;
    private ArrayList<Double> pointsY;
    private double transX;
    private double transY;
    private double rotate = 0.0;
    private String color = 	"#00FFFF";

        public MyPolygon(ArrayList<Double> X, ArrayList<Double> Y){

            points = new ArrayList<Double>();
            pointsX = X;
            pointsY = Y;
            ShapeStatus.setPolygon();


            for (int i = 0; i< X.size(); i ++)  {
                points.add(X.get(i));
                points.add(Y.get(i));
            }
            pol.getPoints().addAll(points);
            pol.setFill(Color.web(color));
            pol.setStroke(Color.BLACK);

            Pointer.resetPointer();

            pol.setOnMousePressed(event ->{
                changeColor(event);          
                });


            pol.setOnScroll(event -> {
                scaleShape(event);
                
            });


            pol.setOnMouseDragged(event -> {
                rotateShape(event);
                moveShape(event);
            });

        }

        public Polygon getShape() {
            return pol;
        }

        public void scaleShape(ScrollEvent event){
            if (event.getDeltaY() > 0){
                pol.setScaleX(pol.getScaleX() * 1.1);
                pol.setScaleY(pol.getScaleY() * 1.1);
            }
            else if (event.getDeltaY() < 0 && pol.getScaleX() > 0.2 && pol.getScaleY() > 0.2){
                pol.setScaleX(pol.getScaleX() * 0.9);
                pol.setScaleY(pol.getScaleY() * 0.9);
            }
        }

        public void changeColor(MouseEvent event){
            if (event.getButton() == MouseButton.MIDDLE){
                GUIColorPicker dialog = new GUIColorPicker();
                String colorHex = dialog.showAndWait().orElse(null);
                if (colorHex != null){
                    color = colorHex;
                    pol.setFill(Color.web(colorHex));
                }
            }
        }

        public void moveShape(MouseEvent event){
            if (event.getButton() == MouseButton.PRIMARY){
                transX = pol.getTranslateX();
                transY = pol.getTranslateY();
                pol.setTranslateX(Pointer.getPaneX()-pol.getBoundsInLocal().getMinX());
                pol.setTranslateY(Pointer.getPaneY()-pol.getBoundsInLocal().getMinY());

            }
    
        }
    
        public void rotateShape(MouseEvent event){
            if (event.getButton() == MouseButton.SECONDARY){
                rotate += 0.6;
                if (rotate > 360) rotate -= 360;
                pol.setRotate(rotate);
            }
        }
        public String getSaveString(){
            String s = "Polygon *";
            for (double x : pointsX){
                s += " ";
                s += Double.toString(x);
            }
            s += " *";
            for (double y : pointsY){
                s += " ";
                s += Double.toString(y);
            }
            s+= " * ";

            
            s += Double.toString(transX) + " " + Double.toString(transY) + " * ";
            s += Double.toString(pol.getScaleX()) + " " +  Double.toString(pol.getScaleY()) + " * ";
            s +=  color +  " * " + Double.toString(rotate) + " * $#@?$?#@$?#@%@$?%@?\n";
            return s;
        }
        //name: Polygon
        //All Points
        //Trans x & y
        //angle
        //colorfill

}