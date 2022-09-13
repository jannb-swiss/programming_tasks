package binare_calculator;

public class Calculator {

    public static String calculatorHex(String str) throws NotBinaryException {


        if (!str.matches("[0-1]+")) {
            throw new NotBinaryException("Thats not binary, asshole!(!Exception!)");
        }


        int a2 = Integer.parseInt(str, 2);

        String a3 = Integer.toHexString(a2);

        return a3;
    }

    public static String calculatorOktal(String str) {

        int a2 = Integer.parseInt(str, 2);

        String a3 = Integer.toOctalString(a2);

        return a3;
    }

    public static int calculatorDezimal(String str) {

        int a2 = Integer.parseInt(str, 2);

        return a2;
    }

}
