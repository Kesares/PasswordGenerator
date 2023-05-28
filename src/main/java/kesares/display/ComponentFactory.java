package kesares.display;

import javax.swing.*;
import java.awt.*;

public final class ComponentFactory {

    private ComponentFactory() {
        throw new UnsupportedOperationException();
    }

    public static JLabel createLabel(String title, String font, int fontStyle, int fontSize) {
        JLabel label = new JLabel(title);
        label.setForeground(Color.BLACK);
        label.setFont(new Font(font, fontStyle, fontSize));
        return label;
    }

    public static JMenuBar createMenuBar(String... titles) {
        JMenuBar menu = new JMenuBar();
        for (String title : titles) {
            menu.add(new JMenu(title));
        }
        return menu;
    }

    public static JCheckBox createCheckbox(String text) {
        JCheckBox checkBox = new JCheckBox(text);
        checkBox.setBackground(Color.GRAY);
        checkBox.setSelected(true);
        return checkBox;
    }

    public static JTextField createTextField(String text, Dimension dimension) {
        JTextField textField = new JTextField(text);
        textField.setPreferredSize(dimension);
        return textField;
    }

    public static JButton createButton(String text, Dimension dimension) {
        JButton button = new JButton(text);
        button.setSize(dimension);
        return button;
    }

    public static JScrollPane createScrollPane(JTextArea textArea, Dimension dimension) {
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(dimension);
        scrollPane.setViewportView(textArea);
        return scrollPane;
    }
}