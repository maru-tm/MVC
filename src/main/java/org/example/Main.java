package org.example;


import org.example.Controller.CalculatorController;
import org.example.Model.CalculatorModel;
import org.example.View.CalculatorView;

public class Main {
    public static void main(String[] args) {
        // Create Model, View and Controller
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        new CalculatorController(model, view);
    }
}
