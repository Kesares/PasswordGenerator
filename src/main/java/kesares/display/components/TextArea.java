package kesares.display.components;

import kesares.config.Config;

import javax.swing.*;
import java.awt.*;

public class TextArea extends JTextArea {

    public TextArea(Factory factory) {
        this.setBackground(factory.backgroundColor);
        this.setForeground(factory.foregroundColor);
    }

    public static class Factory {

        private final Color backgroundColor = Config.TEXT_AREA_BACKGROUND_COLOR;
        private final Color foregroundColor = Config.TEXT_AREA_FOREGRUND_COLOR;

        public TextArea create() {
            return new TextArea(this);
        }
    }
}