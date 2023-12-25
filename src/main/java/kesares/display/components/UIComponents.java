package kesares.display.components;

import javax.swing.*;
import java.awt.*;

public final class UIComponents {

    public static final Label TITLE_LABEL = new Label.Builder().fontStyle(Font.BOLD).fontSize(30).build();
    public static final Label NUMBER_OF_PASSOWRDS_LABEL = new Label.Builder().build();
    public static final Label PASSWORD_LENGTH_LABEL = new Label.Builder().build();

    public static final TextArea TEXT_AREA = new TextArea.Builder().build();
    public static final ScrollPane SCROLL_PANE = new ScrollPane.Builder().textArea(TEXT_AREA).dimension(new Dimension(400, 300)).build();

    public static final CheckBox UPPER_CASE_CHECK_BOX = new CheckBox.Builder().build();
    public static final CheckBox LOWER_CASE_CHECK_BOX = new CheckBox.Builder().build();
    public static final CheckBox NUMERICS_CHECK_BOX = new CheckBox.Builder().build();
    public static final CheckBox SPECIAL_CHARACTERS_CHECK_BOX = new CheckBox.Builder().build();

    public static final TextField NUMBER_OF_PASSWORDS_TEXT_FIELD = new TextField.Builder().text("1").build();
    public static final TextField PASSWORD_LENGTH_TEXT_FIELD = new TextField.Builder().text("20").build();

    public static final Button GENERATE_BUTTON = new Button.Builder().dimension(new Dimension(120, 25)).build();

    public static final JMenuItem ENGLISH_MENU_ITEM = new JMenuItem();
    public static final JMenuItem GERMAN_MENU_ITEM = new JMenuItem();
    public static final JMenuItem SAVE_MENU_ITEM = new JMenuItem();
    public static final JMenuItem HELP_MENU_ITEM = new JMenuItem();

    public static final Menu FILE_MENU = new Menu.Builder().menuItems(SAVE_MENU_ITEM).build();
    public static final Menu SETTINGS_MENU = new Menu.Builder().menuItems(HELP_MENU_ITEM).build();
    public static final Menu LANGUAGE_MENU = new Menu.Builder().menuItems(ENGLISH_MENU_ITEM, GERMAN_MENU_ITEM).build();

    public static final MenuBar MENU_BAR = new MenuBar.Builder().menu(FILE_MENU, SETTINGS_MENU, LANGUAGE_MENU).build();


    private UIComponents() {
        throw new UnsupportedOperationException();
    }
}