package part2.app;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private ShowPanel showPanel;
    private ControlPanel controlPanel;

    public MainFrame() {
        setTitle("Image Scaler");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        setLayout(new BorderLayout());

        // Initialize the panels
        showPanel = new ShowPanel();
        controlPanel = new ControlPanel(showPanel);

        // Add panels to the frame
        add(showPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}