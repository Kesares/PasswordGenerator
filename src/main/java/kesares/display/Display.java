package kesares.display;

import kesares.config.Config;
import kesares.display.components.UIComponents;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Display {

    public Display(int width, int height) {
        JFrame frame = new JFrame("Password Generator " + Config.VERSION);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.add(new Panel(width, height));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setJMenuBar(UIComponents.MENU_BAR);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}