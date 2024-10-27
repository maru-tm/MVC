package org.example.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private final JTextField firstnum = new JTextField(10);
    private final JTextField secondnum = new JTextField(10);
    private final JButton addition = new JButton("+");
    private final JButton substraction = new JButton("-");
    private final JButton multiplication = new JButton("*");
    private final JButton division = new JButton("/");
    private final JLabel resultLabel = new JLabel("Результат: ");
    public CalculatorView(){
        // Window Settings
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Adding components to the window
        add(new JLabel("Число 1:"));
        add(firstnum);
        add(new JLabel("Число 2:"));
        add(secondnum);

        // Panel with operation buttons
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(addition);
        buttonsPanel.add(substraction);
        buttonsPanel.add(multiplication);
        buttonsPanel.add(division);
        add(buttonsPanel);

        // Adding a label for the result
        add(resultLabel);

        // Window settings
        pack();
        setLocationRelativeTo(null); // Centering the window
        setVisible(true);
    }
    public double getFirstNumber() throws NumberFormatException {
        return Double.parseDouble(firstnum.getText());
    }
    public double getSecondNumber() throws NumberFormatException {
        return Double.parseDouble(secondnum.getText());
    }
    public void setResult(String result) {
        resultLabel.setText("Результат: " + result);
    }
    public void addOperationListener(ActionListener listener) {
        addition.addActionListener(listener);
        substraction.addActionListener(listener);
        multiplication.addActionListener(listener);
        division.addActionListener(listener);
    }
}
