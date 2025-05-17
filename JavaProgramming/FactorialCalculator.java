package JavaProgramming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculator extends JFrame {
    private JTextField numberField;
    private JLabel resultLabel;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter a number:");
        numberField = new JTextField(10);
        JButton computeButton = new JButton("Compute Factorial");
        resultLabel = new JLabel("Result: ");

        computeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(numberField.getText());
                    long factorial = computeFactorial(num);
                    resultLabel.setText("Result: " + factorial);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Enter an integer.");
                }
            }
        });

        add(label);
        add(numberField);
        add(computeButton);
        add(resultLabel);

        setVisible(true);
    }

    private long computeFactorial(int num) {
        if (num < 0) return -1; // Factorial not defined for negative numbers
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        new FactorialCalculator();
    }
}



