package part1.app;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class CalculatorApp extends JFrame {
    public CalculatorApp() {
        setTitle("ماشین حساب گرافیکی");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        DisplayPanel display = new DisplayPanel();
        ButtonPanel button = new ButtonPanel(display);

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(button, BorderLayout.CENTER);

        setVisible(true);


    }

}
