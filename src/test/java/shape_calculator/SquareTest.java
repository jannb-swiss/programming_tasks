package shape_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square;

    @BeforeEach
    void init() {
        square = new Square(10, 5);
    }

    @Test
    void calculate() {
        int a = square.calculate();
        assertEquals(50, a);
    }
}