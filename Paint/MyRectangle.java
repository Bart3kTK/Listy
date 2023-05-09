import java.util.ArrayList;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
public class MyRectangle extends MyShape{
    private Rectangle rec;
    private Double rotate = 0.0;
    private double transX;
    private double transY;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private String color = 	"#00FFFF";

    public MyRectangle(ArrayList<Double> X, ArrayList<Double> Y){

        x1 = X.get(0);
        y1 = Y.get(0);
        x2 = X.get(1);
        y2 = Y.get(1);

        if (x1 >= x2){
            if (y1 >= y2)
                rec = new Rectangle(x2, y2, x1-x2, y1-y2);
            else
                rec = new Rectangle(x2, y1, x1-x2, y2-y1);
        }
        else{
            if (y1 >= y2)
                rec = new Rectangle(x1, y2, x2-x1, y1-y2);
            else
                rec = new Rectangle(x1, y1, x2-x1, y2-y1);    
        }

        rec.setFill(Color.web(color));
        rec.setStroke(Color.BLACK);
        Pointer.resetPointer();

        rec.setOnMousePressed(event ->{
            changeColor(event);
        });
        
        rec.setOnMouseDragged(event -> {
                moveShape(event);
                rotateShape(event);

        });

        rec.setOnScroll(event -> {
            scaleShape(event);
        });
        
    }

    public Rectangle getShape() {
        return rec;
    }


    public void moveShape(MouseEvent event){
        if (event.getButton() == MouseButton.PRIMARY){
            transX = rec.getTranslateX();
            transY = rec.getTranslateY();
            rec.setTranslateX(Pointer.getPaneX()-rec.getBoundsInLocal().getMinX());
            rec.setTranslateY(Pointer.getPaneY()-rec.getBoundsInLocal().getMinY());
        }

    }

    public void rotateShape(MouseEvent event){
        if (event.getButton() == MouseButton.SECONDARY){
            rotate += 0.6;
            if (rotate > 360) rotate -= 360;
            rec.setRotate(rotate);
        }
    }

    public void scaleShape(ScrollEvent event){
        if (event.getDeltaY() > 0){
            rec.setHeight(rec.getHeight() * 1.1);
            rec.setWidth(rec.getWidth() * 1.1);
        }
        else if (event.getDeltaY() < 0 && rec.getHeight() > 3 && rec.getWidth() > 3 ){
            rec.setHeight(rec.getHeight() * 0.9);
            rec.setWidth(rec.getWidth() * 0.9);
        }
    }
    public void changeColor(MouseEvent event){
        if (event.getButton() == MouseButton.MIDDLE){
            GUIColorPicker dialog = new GUIColorPicker();
            String colorHex = dialog.showAndWait().orElse(null);
            if (colorHex != null){
                color = colorHex;
                rec.setFill(Color.web(colorHex));
            }
        }
    }
    public String getSaveString(){
        String s = "Rectangle * " + Double.toString(x1) + " " + Double.toString(x2) + " * " + Double.toString(y1) + " " + Double.toString(y2) + " * " + 
        Double.toString(transX) + " " + Double.toString(transY) + " * " + Double.toString(rec.getWidth()) + " " + Double.toString(rec.getHeight()) +
         " * " + color + " * " + Double.toString(rotate) + " * (%*#$*(&#&*(%#$*(%&#$*@#$(@#(*$\n";
        return s;
    }
        //name: Rectangle
        //up-left point
        //Trans x & y
        //angle 
        //colorfill
        //width & height

}