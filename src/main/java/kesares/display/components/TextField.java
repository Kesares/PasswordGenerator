package kesares.display.components;

import javax.swing.*;
import java.awt.*;

public class TextField extends JTextField {

    public TextField(Factory factory) {
        this.setText(factory.text);
        this.setPreferredSize(factory.dimension);
    }

    public static class Factory {

        private String text;
        private Dimension dimension;

        public Factory text(String text) {
            this.text = text;
            return this;
        }

        public Factory dimension(Dimension dimension) {
            this.dimension = dimension;
            return this;
        }

        public TextField create() {
            return new TextField(this);
        }
    }
}