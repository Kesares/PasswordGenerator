package kesares.display.components;

import javax.swing.*;
import java.awt.*;

public final class BMSComponents {

    public static final Label TITLE_LABEL = new Label.Factory().text("Password Generator").font("Arial")
            .fontStyle(Font.BOLD).fontSize(30).create();
    public static final Label NUMBER_OF_PASSOWRDS_LABEL = new Label.Factory().text("Number of Passwords:").font("Arial")
            .fontStyle(Font.PLAIN).fontSize(12).create();
    public static final Label PASSWORD_LENGTH_LABEL = new Label.Factory().text("Password Length:").font("Arial")
            .fontStyle(Font.PLAIN).fontSize(12).create();

    public static final JTextArea TEXT_AREA = new JTextArea();
    public static final ScrollPane SCROLL_PANE = new ScrollPane.Factory().textArea(TEXT_AREA)
            .dimension(new Dimension(400, 300)).create();

    public static final CheckBox UPPER_CASE_CHECK_BOX = new CheckBox.Factory().text("Upper case")
            .backgroundColor(Color.GRAY).selected(true).create();
    public static final CheckBox LOWER_CASE_CHECK_BOX = new CheckBox.Factory().text("Lower case")
            .backgroundColor(Color.GRAY).selected(true).create();
    public static final CheckBox NUMERICS_CHECK_BOX = new CheckBox.Factory().text("Numerics")
            .backgroundColor(Color.GRAY).selected(true).create();
    public static final CheckBox SPECIAL_CHARACTERS_CHECK_BOX = new CheckBox.Factory().text("Special Characters")
            .backgroundColor(Color.GRAY).selected(true).create();

    public static final TextField NUMBER_OF_PASSWORDS_TEXT_FIELD = new TextField.Factory().text("1")
            .dimension(new Dimension(60, 20)).create();
    public static final TextField PASSWORD_LENGTH_TEXT_FIELD = new TextField.Factory().text("20")
            .dimension(new Dimension(60, 20)).create();

    public static final Button GENERATE_BUTTON = new Button.Factory().text("Generate").dimension(new Dimension(120, 25))
            .create();

    public static final MenuBar MENU_BAR = new MenuBar.Factory().titles("File", "Settings").create();

    private BMSComponents() {
        throw new UnsupportedOperationException();
    }
}