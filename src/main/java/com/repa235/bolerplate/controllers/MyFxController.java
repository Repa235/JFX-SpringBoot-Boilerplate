package com.repa235.bolerplate.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.stereotype.Component;

@Component
public class MyFxController {

    @FXML
    private Label greetingLabel;

    @FXML
    public void initialize() {
        greetingLabel.setText("Ciao da Spring Boot e JavaFX!");
    }
}
