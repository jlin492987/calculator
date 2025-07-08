//import gui libraries
import javax.swing.*;

public class NumberButton {
    private int value;
    private int xCoord;
    private int yCoord;
    private JButton button;
    public NumberButton(int value, int xCoord, int yCoord) {
        this.value = value;
        this.xCoord = xCoord;
        this.yCoord = yCoord;

        button = new JButton(String.valueOf(value));
        button.setSize(100, 100);
        button.setLocation(xCoord, yCoord);
        button.setVisible(true);
    }

    public JButton getObject() {
        return button;
    }
}

