package kesares.display;

import kesares.config.Config;
import kesares.core.PasswordGenerator;
import kesares.display.components.UIComponents;
import kesares.password.CharacterSetOptions;
import kesares.password.Password;
import kesares.password.PasswordProperties;
import kesares.util.Parser;
import kesares.util.ResourceBundleLibrary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

public class Panel extends JPanel {

    public Panel(int width, int height) {
        this.setLayout(new FlowLayout());
        this.setBackground(Config.PANEL_BACKGROUND_COLOR);
        this.setPreferredSize(new Dimension(width, height));
        this.setLanguageResources(Locale.ENGLISH);
        this.addComponents();
        this.addActionListeners();
    }

    private void setLanguageResources(Locale locale) {
        ResourceBundleLibrary bundleLibrary = ResourceBundleLibrary.getInstance();
        bundleLibrary.loadResourceBundles(locale);
        ResourceBundle bundle = bundleLibrary.getResourceBundle(ResourceBundleLibrary.DISPLAY_BUNDLE);

        UIComponents.TITLE_LABEL.setText(bundle.getString("title"));
        UIComponents.NUMBER_OF_PASSOWRDS_LABEL.setText(bundle.getString("numberOfPasswords"));
        UIComponents.PASSWORD_LENGTH_LABEL.setText(bundle.getString("passwordLength"));
        UIComponents.UPPER_CASE_CHECK_BOX.setText(bundle.getString("upperCase"));
        UIComponents.LOWER_CASE_CHECK_BOX.setText(bundle.getString("lowerCase"));
        UIComponents.NUMERICS_CHECK_BOX.setText(bundle.getString("numerics"));
        UIComponents.SPECIAL_CHARACTERS_CHECK_BOX.setText(bundle.getString("specialChars"));
        UIComponents.GENERATE_BUTTON.setText(bundle.getString("generate"));
        UIComponents.FILE_MENU.setText(bundle.getString("file"));
        UIComponents.SETTINGS_MENU.setText(bundle.getString("settings"));
        UIComponents.LANGUAGE_MENU.setText(bundle.getString("language"));
        UIComponents.ENGLISH_MENU_ITEM.setText(bundle.getString("en"));
        UIComponents.GERMAN_MENU_ITEM.setText(bundle.getString("de"));
        UIComponents.SAVE_MENU_ITEM.setText(bundle.getString("save"));
        UIComponents.HELP_MENU_ITEM.setText(bundle.getString("help"));
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

    private void addActionListeners() {
        EventHandler handler = new EventHandler();
        UIComponents.GENERATE_BUTTON.addActionListener(handler);
        UIComponents.ENGLISH_MENU_ITEM.addActionListener(handler);
        UIComponents.GERMAN_MENU_ITEM.addActionListener(handler);
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
            if (event.getSource() == UIComponents.GENERATE_BUTTON) {
                preparePasswordGeneration();
            } else if (event.getSource() == UIComponents.ENGLISH_MENU_ITEM) {
                setLanguageResources(Locale.ENGLISH);
            } else if (event.getSource() == UIComponents.GERMAN_MENU_ITEM) {
                setLanguageResources(Locale.GERMAN);
            } else if (event.getSource() == UIComponents.SAVE_MENU_ITEM) {
                System.out.println(event.getSource());
            } else if (event.getSource() == UIComponents.HELP_MENU_ITEM) {
                System.out.println(event.getSource());
            }
        }
    }
}