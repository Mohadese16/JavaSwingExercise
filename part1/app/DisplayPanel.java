package part1.app;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {
    private JTextField displayField;

    public DisplayPanel() {

        setLayout(new BorderLayout());


        displayField = new JTextField();
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        displayField.setHorizontalAlignment(JTextField.LEFT);


        setPreferredSize(new Dimension(200, 70));
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));


        add(displayField, BorderLayout.CENTER);
    }

    public String getExpression() {
        return displayField.getText();
    }

    public void setExpression(String expr) {
        displayField.setText(expr);
    }
}
