import java.util.ArrayList;

import javafx.scene.layout.Pane;

public abstract class FigureBuilder {

    public abstract MyShape buildFigure(ArrayList<Double> x, ArrayList<Double> y);
    
}
