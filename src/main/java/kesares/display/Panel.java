package kesares.display;

import kesares.core.PasswordGenerator;
import kesares.display.components.BMSComponents;
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
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(width, height));
        this.addComponents();
        BMSComponents.GENERATE_BUTTON.addActionListener(new EventHandler());
    }

    private void addComponents() {
        this.add(BMSComponents.TITLE_LABEL);
        this.add(BMSComponents.SCROLL_PANE);
        this.add(BMSComponents.UPPER_CASE_CHECK_BOX);
        this.add(BMSComponents.LOWER_CASE_CHECK_BOX);
        this.add(BMSComponents.NUMERICS_CHECK_BOX);
        this.add(BMSComponents.SPECIAL_CHARACTERS_CHECK_BOX);
        this.add(BMSComponents.NUMBER_OF_PASSOWRDS_LABEL);
        this.add(BMSComponents.NUMBER_OF_PASSWORDS_TEXT_FIELD);
        this.add(BMSComponents.PASSWORD_LENGTH_LABEL);
        this.add(BMSComponents.PASSWORD_LENGTH_TEXT_FIELD);
        this.add(BMSComponents.GENERATE_BUTTON);
    }

    private void preparePasswordGeneration() {
        BMSComponents.TEXT_AREA.setText("");
        PasswordGenerator generator = PasswordGenerator.getInstance();
        Password[] passwords = generator.generatePasswords(this.getPasswordProperties());
        this.addPasswordsToTextArea(passwords);
    }

    private PasswordProperties getPasswordProperties() {
        int numberOfPasswords = Parser.parseInt(BMSComponents.NUMBER_OF_PASSWORDS_TEXT_FIELD.getText());
        int passwordLength = Parser.parseInt(BMSComponents.PASSWORD_LENGTH_TEXT_FIELD.getText());
        return new PasswordProperties(
            numberOfPasswords,
            passwordLength,
            this.getCharacterSetOptions()
        );
    }

    private CharacterSetOptions getCharacterSetOptions() {
        return new CharacterSetOptions(
            BMSComponents.UPPER_CASE_CHECK_BOX.isSelected(),
            BMSComponents.LOWER_CASE_CHECK_BOX.isSelected(),
            BMSComponents.NUMERICS_CHECK_BOX.isSelected(),
            BMSComponents.SPECIAL_CHARACTERS_CHECK_BOX.isSelected()
        );
    }

    private void addPasswordsToTextArea(Password[] passwords) {
        for (Password password : passwords) {
            BMSComponents.TEXT_AREA.append(password.getPassword());
            BMSComponents.TEXT_AREA.append("\r\n");
        }
    }

    private class EventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            preparePasswordGeneration();
        }
    }
}