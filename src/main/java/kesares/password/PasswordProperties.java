package kesares.password;

public class PasswordProperties {

    private final int numberOfPasswords;
    private final int passwordLength;
    private final CharacterSetOptions characterSetOptions;

    public PasswordProperties(int numberOfPasswords, int passwordLength, CharacterSetOptions characterSetOptions) {
        this.numberOfPasswords = numberOfPasswords;
        this.passwordLength = passwordLength;
        this.characterSetOptions = characterSetOptions;
    }

    public int getNumberOfPasswords() {
        return numberOfPasswords;
    }

    public int getPasswordLength() {
        return passwordLength;
    }

    public CharacterSetOptions getCharacterSetOptions() {
        return characterSetOptions;
    }

    public boolean isRequirementsMet() {
        return this.characterSetOptions.isAnyCharSetSelected() && this.hasMinimumLength() && this.hasMinimumNumberOfPasswords();
    }

    public boolean hasMinimumLength() {
        return this.passwordLength > 0;
    }

    public boolean hasMinimumNumberOfPasswords() {
        return this.numberOfPasswords > 0;
    }
}