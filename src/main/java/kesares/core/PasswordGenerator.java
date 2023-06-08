package kesares.core;

import kesares.config.Config;
import kesares.display.Display;
import kesares.password.Password;
import kesares.password.PasswordProperties;

public class PasswordGenerator {

    private static final PasswordGenerator INSTANCE = new PasswordGenerator();

    private PasswordGenerator() {
        new Display(Config.WIDTH, Config.HEIGHT);
    }

    public static PasswordGenerator getInstance() {
        return INSTANCE;
    }

    public Password[] generatePasswords(PasswordProperties passwordProperties) {
        if (!passwordProperties.isRequirementsMet()) return new Password[0];

        Password[] passwords = new Password[passwordProperties.numberOfPasswords()];
        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = new Password(passwordProperties);
        }
        return passwords;
    }
}