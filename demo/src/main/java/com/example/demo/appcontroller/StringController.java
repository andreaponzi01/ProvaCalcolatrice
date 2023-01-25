package com.example.demo.appcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class StringController {
    @FXML
    private TextField stringA;
    @FXML
    private TextField stringB;
    @FXML
    private Text result1;
    @FXML
    private Text result4;
    @FXML
    private Text result2;
    @FXML
    private Text result3;
    @FXML
    private Button action1;
    @FXML
    private Button action2;
    @FXML
    private Button action3;
    @FXML
    private Button action4;

    @FXML
    private void action1(ActionEvent ae){
        result1.setText(stringA.getText());
    }
    @FXML
    private void action2(ActionEvent ae){
        result2.setText(stringB.getText());
    }
    @FXML
    private void action3(ActionEvent ae){
        result3.setText(stringA.getText()+stringB.getText());
    }
    @FXML
    private void action4(ActionEvent ae){
        result4.setText(stringB.getText()+stringA.getText());
    }
}