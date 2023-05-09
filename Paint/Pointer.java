import java.util.ArrayList;

public class Pointer {

    private static ArrayList<Double> x = new ArrayList<Double>();
    private static ArrayList<Double> y = new ArrayList<Double>();
    private static double X = 0;
    private static double Y = 0;


    public static ArrayList<Double> getX() {
        return x;
    }
    public static ArrayList<Double> getY() {
        return y;
    }
    
    public static void addPoint(double X, double Y){
        x.add(X);
        y.add(Y);
    }
    public static void resetPointer(){
        x = new ArrayList<Double>();
        y = new ArrayList<Double>();
    }
    public static int getNbOfPoints(){
        return x.size();
    }
    public static void setMousePaneCoords(double a, double b){ 
        X = a;
        Y = b;
    }
    public static double getPaneX(){ 
        return X;
    }
    public static double getPaneY(){ 
        return Y;
    }

}
