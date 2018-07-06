package sample;

import javafx.event.ActionEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Controller {

    private Object Stage;

    public void handleSubmitButtonAction(ActionEvent actionEvent) {


        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.showOpenDialog((Window) Stage);

        System.out.println(fileChooser.getTitle());
        System.out.println(fileChooser.getExtensionFilters());
        System.out.println(fileChooser.getInitialDirectory());
        System.out.println(fileChooser.getInitialFileName());
        System.out.println(fileChooser.getSelectedExtensionFilter());
    }
}
