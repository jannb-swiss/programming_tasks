package shape_calculator;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(10, 6);
        Square square = new Square(10, 30);

        System.out.println(triangle.calculate());
        System.out.println(square.calculate());

    }

}
