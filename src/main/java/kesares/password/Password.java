package kesares.password;

import java.security.SecureRandom;

public class Password {

    private final int length;
    private final CharacterSetOptions characterSetOptions;
    private final String password;

    public Password(PasswordProperties properties) {
        this.length = properties.getPasswordLength();
        this.characterSetOptions = properties.getCharacterSetOptions();
        this.password = this.generatePassword();
    }

    private String generatePassword() {
        StringBuilder builder = new StringBuilder();
        SecureRandom random = new SecureRandom();
        String characters = CharacterSet.getCharacterSets(this.characterSetOptions);

        for (int i = 0; i < this.length; i++) {
            builder.append(characters.charAt(random.nextInt(characters.length())));
        }
        return builder.toString();
    }

    public String getPassword() {
        return password;
    }
}