package kesares.util;

import javax.swing.*;

public class Parser {

    private Parser() {
        throw new UnsupportedOperationException();
    }

    public static int parseInt(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "'" + num + "' is not a number!",
                "NumberFormatException!",
                JOptionPane.ERROR_MESSAGE
            );
        }
        return 0;
    }
}