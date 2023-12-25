package kesares.display.components;

import kesares.config.Config;

import javax.swing.*;
import java.awt.*;

public class TextArea extends JTextArea {

    public TextArea(Builder builder) {
        this.setBackground(builder.backgroundColor);
        this.setForeground(builder.foregroundColor);
    }

    public static class Builder {

        private final Color backgroundColor = Config.TEXT_AREA_BACKGROUND_COLOR;
        private final Color foregroundColor = Config.TEXT_AREA_FOREGRUND_COLOR;

        public TextArea build() {
            return new TextArea(this);
        }
    }
}