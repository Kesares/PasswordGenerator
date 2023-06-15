package kesares.config;

import java.awt.*;

public final class Config {

    public static final int WIDTH = 450;
    public static final int HEIGHT = 460;
    public static final String VERSION = "v1.0.0";

    public static final Color PANEL_BACKGROUND_COLOR = new Color(0x2b2b2b);

    public static final Color BUTTON_BACKGROUND_COLOR = new Color(0x3c3f41);
    public static final Color BUTTON_FOREGROUND_COLOR = Color.LIGHT_GRAY;

    public static final Color CHECK_BOX_BACKGROUND_COLOR = PANEL_BACKGROUND_COLOR;
    public static final Color CHECK_BOX_FOREGROUND_COLOR = BUTTON_FOREGROUND_COLOR;

    public static final Color TEXT_AREA_BACKGROUND_COLOR = BUTTON_BACKGROUND_COLOR;
    public static final Color TEXT_AREA_FOREGRUND_COLOR = BUTTON_FOREGROUND_COLOR;

    public static final Color TEXT_FIELD_BACKGROUND_COLOR = BUTTON_BACKGROUND_COLOR;
    public static final Color TEXT_FIELD_FOREGROUND_COLOR = BUTTON_FOREGROUND_COLOR;

    public static final Color LABEL_COLOR = BUTTON_FOREGROUND_COLOR;

    private Config() {
        throw new UnsupportedOperationException();
    }
}