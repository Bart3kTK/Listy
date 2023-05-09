import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import javafx.stage.FileChooser;

public class Controller {

    @FXML
    private Pane MyPane;


    

    @FXML
    void getInfo(ActionEvent event) {
        new GUIDialog("INFO", "Paint wersja 0.1 \nProgram przeznaczony jest do tworzenia figur :) \n\n\nAutor: Bartosz Kamieniarz\n ");
    }
    @FXML
    void getInstruction(ActionEvent event) {
    }

    @FXML
    void loadFile(ActionEvent event) throws IOException {
        SaveWrite.loadFile(SaveWrite.openChoosFile());

    }

    @FXML
    void saveAs(ActionEvent event) throws IOException {
        SaveWrite.saveFile(SaveWrite.openChoosFile());
    }

    @FXML
    void mouseMoved(ActionEvent event) {

    }

    @FXML
    void mouseReleased(MouseEvent event) {

    }

    @FXML
    void polygonClicked(MouseEvent event) {
        Pointer.resetPointer();
        ShapeStatus.setPolygon();

    }

    @FXML
    void rectangleClicked(MouseEvent event) {
        Pointer.resetPointer();
        ShapeStatus.setRectangle();

    }

    @FXML
    void resetClicked(MouseEvent event) {
        Pointer.resetPointer();
        ShapeStatus.setOnNull();

    }

    @FXML
    void circleClicked(MouseEvent event) {
        Pointer.resetPointer();
        ShapeStatus.setCircle();

    }

    @FXML
    void moveClicked(MouseEvent event) {
        Pointer.resetPointer();
        ShapeStatus.setOnNull();
    }
    


}
