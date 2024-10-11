package org.example.switchscene;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText2;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        //welcomeText.setText("Welcome to JavaFX Application!");
        Stage stage = (Stage)welcomeText.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage.setScene(new Scene(parent));
       // stage.initStyle(StageStyle.TRANSPARENT);
        //stage.show();
    }
    @FXML
    private void retur() throws IOException {
        Stage stage = (Stage) welcomeText2.getScene().getWindow();
        Parent parent = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        stage.setScene(new Scene(parent));
       // stage.show();
    }
}