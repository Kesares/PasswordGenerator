package kesares.display.components;

import javax.swing.*;
import java.awt.*;

public class ScrollPane extends JScrollPane {

    public ScrollPane(Builder builder) {
        super(builder.textArea);
        this.setPreferredSize(builder.dimension);
        this.setViewportView(builder.textArea);
    }

    public static class Builder {

        private JTextArea textArea;
        private Dimension dimension;

        public Builder textArea(JTextArea textArea) {
            this.textArea = textArea;
            return this;
        }

        public Builder dimension(Dimension dimension) {
            this.dimension = dimension;
            return this;
        }

        public ScrollPane build() {
            return new ScrollPane(this);
        }
    }
}
