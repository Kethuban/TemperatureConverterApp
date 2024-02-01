package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label sentence;
    @FXML
    private TextField temperatureTextField;

    @FXML
    public void celsiusButton()
    {
        sentence.setText("The temperature is " + ((Float.parseFloat(temperatureTextField.getText())- 32) * (5.0/9.0)));
    }
    @FXML
    public void fahrenheitButton()
    {
        sentence.setText("The temperature is " + ((Float.parseFloat(temperatureTextField.getText())* (9.0/5.0)) + 32));
    }
}