package com.example.guitest;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;

public class HelloController {
    @FXML
    private Button exitButton;
    @FXML
    private Button lanButton;
    @FXML
    private Button sokButton;
    @FXML
    private TextArea resultText;

    @FXML
    private ScrollPane scrollPane;


    @FXML
    protected void onExitButtonClick() {
        System.exit(0);
    }
    @FXML
    protected void onSokButtonClick() {
        resultText.setText("Hej");
    }
    @FXML
    protected void onLanButtonClick() {
        resultText.setText("123464");
    }
}