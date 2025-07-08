// import gui libraries
import javax.swing.*;

public class EqualsButton {
    private int xCoord;
    private int yCoord;
    private JButton button;
    public EqualsButton(int xCoord, int yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;

        button = new JButton("=");
        button.setSize(100, 100);
        button.setLocation(xCoord, yCoord);
        button.setVisible(true);
    }

    public JButton getObject() {
        return button;
    }
}
