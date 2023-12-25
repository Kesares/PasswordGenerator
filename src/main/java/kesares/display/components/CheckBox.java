package kesares.display.components;

import kesares.config.Config;

import javax.swing.*;
import java.awt.*;

public class CheckBox extends JCheckBox {

    public CheckBox(Builder builder) {
        this.setText(builder.text);
        this.setBackground(builder.backgroundColor);
        this.setSelected(builder.isSelected);
        this.setForeground(builder.foregroundColor);
    }

    public static class Builder {

        private String text;
        private final Color backgroundColor = Config.CHECK_BOX_BACKGROUND_COLOR;
        private final Color foregroundColor = Config.CHECK_BOX_FOREGROUND_COLOR;
        private final boolean isSelected = true;

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public CheckBox build() {
            return new CheckBox(this);
        }
    }
}