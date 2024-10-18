package com.example.apps;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField login;

    @FXML
    private PasswordField password;

    @FXML
    private Button regButton;

    @FXML
    private Button signButton;

    @FXML
    private Label welcomeText;

    @FXML
    void  initialize(){
        signButton.setOnAction( event -> {
            System.out.println("Вы нажали на кнопку Войти");
        } );
    }

}