package kesares.display.components;

import javax.swing.*;
import java.awt.*;

public class CheckBox extends JCheckBox {

    public CheckBox(Factory factory) {
        this.setText(factory.text);
        this.setBackground(factory.backgroundColor);
        this.setSelected(factory.isSelected);
    }

    public static class Factory {

        private String text;
        private Color backgroundColor;
        private boolean isSelected;

        public Factory text(String text) {
            this.text = text;
            return this;
        }

        public Factory backgroundColor(Color color) {
            this.backgroundColor = color;
            return this;
        }

        public Factory selected(boolean isSelected) {
            this.isSelected = isSelected;
            return this;
        }

        public CheckBox create() {
            return new CheckBox(this);
        }
    }
}