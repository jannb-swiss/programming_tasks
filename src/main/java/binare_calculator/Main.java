package binare_calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner a = new Scanner(System.in);

        System.out.println("Gib eine Binäre Zahl ein");
        String a1 = a.nextLine();

        try {
            System.out.println(Calculator.calculatorHex(a1));
            System.out.println(Calculator.calculatorOktal(a1));
            System.out.println(Calculator.calculatorDezimal(a1));
        } catch (NotBinaryException e) {
            System.out.println(e.getMessage());
            System.out.println("Die Exception wir geworfen weil nicht der Wert 0 oder 1 eingegeben wurde.");
        }

        System.out.println("Das Programm läuft weiter!");

    }

}




