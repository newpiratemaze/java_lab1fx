package com.example.lab1fx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import javax.swing.*;
import Model.*;

public class ConverterController {

    @FXML
    protected TextField txtFld1;
    @FXML
    protected TextField resultField;
    @FXML
    protected RadioButton fromUn1;
    @FXML
    protected RadioButton fromUn2;
    @FXML
    protected RadioButton fromUn3;



    @FXML
    protected void handleConvert() {

        ConverterModel model = new ConverterModel();
        String unitFrom1 = "UNIT1";
        String unitFrom2 = "UNIT2";
        String unitFrom3 = "UNIT3";
        String unitTo1 = "UNIT1";
        String unitTo2 = "UNIT2";
        String unitTo3 = "UNIT3";

        if(fromUn1.isArmed())
        {

        }


    }
}
