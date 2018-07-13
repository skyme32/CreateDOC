package bean;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Window;

public class ReadFile {

    private TextArea feedback;
    private String path;

    public ReadFile(TextArea feedback, String path) {
        this.feedback = feedback;
        this.path = path;
    }

    public void setTextRead() {
        feedback.setText(path);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
