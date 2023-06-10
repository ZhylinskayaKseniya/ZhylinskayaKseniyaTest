package Core.Utils;

import java.util.Random;

public class RandomUtils {
    private static final String EMAILALLOWEDCHARS = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final String ONLYCHARS = "abcdefghijklmnopqrstuvwxyz";

    private static final String ONLYNUMBERS = "123456789";

    public static String getRandomEmail(int length) {
        return String.format("%s%s@yopmail.com", "aqa.", getRandom(EMAILALLOWEDCHARS, length));
    }

    public static String getRandomString(int length) {
        return getRandom(ONLYCHARS, length);
    }

    public static String getAQARandomString(int length) {
        return "aqa-" + getRandom(ONLYCHARS, length);
    }

    public static String getRandomNumbers(int length) {
        return getRandom(ONLYNUMBERS, length);
    }

    private static String getRandom(String allowedChars, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(allowedChars.charAt(new Random().nextInt(allowedChars.length())));
        }
        return sb.toString();
    }
}
