package shape_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle;

    @BeforeEach
    void init() {
        triangle = new Triangle(50, 10);
    }

    @Test
    void calculate() {
        int a = triangle.calculate();
        assertEquals(250, a);
    }
}