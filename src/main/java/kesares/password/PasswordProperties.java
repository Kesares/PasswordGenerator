package kesares.password;

public record PasswordProperties(int numberOfPasswords, int passwordLength, CharacterSetOptions characterSetOptions) {

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