package sample;

import javafx.event.ActionEvent;
import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;

public class Controller {

    private Object Stage;

    @FXML
    private TextField inputText;


    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog((Window) Stage);
        /*TextField test = new T;*/

        if(selectedDirectory == null){
            System.out.println("No Directory selected");
        }else {
            System.out.println(selectedDirectory.getAbsolutePath());
            inputText.setText(selectedDirectory.getAbsolutePath());
        }
    }
}
