import java.util.ArrayList;

import javafx.scene.layout.Pane;

public class PolygonBuilder extends FigureBuilder{

    @Override
    public MyShape buildFigure(ArrayList<Double> x, ArrayList<Double> y){
        return new MyPolygon(x,y);
    }
    
}
