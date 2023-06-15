package kesares.display;

import kesares.config.Config;
import kesares.core.PasswordGenerator;
import kesares.display.components.UIComponents;
import kesares.password.CharacterSetOptions;
import kesares.password.Password;
import kesares.password.PasswordProperties;
import kesares.util.Parser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {

    public Panel(int width, int height) {
        this.setLayout(new FlowLayout());
        this.setBackground(Config.PANEL_BACKGROUND_COLOR);
        this.setPreferredSize(new Dimension(width, height));
        this.addComponents();
        UIComponents.GENERATE_BUTTON.addActionListener(new EventHandler());
    }

    private void addComponents() {
        this.add(UIComponents.TITLE_LABEL);
        this.add(UIComponents.SCROLL_PANE);
        this.add(UIComponents.UPPER_CASE_CHECK_BOX);
        this.add(UIComponents.LOWER_CASE_CHECK_BOX);
        this.add(UIComponents.NUMERICS_CHECK_BOX);
        this.add(UIComponents.SPECIAL_CHARACTERS_CHECK_BOX);
        this.add(UIComponents.NUMBER_OF_PASSOWRDS_LABEL);
        this.add(UIComponents.NUMBER_OF_PASSWORDS_TEXT_FIELD);
        this.add(UIComponents.PASSWORD_LENGTH_LABEL);
        this.add(UIComponents.PASSWORD_LENGTH_TEXT_FIELD);
        this.add(UIComponents.GENERATE_BUTTON);
    }

    private void preparePasswordGeneration() {
        UIComponents.TEXT_AREA.setText("");
        PasswordGenerator generator = PasswordGenerator.getInstance();
        Password[] passwords = generator.generatePasswords(this.getPasswordProperties());
        this.addPasswordsToTextArea(passwords);
    }

    private PasswordProperties getPasswordProperties() {
        int numberOfPasswords = Parser.parseInt(UIComponents.NUMBER_OF_PASSWORDS_TEXT_FIELD.getText());
        int passwordLength = Parser.parseInt(UIComponents.PASSWORD_LENGTH_TEXT_FIELD.getText());
        return new PasswordProperties(
            numberOfPasswords,
            passwordLength,
            this.getCharacterSetOptions()
        );
    }

    private CharacterSetOptions getCharacterSetOptions() {
        return new CharacterSetOptions(
            UIComponents.UPPER_CASE_CHECK_BOX.isSelected(),
            UIComponents.LOWER_CASE_CHECK_BOX.isSelected(),
            UIComponents.NUMERICS_CHECK_BOX.isSelected(),
            UIComponents.SPECIAL_CHARACTERS_CHECK_BOX.isSelected()
        );
    }

    private void addPasswordsToTextArea(Password[] passwords) {
        for (Password password : passwords) {
            UIComponents.TEXT_AREA.append(password.getPassword());
            UIComponents.TEXT_AREA.append("\r\n");
        }
    }

    private class EventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            preparePasswordGeneration();
        }
    }
}