package binare_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void init() {
        Calculator calculator = new Calculator();
    }

    @Test
    void calculatorHex() throws NotBinaryException {

        String str = Calculator.calculatorHex("10010");
        assertEquals("12", str);

    }

    @Test
    void calculatorOktal() {

        String str = Calculator.calculatorOktal("10010");
        assertEquals("22", str);

    }

    @Test
    void calculatorDezimal() {

        int dez = Calculator.calculatorDezimal("10010");
        assertEquals(18, dez);

    }
}