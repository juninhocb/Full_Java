package com.keywords;

/**
 * final[17], for [20]
 *
 */
public class KeyPassword {
    private static final int ITERTATORS = 30;

    public static int getNumberSecret(int val) {
        int result = 1;
        for (int i = 0; i < ITERTATORS; i++) {
            result += val*i;
        }
        return result;
    }

}
