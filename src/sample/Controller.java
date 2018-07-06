package sample;

import bean.ReadFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Window;

import java.io.File;

public class Controller {

    private Object Stage;

    @FXML
    private TextField inputTemplate;

    @FXML
    private TextField inputPath;

    @FXML
    private TextField inputFiles;

    @FXML
    private TextField env_var;

    @FXML
    private TextArea feedback;

    private String pathFiles;
    private String pathDoc;
    private String pathTemplate;


    public String openDirectory() {
        String path = "";

        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog((Window) Stage);

        if(selectedDirectory == null){
            System.out.println("No Directory selected");
        }else {
            path = selectedDirectory.getAbsolutePath();
        }
        return path;
    }

    public void handleSubmitPathdesti(ActionEvent actionEvent) {
        String text = openDirectory();
        inputPath.setText(text);
        pathDoc = text;
    }

    public void handleSubmitPathTemplate(ActionEvent actionEvent) {
        String text = openDirectory();
        inputTemplate.setText(text);
        pathTemplate = text;

    }

    public void handleSubmitPathFiles(ActionEvent actionEvent) {
        String text = openDirectory();
        inputFiles.setText(text);
        pathFiles = text;
    }

    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        ReadFile str = new ReadFile(feedback,pathFiles);
        System.out.println(pathFiles);
        str.setTextRead();
    }





}
