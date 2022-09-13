package shape_calculator;

public class Triangle extends Shape {

    public Triangle(int height, int weight) {
        super(height, weight);
    }

    int a = getHeight();
    int b = getWeight();

    @Override
    public int calculate() {
        int c = a * b / 2;
        return c;
    }

}
