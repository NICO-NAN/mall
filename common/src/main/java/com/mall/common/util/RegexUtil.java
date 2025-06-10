package com.mall.common.util;

import java.util.regex.Pattern;

public class RegexUtil {

    public static final String REGEX_MOBILE_SIMPLE = "^[1]\\d{10}$";

    private RegexUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isMobileSimple(final CharSequence input) {
            return isMatch(REGEX_MOBILE_SIMPLE, input);
        }

    public static boolean isMatch(final String regex, final CharSequence input) {
            return input != null && input.length() > 0 && Pattern.matches(regex, input);
        }

}
