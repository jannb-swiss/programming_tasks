package shape_calculator;

public class Square extends Shape {

    public Square(int height, int weight) {
        super(height, weight);
    }

    int a = getHeight();
    int b = getWeight();

    @Override
    public int calculate() {
        int c = a * b;
        return c;
    }
}
