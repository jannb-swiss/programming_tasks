package shape_calculator;

public abstract class Shape implements GeometricShape{

    private int Height;
    private int Weight;

    public Shape(int height, int weight) {
        Height = height;
        Weight = weight;
    }

    public int getHeight() {
        return Height;
    }

    public int getWeight() {
        return Weight;
    }

}
