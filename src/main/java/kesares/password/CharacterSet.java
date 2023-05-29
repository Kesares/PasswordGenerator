package kesares.password;

public enum CharacterSet {

    UPPER_CASE_CHARACTERS("ABCDEFGHIJKLMNOPQRSTUVWXYZ"),
    LOWER_CASE_CHARACTERS("abcdefghijklmnopqrstuvwxyz"),
    NUMERIC_CHARACTERS("0123456789"),
    SPECIAL_CHARACTERS("_.+?#-*@!$%~/:;");

    private final String charPool;

    CharacterSet(String charPool) {
        this.charPool = charPool;
    }

    public static String getCharacterSets(CharacterSetOptions characterSetOptions) {
        StringBuilder builder = new StringBuilder();
        if (characterSetOptions.hasUpperCase()) builder.append(UPPER_CASE_CHARACTERS.charPool);
        if (characterSetOptions.hasLowerCase()) builder.append(LOWER_CASE_CHARACTERS.charPool);
        if (characterSetOptions.hasNumerics()) builder.append(NUMERIC_CHARACTERS.charPool);
        if (characterSetOptions.hasSpecialChars()) builder.append(SPECIAL_CHARACTERS.charPool);
        return builder.toString();
    }
}