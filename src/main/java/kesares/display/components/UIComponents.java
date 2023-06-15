package kesares.display.components;

import java.awt.*;

public final class UIComponents {

    public static final Label TITLE_LABEL = new Label.Factory().fontStyle(Font.BOLD).fontSize(30).create();
    public static final Label NUMBER_OF_PASSOWRDS_LABEL = new Label.Factory().create();
    public static final Label PASSWORD_LENGTH_LABEL = new Label.Factory().create();

    public static final TextArea TEXT_AREA = new TextArea.Factory().create();
    public static final ScrollPane SCROLL_PANE = new ScrollPane.Factory().textArea(TEXT_AREA).dimension(new Dimension(400, 300)).create();

    public static final CheckBox UPPER_CASE_CHECK_BOX = new CheckBox.Factory().create();
    public static final CheckBox LOWER_CASE_CHECK_BOX = new CheckBox.Factory().create();
    public static final CheckBox NUMERICS_CHECK_BOX = new CheckBox.Factory().create();
    public static final CheckBox SPECIAL_CHARACTERS_CHECK_BOX = new CheckBox.Factory().create();

    public static final TextField NUMBER_OF_PASSWORDS_TEXT_FIELD = new TextField.Factory().text("1").create();
    public static final TextField PASSWORD_LENGTH_TEXT_FIELD = new TextField.Factory().text("20").create();

    public static final Button GENERATE_BUTTON = new Button.Factory().dimension(new Dimension(120, 25)).create();

    public static final MenuItem ENGLISH_MENU_ITEM = new MenuItem.Factory().create();
    public static final MenuItem GERMAN_MENU_ITEM = new MenuItem.Factory().create();
    public static final MenuItem SAVE_MENU_ITEM = new MenuItem.Factory().create();
    public static final MenuItem HELP_MENU_ITEM = new MenuItem.Factory().create();

    public static final Menu FILE_MENU = new Menu.Factory().menuItems(SAVE_MENU_ITEM).create();
    public static final Menu SETTINGS_MENU = new Menu.Factory().menuItems(HELP_MENU_ITEM).create();
    public static final Menu LANGUAGE_MENU = new Menu.Factory().menuItems(ENGLISH_MENU_ITEM, GERMAN_MENU_ITEM).create();

    public static final MenuBar MENU_BAR = new MenuBar.Factory().menu(FILE_MENU, SETTINGS_MENU, LANGUAGE_MENU).create();


    private UIComponents() {
        throw new UnsupportedOperationException();
    }
}