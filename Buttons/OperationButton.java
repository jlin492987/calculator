// import gui libraries
import javax.swing.*;

public class OperationButton {
    String operation;
    private int xCoord;
    private int yCoord;
    private JButton button;
    public OperationButton(String operation, int xCoord, int yCoord) {
        this.operation = operation;
        this.xCoord = xCoord;
        this.yCoord = yCoord;

        button = new JButton(operation);
        button.setSize(100, 100);
        button.setLocation(xCoord, yCoord);
        button.setVisible(true);
    }

    public JButton getObject() {
        return button;
    }
}
