package kesares.password;

public class CharacterSetOptions {

    private final boolean hasUpperCase;
    private final boolean hasLowerCase;
    private final boolean hasNumerics;
    private final boolean hasSpecialChars;

    public CharacterSetOptions(boolean hasUpperCase, boolean hasLowerCase, boolean hasNumerics, boolean hasSpecialChars) {
        this.hasUpperCase = hasUpperCase;
        this.hasLowerCase = hasLowerCase;
        this.hasNumerics = hasNumerics;
        this.hasSpecialChars = hasSpecialChars;
    }

    public boolean hasUpperCase() {
        return hasUpperCase;
    }

    public boolean hasLowerCase() {
        return hasLowerCase;
    }

    public boolean hasNumerics() {
        return hasNumerics;
    }

    public boolean hasSpecialChars() {
        return hasSpecialChars;
    }

    public boolean isAnyCharSetSelected() {
        return this.hasUpperCase || this.hasLowerCase || this.hasNumerics || this.hasSpecialChars;
    }
}