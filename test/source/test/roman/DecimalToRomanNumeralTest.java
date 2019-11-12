package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {
    @Test
    void ZeroIsEmptyString() {
        RomanNumeral romanNumeral = new RomanNumeral(0);
        assertEquals("",romanNumeral.toString());
    }

    @Test
    void OneIsI() {
        RomanNumeral romanNumeral = new RomanNumeral(1);
        assertEquals("I",romanNumeral.toString());
    }
}
