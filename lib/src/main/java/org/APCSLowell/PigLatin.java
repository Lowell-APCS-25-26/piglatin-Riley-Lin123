package org.APCSLowell;

public class PigLatin {

    public static int findFirstVowel(String sWord) {
        for (int j = 0; j < sWord.length(); j++) {
            String letter = sWord.substring(j, j + 1);
            if (letter.equals("a") || letter.equals("e") ||
                letter.equals("i") || letter.equals("o") ||
                letter.equals("u")) {
                return j;
            }
        }
        return -1;
    }

    public static String pigLatin(String sWord) {
        int position = findFirstVowel(sWord);

        if (sWord.length() == 1) {
            if (position == 0) {
                return sWord + "way";
            } else {
                return sWord + "ay";
            }
        }

        if (position == 1 &&
            sWord.substring(0, 1).equals("q") &&
            sWord.substring(1, 2).equals("u")) {
            return sWord.substring(2) + "quay";
        }

        if (position == 0) {
            return sWord + "way";
        }

        if (position > 0) {
            return sWord.substring(position) +
                   sWord.substring(0, position) + "ay";
        }

        return sWord + "ay"; // no vowels case
    }
}
