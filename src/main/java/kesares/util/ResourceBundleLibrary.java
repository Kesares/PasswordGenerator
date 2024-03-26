package kesares.util;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

public class ResourceBundleLibrary {

    public static final String DISPLAY_BUNDLE = "display";

    private static final ResourceBundleLibrary INSTANCE = new ResourceBundleLibrary();

    private final Map<String, ResourceBundle> resourceBundles;

    private ResourceBundleLibrary() {
        this.resourceBundles = new HashMap<>();
        this.loadResourceBundles(Locale.ENGLISH);
    }

    public static ResourceBundleLibrary getInstance() {
        return INSTANCE;
    }

    public void loadResourceBundles(Locale locale) {
        Locale.setDefault(locale);
        this.resourceBundles.put(DISPLAY_BUNDLE, ResourceBundle.getBundle("lang.Display"));
    }

    public ResourceBundle getResourceBundle(String key) {
        return this.resourceBundles.get(key);
    }
}
