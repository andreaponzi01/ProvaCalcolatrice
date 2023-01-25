package com.example.demo.appcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField txt_result;
    private String op="";
    private int c=0;
    private int x=0;
    private long num1;


    @FXML
    private void Number(ActionEvent ae){
        String no=((Button)ae.getSource()).getText();
        if(c==0)
        {
            txt_result.setText(txt_result.getText()+no);
        }
        else
        {
            if(x==0)
            {
                txt_result.setText("");
                x=1;
            }
            txt_result.setText(txt_result.getText()+no);
        }
    }
    @FXML
    private void Operation(ActionEvent ae){
        String operation=((Button)ae.getSource()).getText();
        if(!operation.equals("=")) {
            if (!op.equals("")) {
                return;
            }
            op = operation;
            num1 = Long.parseLong(txt_result.getText());
            txt_result.setText("");

        }
        else
        {
            if(op.equals("")){
                return;
            }
            long num2 = Long.parseLong(txt_result.getText());
            calcolatrice(num1, num2,op);
            String op2 = op;
            op="";
            c=1;
            x=0;
        }


    }

    private void calcolatrice(long n1,long n2,String op){
        switch (op) {
            case "+" -> txt_result.setText(n1 + n2 + "");
            case "-" -> txt_result.setText(n1 - n2 + "");
            case "*" -> txt_result.setText(n1 * n2 + "");
            case "/" -> {
                if (n2 == 0) {
                    txt_result.setText("0");
                    break;
                }
                txt_result.setText(n1 / n2 + "");
            }
        }
    }
}