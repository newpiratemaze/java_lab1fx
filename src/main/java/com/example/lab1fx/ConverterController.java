package com.example.lab1fx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

//import javax.swing.*;
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
    protected RadioButton toUn1;
    @FXML
    protected RadioButton toUn2;
    @FXML
    protected RadioButton toUn3;



    @FXML
    protected void handleConvert() {

        ConverterModel model = new ConverterModel();
        String unitFrom = "";
        String unitTo = "";


        if(fromUn1.isSelected())
        {
            unitFrom="Нота";
        }
        else if(fromUn2.isSelected())
        {
            unitFrom="Гц";
        }
        else if(fromUn3.isSelected())
        {
            unitFrom="Длительность";
        }

        if(toUn1.isSelected())
        {
            unitTo="Нота";
        }
        else if(toUn2.isSelected())
        {
            unitTo="Гц";
        }
        else if(toUn3.isSelected())
        {
            unitTo="Длительность";
        }

        String value = String.valueOf(txtFld1.getText());

        String result = model.convert(value,unitFrom,unitTo);

        resultField.setText(result);



    }
}
