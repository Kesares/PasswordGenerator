package kesares.password;

public record CharacterSetOptions(boolean hasUpperCase, boolean hasLowerCase, boolean hasNumerics,
                                  boolean hasSpecialChars) {

    public boolean isAnyCharSetSelected() {
        return this.hasUpperCase || this.hasLowerCase || this.hasNumerics || this.hasSpecialChars;
    }
}