import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFileChooser;

import javafx.scene.paint.Color;
import javafx.stage.FileChooser;

public class SaveWrite {


    public static String openChoosFile(){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Wybierz plik");
        File plik = fileChooser.showOpenDialog(ShapeStatus.getStage());
        if (plik != null) {
            for (char c : plik.getName().toCharArray()) {
                if (c == '.') return "";
            }
            return plik.getAbsolutePath();
        }
        else return "";
            
    }



    public static void saveFile(String title){

        if (title != ""){

            FileWriter writer;
            try {
                writer = new FileWriter(title);
                for (MyShape shape : ShapeStatus.getShapes())
                    writer.write(shape.getSaveString());
                writer.close();
            } catch (IOException e) {              
                new GUIDialog("Error", e.getMessage());
            }
        }
    }

    public static void loadFile(String title){
        if (title != ""){
            ShapeStatus.clearShapes();
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(title));
                String linia = reader.readLine();
                ShapeStatus.clearLoadShapes();
                while (linia != null) {
                    ArrayList<String> line = new ArrayList<>(Arrays.asList(linia.split(" ")));
                    int starCounter = 0;
                    ArrayList<Double> X = new ArrayList<Double>();
                    ArrayList<Double> Y = new ArrayList<Double>();
                    ArrayList<Double> trans = new ArrayList<Double>();
                    ArrayList<Double> unique = new ArrayList<Double>();
                    String color = "";
                    Double rotate = 0.0;
                    for (String c : line){
                        if (c.length() == 1){
                            starCounter ++;
                            continue;
                        }
                        switch (starCounter){
                            case 0:
                                break;
                            case 1: 
                                X.add(Double.parseDouble(c));
                                break;
                            case 2: 
                                Y.add(Double.parseDouble(c));
                                break;
                            case 3:
                                trans.add(Double.parseDouble(c));
                                break;
                            case 4:
                                unique.add(Double.parseDouble(c));
                                break;
                            case 5:
                                color = c;
                                break;
                            case 6:
                                rotate = Double.parseDouble(c);
                                break;
                                
                            case 7:
                            System.out.println(line.get(0));
                                switch (line.get(0)){
                            
                                    case "Circle":
                                        MyCircle circle = new MyCircle(X, Y);
                                        circle.getShape().setTranslateX(trans.get(0));
                                        circle.getShape().setTranslateY(trans.get(1));
                                        circle.getShape().setRadius(unique.get(0));
                                        circle.getShape().setFill(Color.web(color));
                                        ShapeStatus.addLoadShape((MyShape) circle);
                                        break;
                                    case "Rectangle":
                                        MyRectangle rec = new MyRectangle(X, Y);
                                        rec.getShape().setTranslateX(trans.get(0));
                                        rec.getShape().setTranslateY(trans.get(1));
                                        rec.getShape().setWidth(unique.get(0));
                                        rec.getShape().setHeight(unique.get(1));
                                        rec.getShape().setFill(Color.web(color));
                                        rec.getShape().setRotate(rotate);
                                        ShapeStatus.addLoadShape((MyShape) rec);
                                        break;
                                    case "Polygon":
                                    MyPolygon pol = new MyPolygon(X, Y);
                                        pol.getShape().setTranslateX(trans.get(0));
                                        pol.getShape().setTranslateY(trans.get(1));
                                        pol.getShape().setScaleX(unique.get(0));
                                        pol.getShape().setScaleY(unique.get(1));
                                        pol.getShape().setFill(Color.web(color));
                                        pol.getShape().setRotate(rotate);
                                        ShapeStatus.addLoadShape((MyShape) pol);
                                        break;
                                    default:
                                        continue;
                                    }
                            default:
                                break;   
                        }
                    }
                    linia = reader.readLine();
                }
                reader.close();
            }
            catch (FileNotFoundException e) {
                new GUIDialog("Error", "Loading file Error!");
            }
            catch (IOException e) {
                new GUIDialog("Error", "Loading file Error!");
            }
            catch (RuntimeException e) {
                new GUIDialog("Error", "Loading file Error!");
            }

        }
    }
}
