package kesares.display;

import kesares.config.Config;
import kesares.core.PasswordGenerator;
import kesares.password.CharacterSetOptions;
import kesares.password.Password;
import kesares.password.PasswordProperties;
import kesares.util.Parser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {

    private final JLabel label;
    private final JTextArea textArea;
    private final JScrollPane scrollPane;
    private final JCheckBox upperCaseCheckBox;
    private final JCheckBox lowerCaseCheckBox;
    private final JCheckBox numericsCheckBox;
    private final JCheckBox specialCharsCheckBox;
    private final JLabel numberOfPasswordsLabel;
    private final JLabel passwordLengthLabel;
    private final JTextField numberOfPasswordsTextField;
    private final JTextField passwordLengthTextField;
    private final JButton button;

    public Panel(int width, int height) {
        this.setLayout(new FlowLayout());
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(width, height));

        this.label = ComponentFactory.createLabel("Password Generator", Config.FONT, Font.BOLD, Config.LABEL_TITLE_FONT_SIZE);
        this.textArea = new JTextArea();
        this.scrollPane = ComponentFactory.createScrollPane(this.textArea, new Dimension(Config.TEXT_AREA_WIDTH, Config.TEXT_AREA_HEIGHT));
        this.upperCaseCheckBox = ComponentFactory.createCheckbox("Uppercase");
        this.lowerCaseCheckBox = ComponentFactory.createCheckbox("Lowercase");
        this.numericsCheckBox = ComponentFactory.createCheckbox("Numerics");
        this.specialCharsCheckBox = ComponentFactory.createCheckbox("Special Characters");
        this.numberOfPasswordsLabel = ComponentFactory.createLabel("Number of Passwords:", Config.FONT, Font.PLAIN, Config.LABEL_FONT_SIZE);
        this.passwordLengthLabel = ComponentFactory.createLabel("Password Length:", Config.FONT, Font.PLAIN, Config.LABEL_FONT_SIZE);
        this.numberOfPasswordsTextField = ComponentFactory.createTextField("1", new Dimension(Config.TEXT_FIELD_WIDTH, Config.TEXT_FIELD_HEIGHT));
        this.passwordLengthTextField = ComponentFactory.createTextField("20", new Dimension(Config.TEXT_FIELD_WIDTH, Config.TEXT_FIELD_HEIGHT));
        this.button = ComponentFactory.createButton("Generate", new Dimension(Config.BUTTON_WIDTH, Config.BUTTON_HEIGHT));
        this.button.addActionListener(new EventHandler());
        this.addComponents();
    }

    private void addComponents() {
        this.add(this.label);
        this.add(this.scrollPane);
        this.add(this.upperCaseCheckBox);
        this.add(this.lowerCaseCheckBox);
        this.add(this.numericsCheckBox);
        this.add(this.specialCharsCheckBox);
        this.add(this.numberOfPasswordsLabel);
        this.add(this.numberOfPasswordsTextField);
        this.add(this.passwordLengthLabel);
        this.add(this.passwordLengthTextField);
        this.add(this.button);
    }

    private void preparePasswordGeneration() {
        this.textArea.setText("");
        PasswordGenerator generator = PasswordGenerator.getInstance();
        Password[] passwords = generator.generatePasswords(this.getPasswordProperties());
        this.addPasswordsToTextArea(passwords);
    }

    private PasswordProperties getPasswordProperties() {
        int numberOfPasswords = Parser.parseInt(this.numberOfPasswordsTextField.getText());
        int passwordLength = Parser.parseInt(this.passwordLengthTextField.getText());
        return new PasswordProperties(
            numberOfPasswords,
            passwordLength,
            this.getCharacterSetOptions()
        );
    }

    private CharacterSetOptions getCharacterSetOptions() {
        return new CharacterSetOptions(
            this.upperCaseCheckBox.isSelected(),
            this.lowerCaseCheckBox.isSelected(),
            this.numericsCheckBox.isSelected(),
            this.specialCharsCheckBox.isSelected()
        );
    }

    private void addPasswordsToTextArea(Password[] passwords) {
        for (Password password : passwords) {
            this.textArea.append(password.getPassword());
            this.textArea.append("\r\n");
        }
    }

    private class EventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            preparePasswordGeneration();
        }
    }
}