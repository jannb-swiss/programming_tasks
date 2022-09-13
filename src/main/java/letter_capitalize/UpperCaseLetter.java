package letter_capitalize;

import java.util.Scanner;

public class UpperCaseLetter {

    public static String upperCase(String str) {

        String upperCaseLine = "";

        Scanner lineScan = new Scanner(str);

        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upperCaseLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }

        return upperCaseLine.trim();
    }

}
