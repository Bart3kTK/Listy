import javafx.scene.control.ButtonType;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Dialog;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class GUIColorPicker extends Dialog<String> {
    private ColorPicker colorPicker;

    public GUIColorPicker() {
        setTitle("Wybierz kolor");

        colorPicker = new ColorPicker();
        colorPicker.setValue(Color.WHITE);

        VBox vbox = new VBox(colorPicker);
        getDialogPane().setContent(vbox);

        ButtonType okButton= new ButtonType("OK");
        getDialogPane().getButtonTypes().addAll(okButton, ButtonType.CANCEL);

        setResultConverter(event -> {
            if (event == okButton) {
                return colorPicker.getValue().toString().substring(2, 8);
            }
            return null;
        });
    }
}
