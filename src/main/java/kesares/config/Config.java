package kesares.config;

public final class Config {

    public static final int WIDTH = 450;
    public static final int HEIGHT = 460;
    public static final String VERSION = "v1.0.0";

    // Component settings
    public static final int TEXT_FIELD_WIDTH = 60;
    public static final int TEXT_FIELD_HEIGHT = 20;
    public static final int LABEL_FONT_SIZE = 12;
    public static final int LABEL_TITLE_FONT_SIZE = 30;
    public static final int TEXT_AREA_WIDTH = WIDTH - 50;
    public static final int TEXT_AREA_HEIGHT = HEIGHT - 160;
    public static final int BUTTON_WIDTH = 150;
    public static final int BUTTON_HEIGHT = 30;
    public static final String FONT = "Arial";

    private Config() {
        throw new UnsupportedOperationException();
    }
}