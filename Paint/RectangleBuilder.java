import java.util.ArrayList;

import javafx.scene.layout.Pane;

public class RectangleBuilder extends FigureBuilder{

    @Override
    public MyShape buildFigure(ArrayList<Double> x, ArrayList<Double> y){
        return new MyRectangle(x,y);
    }
    
}
