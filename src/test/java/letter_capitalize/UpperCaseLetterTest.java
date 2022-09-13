package letter_capitalize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseLetterTest {

    UpperCaseLetter upperCaseLetter;

    @BeforeEach
    void init() {
        UpperCaseLetter upperCaseLetter = new UpperCaseLetter();
    }

    @Test
    void upperCase() {
        String str = upperCaseLetter.upperCase("hallo velo fahren");
        assertEquals("Hallo Velo Fahren", str);
    }
}