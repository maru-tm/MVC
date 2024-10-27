package org.example.Controller;

import org.example.Model.CalculatorModel;
import org.example.View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private final CalculatorModel model;
    private final CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;

        // Registering an event handler for operation buttons
        view.addOperationListener(new OperationListener());
    }

    // Event handler for operation buttons
    private class OperationListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double num1 = view.getFirstNumber();
                double num2 = view.getSecondNumber();
                double result = 0;

                switch (e.getActionCommand()) {
                    case "+" -> result = model.add(num1, num2);
                    case "-" -> result = model.subtract(num1, num2);
                    case "*" -> result = model.multiply(num1, num2);
                    case "/" -> result = model.divide(num1, num2);
                }

                view.setResult(String.valueOf(result));
            } catch (NumberFormatException ex) {
                view.setResult("Ошибка: неверный формат числа");
            } catch (ArithmeticException ex) {
                view.setResult(ex.getMessage());
            }
        }
    }
}
