package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {
    @Test
    void ZeroIsEmptyString() {
        check(0, "");
        /*assertEquals("",new RomanNumeral(0).toString());*/
    }

    @Test

    void OneIsI() {
        check(1, "I");
    }

    @Test
    void TwoIsII() {
        check(2,"II");
    }

    @Test
    void TreeIsIII() {
        check(3,"III");
    }

    @Test
    void FiveIsV() {
        check(5,"V");
    }

    @Test
    void ElevenIsXI() { check(11,"XI");}

    @Test
    void NinetyOneisXCI(){check(91,"XCI");}

    @Test
    void OneUndredone(){check(101,"CI");}

    @Test
    void test(){
        check(1101,"MCI");
    }

    private void check(int i, String s) {
        RomanNumeral romanNumeral = new RomanNumeral(i);
        assertEquals(s, romanNumeral.toString());
    }

}
