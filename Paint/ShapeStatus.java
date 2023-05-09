import java.util.ArrayList;

import javafx.stage.Stage;

public class ShapeStatus {
    private static ArrayList<MyShape> sh = new ArrayList<>();
    private static ArrayList<MyShape> load = new ArrayList<>();

    private static String status = "";
    private static int pointNb = -1;
    private static Stage stage;

    public static void setCircle(){
        status = "Circle";
        pointNb = 2;
    }

    public static void setRectangle(){
        status = "Rectangle";
        pointNb = 2;
    }

    public static void setPolygon(){
        status = "Polygon";
        pointNb = 16;
    }

    public static void setOnNull(){
        status = "";
        pointNb = -1;
    }

    public static String getStatus(){
        return status;
    }

    public static int getPointsNb(){
        return pointNb;
    }
    public static void setNbOfPolygon(){
        if (status == "Polygon") pointNb = Pointer.getNbOfPoints()+1;
    }

    public static Stage getStage(){
        return stage;
    }

    public static void setStage(Stage st){
        stage = st;
    }

    public static void addShape(MyShape s){
        sh.add(s);
    }

    public static ArrayList<MyShape> getShapes(){
        return sh;
    }

    public static void clearShapes(){
        sh.clear(); 
    }

    public static void addLoadShape(MyShape s){
        load.add(s);
    }

    public static ArrayList<MyShape> getLoadShapes(){
        return load;
    }

    public static void clearLoadShapes(){
        load.clear(); 
    }

    
}
