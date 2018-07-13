package sample;

import bean.ReadFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
    private String environment_var;

    public void initialize() {
        final String dir = System.getProperty("user.dir");
        inputTemplate.setText(dir + "/../templates");
        inputPath.setText(dir + "/../jcl");
        inputFiles.setText(dir + "/../docs");
    }


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
        //pathDoc = text;
    }

    public void handleSubmitPathTemplate(ActionEvent actionEvent) {
        String text = openDirectory();
        inputTemplate.setText(text);
        //pathTemplate = text;

    }

    public void handleSubmitPathFiles(ActionEvent actionEvent) {
        String text = openDirectory();
        inputFiles.setText(text);
        //pathFiles = text;
    }

    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        //variables locales
        StringBuilder  errors = new StringBuilder();
        Boolean runing = false;

        //Variables
        pathDoc = inputPath.getText();
        pathTemplate = inputTemplate.getText();
        pathFiles = inputFiles.getText();
        environment_var = env_var.getText();


        File fileDoc = new File(pathDoc);
        File fileTemplate = new File(pathTemplate);
        File fileJobs = new File(pathFiles);

        //Exist the directories
        if (!fileDoc.isDirectory()) {
            errors.append(pathDoc + " No existe\n");
            runing = true;
        }

        if (!fileTemplate.isDirectory()){
            errors.append(fileTemplate + " No existe\n");
            runing = true;
        }

        if (!fileJobs.isDirectory()){
            errors.append(fileJobs + " No existe\n");
            runing = true;
        }


        if (runing) {
            //System.out.println(errors.toString());
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Directorios");
            alert.setHeaderText("Algun directorio no existe");
            alert.setContentText(errors.toString());
            alert.showAndWait();
        }else{
            System.out.println("RUN");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Jobs creados");
            alert.setHeaderText("Los siguientes jobs se han creado:");
            alert.setContentText("XWO1321D");
            alert.showAndWait();
        }




        ReadFile str = new ReadFile(feedback,pathFiles);
        //System.out.println(pathDoc+" "+pathTemplate+" "+pathFiles);
        str.setTextRead();

    }





}
