package com.example.assignment_3_java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField dollarsTextField;

    @FXML
    private Label resultLabel;

    private CurrencyConverter converter = new CurrencyConverter();

    @FXML
    private void convertDollarsToRupees() {
        try {
            double dollars = Double.parseDouble(dollarsTextField.getText());
            double rupees = converter.convertDollarsToRupees(dollars);
            resultLabel.setText(String.format("%.2f dollars = %.2f rupees", dollars, rupees));
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid number.");
        }
    }
}
