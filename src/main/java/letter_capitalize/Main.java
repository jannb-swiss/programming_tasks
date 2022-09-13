package letter_capitalize;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Gib einen Satz ein:");
        String str = a.nextLine();

        System.out.println(UpperCaseLetter.upperCase(str));

    }

}
