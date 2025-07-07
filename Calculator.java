
//import gui libraries
import java.awt.*;
import javax.swing.*;


public class Calculator {

    public Calculator() {

        //set up JFrame
        JFrame frame = new JFrame("Calculator");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(800, 800));
        frame.setLayout(null);
        frame.setVisible(true);

        // sets up the display label
        JLabel displayLabel = new JLabel("0");
        displayLabel.setFont(new Font("Roboto", Font.BOLD, 36));
        displayLabel.setBounds(0, 50, 800, 100);
        displayLabel.setVisible(true);
        displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(displayLabel);

        // creates number buttons
        NumberButton oneButton = new NumberButton(1, 100, 500);
        NumberButton twoButton = new NumberButton(2, 225, 500);
        NumberButton threeButton = new NumberButton(3, 350, 500);
        NumberButton fourButton = new NumberButton(4, 100, 375);
        NumberButton fiveButton = new NumberButton(5, 225, 375);
        NumberButton sixButton = new NumberButton(6, 350, 375);
        NumberButton sevenButton = new NumberButton(7, 100, 250);
        NumberButton eightButton = new NumberButton(8, 225, 250);
        NumberButton nineButton = new NumberButton(9, 350, 250);
        NumberButton zeroButton = new NumberButton(0, 100, 625);

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
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }
}


