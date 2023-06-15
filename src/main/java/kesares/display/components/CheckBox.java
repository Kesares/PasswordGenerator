package kesares.display.components;

import kesares.config.Config;

import javax.swing.*;
import java.awt.*;

public class CheckBox extends JCheckBox {

    public CheckBox(Factory factory) {
        this.setText(factory.text);
        this.setBackground(factory.backgroundColor);
        this.setSelected(factory.isSelected);
        this.setForeground(factory.foregroundColor);
    }

    public static class Factory {

        private String text;
        private final Color backgroundColor = Config.CHECK_BOX_BACKGROUND_COLOR;
        private final Color foregroundColor = Config.CHECK_BOX_FOREGROUND_COLOR;
        private final boolean isSelected = true;

        public Factory text(String text) {
            this.text = text;
            return this;
        }

        public CheckBox create() {
            return new CheckBox(this);
        }
    }
}