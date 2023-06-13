package kesares.display.components;

import javax.swing.*;
import java.awt.*;

public class ScrollPane extends JScrollPane {

    public ScrollPane(Factory factory) {
        super(factory.textArea);
        this.setPreferredSize(factory.dimension);
        this.setViewportView(factory.textArea);
    }

    public static class Factory {

        private JTextArea textArea;
        private Dimension dimension;

        public Factory textArea(JTextArea textArea) {
            this.textArea = textArea;
            return this;
        }

        public Factory dimension(Dimension dimension) {
            this.dimension = dimension;
            return this;
        }

        public ScrollPane create() {
            return new ScrollPane(this);
        }
    }
}
