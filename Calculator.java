//import gui libraries
import java.awt.*;
import javax.swing.*;


public class Calculator {

        //calculator variables
        int value1 = 0;
        int value2 = 0;
        boolean operationPressed = false;
        int currentOperation; // 1 = add, 2 = minus, 3 = multiply, 4 = divide
        JFrame frame;
        JLabel displayLabel;

    public Calculator() {

        //set up JFrame
        frame = new JFrame("Calculator");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));
        frame.setLayout(null);
        frame.setVisible(true);

        // sets up the display label
        displayLabel = new JLabel(String.valueOf(value1));
        displayLabel.setFont(new Font("Roboto", Font.BOLD, 36));
        displayLabel.setBounds(0, 50, 800, 100);
        displayLabel.setVisible(true);
        displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(displayLabel);

        // creates number buttons
        NumberButton zeroButton = new NumberButton(0, 100, 625);
        NumberButton oneButton = new NumberButton(1, 100, 500);
        NumberButton twoButton = new NumberButton(2, 225, 500);
        NumberButton threeButton = new NumberButton(3, 350, 500);
        NumberButton fourButton = new NumberButton(4, 100, 375);
        NumberButton fiveButton = new NumberButton(5, 225, 375);
        NumberButton sixButton = new NumberButton(6, 350, 375);
        NumberButton sevenButton = new NumberButton(7, 100, 250);
        NumberButton eightButton = new NumberButton(8, 225, 250);
        NumberButton nineButton = new NumberButton(9, 350, 250);

        // adds number buttons to frame
        frame.add(oneButton.getObject());
        frame.add(twoButton.getObject());
        frame.add(threeButton.getObject());
        frame.add(fourButton.getObject());
        frame.add(fiveButton.getObject());
        frame.add(sixButton.getObject());
        frame.add(sevenButton.getObject());
        frame.add(eightButton.getObject());
        frame.add(nineButton.getObject());
        frame.add(zeroButton.getObject());

        // adds button functionality
        zeroButton.getObject().addActionListener(e -> numberPressed(0));
        oneButton.getObject().addActionListener(e -> numberPressed(1));
        twoButton.getObject().addActionListener(e -> numberPressed(2));
        threeButton.getObject().addActionListener(e -> numberPressed(3));
        fourButton.getObject().addActionListener(e -> numberPressed(4));
        fiveButton.getObject().addActionListener(e -> numberPressed(5));
        sixButton.getObject().addActionListener(e -> numberPressed(6));
        sevenButton.getObject().addActionListener(e -> numberPressed(7));
        eightButton.getObject().addActionListener(e -> numberPressed(8));
        nineButton.getObject().addActionListener(e -> numberPressed(9));

        // creates operation buttons
        OperationButton addButton = new OperationButton("+", 475, 625);
        OperationButton minusButton = new OperationButton("-", 475, 500);
        OperationButton multiplyButton = new OperationButton("x", 475, 375);
        OperationButton divideButton = new OperationButton("/", 475, 250);

        // adds operation buttons to frame
        frame.add(addButton.getObject());
        frame.add(minusButton.getObject());
        frame.add(multiplyButton.getObject());
        frame.add(divideButton.getObject());

        // adds operation button functionality
        addButton.getObject().addActionListener(e -> addPressed());
        minusButton.getObject().addActionListener(e -> minusPressed());
        multiplyButton.getObject().addActionListener(e -> multiplyPressed());
        divideButton.getObject().addActionListener(e -> dividePressed());

        // creates a decimal button
        DecimalButton decimalButton = new DecimalButton(225, 625);

        //adds decimal button to frame
        frame.add(decimalButton.getObject());

        //adds decimal button functionality

        //creates the equals button
        EqualsButton equalsButton = new EqualsButton(350, 625);

        //adds the equals button to frame
        frame.add(equalsButton.getObject());

        //adds equals button functionality
        equalsButton.getObject().addActionListener(e -> equalsPressed());
    }

    // updates the display label
    public void updateDisplayLabel() {
        if (operationPressed == false) {
            displayLabel.setText(String.valueOf(value1));
        }
        else {
            displayLabel.setText(String.valueOf(value2));
        }
    }

    // handles when a number button is pressed
    public void numberPressed(int x) {
        if (operationPressed == false) {
            value1 = (value1 * 10) + x;
            updateDisplayLabel();
        }
        else {
            value2 = (value2 * 10) + x;
            updateDisplayLabel();
        }
    }

    // handles when an operation is pressed
    public void operationPressed() {
        operationPressed = true;
    }

    // handles when "add" is pressed
    public void addPressed() {
        operationPressed();
        currentOperation = 1;
    }

    // handles when "add" is pressed
    public void minusPressed() {
        operationPressed();
        currentOperation = 2;
    }

    // handles when "add" is pressed
    public void multiplyPressed() {
        operationPressed();
        currentOperation = 3;
    }

    // handles when "add" is pressed
    public void dividePressed() {
        operationPressed();
        currentOperation = 4;
    }

    // handles when equals is pressed
    public void equalsPressed() {
        if (operationPressed == true) {
            if (currentOperation == 1) {
                value1 = value1 + value2;
            }
            else if (currentOperation == 2) {
                value1 = value1 - value2;
            }
            else if (currentOperation == 3) {
                value1 = value1 * value2;
            }
            else if (currentOperation == 4) {
                value1 = value1 / value2; // NEED TO IMPLEMENT DOUBLE, NOT INT DIVISION
            }
        }
        operationPressed = false;
        updateDisplayLabel();
        value2 = 0;
    }

    // main
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}


